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

package com.vk.api.sdk.chain

import com.vk.api.sdk.VKApiValidationHandler
import com.vk.api.sdk.VKApiManager
import com.vk.api.sdk.exceptions.VKApiException
import com.vk.api.sdk.exceptions.VKApiExecutionException
import java.util.concurrent.CountDownLatch

class ValidationHandlerChainCall<T>(
    manager: VKApiManager,
    retryLimit: Int,
    val chain: ChainCall<T>,
    private val validationLock: VKApiValidationHandler.ValidationLock
) : RetryChainCall<T>(manager, retryLimit) {
    @Throws(Exception::class)
    override fun call(args: ChainArgs): T? {
        for (i in 0..retryLimit) {
            try {
                validationLock.await()
                val response = chain.call(args)
                handleCaptchaSolved(args)
                return response
            } catch (ex: VKApiExecutionException) {
                handleException(ex, args)
            }
        }
        throw VKApiException("Can't confirm validation due to retry limit!")
    }

    @Throws(Exception::class)
    private fun handleException(ex: VKApiExecutionException, args: ChainArgs) {
        handleCaptchaSolved(args, ex)
        when {
            ex.isCaptchaError -> handleCaptcha(ex, args)
            ex.isValidationRequired -> handleValidation(ex)
            ex.isUserConfirmRequired -> handleUserConfirmation(ex, args)
            else -> manager.validationHandler?.tryToHandleException(ex, manager) ?: throw ex
        }
    }

    private fun handleUserConfirmation(ex: VKApiExecutionException, args: ChainArgs) {
        val confirmation = awaitValidation(ex.userConfirmText, manager.validationHandler, VKApiValidationHandler::handleConfirm)
        when (confirmation) {
            null -> throw ex
            false -> throw ex
            else -> {
                args.userConfirmed = confirmation
            }
        }
    }

    private fun handleValidation(ex: VKApiExecutionException) {
        val credentials = awaitValidation(ex.validationUrl, manager.validationHandler, VKApiValidationHandler::handleValidation)
        persistToken(credentials, ex)
    }

    protected fun persistToken(credentials: VKApiValidationHandler.Credentials?, ex: VKApiExecutionException) {
        when {
            credentials == VKApiValidationHandler.Credentials.EMPTY -> {
                //no need to update credentials use current
            }
            credentials?.isValid == true -> manager.setCredentials(credentials.token!!, credentials.secret, credentials.expiresInSec, credentials.createdMs)
            else -> throw ex
        }
    }

    private fun handleCaptcha(ex: VKApiExecutionException, args: ChainArgs) {
        val captcha = VKApiValidationHandler.Captcha(ex.captchaImg, ex.captchaHeight, ex.captchaWidth)
        val captchaResult = awaitValidation(captcha, manager.validationHandler, VKApiValidationHandler::handleCaptcha)
        when (captchaResult) {
            null -> throw ex
            else -> {
                args.captchaSid = ex.captchaSid
                args.captchaKey = captchaResult
            }
        }
    }

    protected fun <T, H, E> awaitValidation(extra: E, handler: H?, handlerMethod: H.(E, VKApiValidationHandler.Callback<T>) -> Unit): T? {
        if (handler == null || !validationLock.acquire()) {
            return null
        }

        val callback = VKApiValidationHandler.Callback<T>(validationLock)
        handler.handlerMethod(extra, callback)
        validationLock.await()
        return callback.value
    }

    private fun handleCaptchaSolved(args: ChainArgs, ex: VKApiExecutionException? = null) {
        if (args.hasCaptcha() && (ex == null || !ex.isCaptchaError)) {
            manager.validationHandler?.handleCaptchaSolved()
        }
    }
}