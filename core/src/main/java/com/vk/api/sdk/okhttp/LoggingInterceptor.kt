/*******************************************************************************
 * The MIT License (MIT)
 *
 * Copyright (c) 2019 vk.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
package com.vk.api.sdk.okhttp

import com.vk.api.sdk.utils.SecureInfoStripper
import com.vk.api.sdk.utils.log.Logger
import com.vk.api.sdk.utils.log.Logger.LogLevel
import com.vk.api.sdk.utils.threadLocal
import okhttp3.Interceptor
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.logging.HttpLoggingInterceptor.Level

open class LoggingInterceptor(
    private val filterCredentials: Boolean,
    private val keysToFilter: Collection<String>,
    private val logger: Logger,
    private val loggingPrefixer: LoggingPrefixer
) : Interceptor {
    // For backward compatibility
    constructor(filterCredentials: Boolean, logger: Logger) : this(
        filterCredentials,
        listOf(
            "access_token",
            "key",
            "client_secret",
            "webview_access_token",
            "webview_refresh_token",
            "exchange_token",
            "exchange_tokens",
            "common_token"
        ),
        logger,
        DefaultLoggingPrefixer()
    )

    constructor(filterCredentials: Boolean, keysToFilter: Collection<String>, logger: Logger) : this(
        filterCredentials,
        keysToFilter,
        logger,
        DefaultLoggingPrefixer()
    )

    constructor(filterCredentials: Boolean, logger: Logger, loggingPrefixer: LoggingPrefixer) : this(
        filterCredentials,
        listOf(
            "access_token",
            "key",
            "client_secret",
            "webview_access_token",
            "webview_refresh_token",
            "exchange_token",
            "exchange_tokens",
            "common_token"
        ),
        logger,
        loggingPrefixer
    )

    private val secureInfoStripper: SecureInfoStripper by lazy {
        SecureInfoStripper.generateBaseStripper(keysToFilter)
    }

    // {"key":[a-z0-9._-]+,"value":...} key extractor from message hidden by regex above
    private val kvKeysExtractorPattern: Regex by lazy {
        Regex("\\{\"key\":\"(${SecureInfoStripper.SENSITIVE_VALUE_PATTERN})\",\"value\":\"[^\"]*\"", RegexOption.IGNORE_CASE)
    }
    // {"key":<HIDE>,"value":[a-z0-9]+} restores hidden key name
    private val kvKeysRestorePattern: Regex by lazy {
        Regex("(\\{\"key\":)<HIDE>(,\"value\":\"[^\"]*\")", RegexOption.IGNORE_CASE)
    }
    private val restoreKVKeysTransformer: (MatchResult, String) -> CharSequence by lazy {
        { match: MatchResult, key: String ->
            "${match.groupValues[1]}\"$key\"${match.groupValues[2]}"
        }
    }

    private var prefix = ThreadLocal<String>()

    private val delegate by threadLocal {
        HttpLoggingInterceptor(object : HttpLoggingInterceptor.Logger {
            override fun log(message: String) {
                val messageWithPrefix = prefix.get()?.let { "$it $message" } ?: message
                val finalMessage = if (filterCredentials) filterCredentials(messageWithPrefix) else messageWithPrefix
                logger.log(logger.logLevel.value, finalMessage)
            }

            private fun filterCredentials(msg: String): String {
                return removeSensitiveKeys(msg)
            }
        })
    }

    override fun intercept(chain: Interceptor.Chain): Response {
        // Do not log big bodies because of probability of OutOfMemoryError
        val request = chain.request()
        val bodyLength = request.body?.contentLength() ?: 0
        val logLevel = request.tag(LogLevelRequestTag::class.java)?.level ?: logger.logLevel.value

        delegate.level = when {
            bodyLength > Logger.LOGGER_ENTRY_MAX_LEN || bodyLength <= 0 -> levelsMap[minOf(LogLevel.WARNING.level, logLevel.level)]
            else -> levelsMap[logLevel.level]
        }!!
        prefix.set(loggingPrefixer.getPrefix())
        return proceedLoggingChain(chain, delegate)
    }

    protected open fun proceedLoggingChain(chain: Interceptor.Chain, logInterceptor: Interceptor): Response =
        logInterceptor.intercept(chain)

    // extracting keys, which will be hidden by sensitiveKeysResponseRegex ({"key":"keyname","value":...})
    // applying sensitiveKeysRequestRegex + sensitiveKeysResponseRegex
    // restoring key names in a message which have been hidden
    // applies sensitiveKeyValuesResponseRegex
    private fun removeSensitiveKeys(msg: String): String {
        val hiddenKVKeys = kvKeysExtractorPattern.findAll(msg)
            .map { it.groupValues[1].lowercase() }
            .iterator()

        return secureInfoStripper.strip(msg)
            .replace(kvKeysRestorePattern) { matchResult: MatchResult ->
                restoreKVKeysTransformer(matchResult, hiddenKVKeys.next())
            }
    }

    private companion object {
        private val levelsMap = mapOf(
                LogLevel.NONE.level to Level.NONE,
                LogLevel.ERROR.level to Level.NONE,
                LogLevel.WARNING.level to Level.BASIC,
                LogLevel.DEBUG.level to Level.HEADERS,
                LogLevel.VERBOSE.level to Level.BODY,
                LogLevel.NONE.level to Level.NONE,
        )
    }
}