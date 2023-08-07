/**
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
*/
// *********************************************************************
// THIS FILE IS AUTO GENERATED!
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING.
// *********************************************************************
package com.vk.sdk.api.classifieds.dto

import com.google.gson.annotations.SerializedName
import com.vk.dto.common.id.UserId
import kotlin.String

/**
 * @param id - Community ID
 * @param name - Community name
 * @param photo50 - URL of square photo of the community with 50 pixels in width
 * @param photo100 - URL of square photo of the community with 100 pixels in width
 * @param photo200 - URL of square photo of the community with 200 pixels in width
 * @param photoBase - Base URL of square photo of the community
 * @param url - Community url
 */
data class ClassifiedsYoulaCarouselBlockGroupDto(
    @SerializedName("id")
    val id: UserId,
    @SerializedName("name")
    val name: String,
    @SerializedName("photo_50")
    val photo50: String,
    @SerializedName("photo_100")
    val photo100: String,
    @SerializedName("photo_200")
    val photo200: String,
    @SerializedName("photo_base")
    val photoBase: String,
    @SerializedName("url")
    val url: String
)
