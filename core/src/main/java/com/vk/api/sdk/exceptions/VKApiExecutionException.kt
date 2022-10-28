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

package com.vk.api.sdk.exceptions

import android.os.Bundle
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject

/**
 * See [https://vk.com/dev/errors](https://vk.com/dev/errors)
 */
open class VKApiExecutionException
@JvmOverloads constructor(
        val code: Int,
        val apiMethod: String,
        val hasLocalizedMessage: Boolean,
        val detailMessage: String,
        val extra: Bundle? = Bundle.EMPTY,
        val executeErrors: List<VKApiExecutionException>? = null,
        val errorMsg: String? = null,
        val requestParams: Map<String, String>? = null,
        val subcode: Int = -1,
) : VKApiException(detailMessage) {

    val isAnonymTokenInvalid: Boolean
        get() = code == VKApiCodes.CODE_ANONYM_TOKEN_INVALID

    val isAnonymTokenExpired: Boolean
        get() = code == VKApiCodes.CODE_ANONYM_TOKEN_EXPIRED

    val isCompositeError: Boolean
        get() = code == VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR

    val isChatDoesNotExistError: Boolean
        get() = code == VKApiCodes.CODE_CHAT_DOES_NOT_EXIST

    val isAccessError: Boolean
        get() {
            return when (code) {
                VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM,
                VKApiCodes.CODE_ACCESS_DENIED_TO_AUDIO,
                VKApiCodes.CODE_PRIVATE_PROFILE,
                VKApiCodes.CODE_ACCESS_DENIED,
                VKApiCodes.CODE_ACCESS_DENIED_TO_GROUP -> true
                else -> false
            }
        }

    val isInternalServerError: Boolean
        get() {
            return when (code) {
                VKApiCodes.CODE_UNKNOWN_ERROR,
                VKApiCodes.CODE_INTERNAL_SERVER_ERROR,
                VKApiCodes.CODE_INTERNAL_EXECUTE_ERROR -> true
                else -> false
            }
        }

    val isTooManyRequestsError: Boolean
        get() {
            return when (code) {
                VKApiCodes.CODE_TOO_MANY_REQUESTS_PER_SECOND -> true
                else -> false
            }
        }

    val isInvalidCredentialsError: Boolean
        get() {
            return when (code) {
                VKApiCodes.CODE_INVALID_SIGNATURE,
                VKApiCodes.CODE_AUTHORIZATION_FAILED,
                VKApiCodes.CODE_ERROR_USER_DEACTIVATED -> true
                else -> false
            }
        }

    val isAppUpdateNeeded: Boolean
        get() = code == VKApiCodes.CODE_CLIENT_UPDATE_NEEDED

    val isCurrentVersionDeprecated: Boolean
        get() = code == VKApiCodes.CODE_CLIENT_VERSION_DEPRECATED

    val isUserConfirmRequired: Boolean
        get() = code == VKApiCodes.CODE_USER_CONFIRM_REQUIRED

    val isTokenConfirmationRequired: Boolean
        get() = code == VKApiCodes.CODE_TOKEN_CONFIRMATION_REQUIRED

    val isValidationRequired: Boolean
        get() = code == VKApiCodes.CODE_USER_VALIDATION_REQUIRED

    val isCaptchaError: Boolean
        get() = code == VKApiCodes.CODE_CAPTCHA_REQUIRED

    val isPasswordConfirmRequired: Boolean
        get() = code == VKApiCodes.CODE_ERROR_NEED_TOKEN_EXTENSION

    val isRateLimitReachedError: Boolean
        get() = code == VKApiCodes.CODE_RATE_LIMIT_REACHED

    val isAccessTokenExpired: Boolean
        get() = code == VKApiCodes.CODE_ACCESS_TOKEN_EXPIRED

    val captchaSid: String
        get() = extra?.getString(VKApiCodes.EXTRA_CAPTCHA_SID, "") ?: ""

    val captchaImg: String
        get() = extra?.getString(VKApiCodes.EXTRA_CAPTCHA_IMG, "") ?: ""

    val captchaHeight: Int
        get() = extra?.getInt(VKApiCodes.EXTRA_CAPTCHA_IMG_HEIGHT, -1) ?: -1

    val captchaWidth: Int
        get() = extra?.getInt(VKApiCodes.EXTRA_CAPTCHA_IMG_WIDTH, -1) ?: -1

    val validationUrl: String
        get() = extra?.getString(VKApiCodes.EXTRA_VALIDATION_URL, "") ?: ""

    val userConfirmText: String
        get() = extra?.getString(VKApiCodes.EXTRA_CONFIRMATION_TEXT, "") ?: ""

    val userBanInfo: JSONObject?
        get() = extra?.getString(VKApiCodes.EXTRA_USER_BAN_INFO)?.let { JSONObject(it) }

    val extensionHash: String
        get() = extra?.getString(VKApiCodes.EXTRA_EXTENSION_HASH, null) ?: ""

    val accessToken: String?
        get() = extra?.getString(VKApiCodes.EXTRA_ACCESS_TOKEN, null)

    fun hasExtra(): Boolean {
        return extra != null && extra != Bundle.EMPTY
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VKApiExecutionException) return false
        val that = other as VKApiExecutionException?
        return if (code != that!!.code) false else !if (extra != null) extra != that.extra else that.extra != null
    }

    override fun hashCode(): Int {
        var result = code
        result = 31 * result + (extra?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String {
        val printableExtra = when {
            extra?.containsKey(VKApiCodes.EXTRA_ACCESS_TOKEN) == true -> Bundle(extra).apply {
                putString(VKApiCodes.EXTRA_ACCESS_TOKEN, "hidden")
            }
            else -> extra
        }

        return "VKApiExecutionException{" +
                "code=$code" +
                ", extra=$printableExtra" +
                ", method=$apiMethod" +
                ", executeErrors=" + executeErrors?.joinToString(prefix = "[", postfix = "]") +
                ", super=" + super.toString() +
                '}'.toString()
    }

    fun hasError(errorCode: Int): Boolean {
        if (code == errorCode) return true
        if (executeErrors?.find { it.code == errorCode } != null) return true
        return false
    }

    companion object {
        internal const val serialVersionUID = 7524047853274172872L

        @JvmOverloads
        fun parse(json: JSONObject, methodName: String? = null, extra: Bundle? = null): VKApiExecutionException {
            val method = methodName ?: json.optString("method") ?: ""
            val code = json.optInt("error_code", VKApiCodes.CODE_UNKNOWN_ERROR)
            val subcode = json.optInt("error_subcode", VKApiCodes.CODE_UNKNOWN_ERROR)
            val errorMsg = json.optString("error_msg") ?: ""
            val requestParams = try {
                json.getJSONArray("request_params")
            } catch (e: JSONException) {
                JSONArray()
            }

            val paramsMap = (0 until requestParams.length())
                    .associate {
                        val param = requestParams.getJSONObject(it)
                        param.getString("key") to param.getString("value")
                    }
            return if (json.has("error_text")) {
                VKApiExecutionException(code, method, true, json.optString("error_text")
                        ?: "", extra, errorMsg = errorMsg, requestParams = paramsMap, subcode = subcode)
            } else {
                val errorMsg = json.optString("error_msg") ?: json.toString()
                VKApiExecutionException(code, method, false, "$errorMsg | by [$method]", extra, errorMsg = errorMsg, requestParams = paramsMap, subcode = subcode)
            }
        }
    }

}