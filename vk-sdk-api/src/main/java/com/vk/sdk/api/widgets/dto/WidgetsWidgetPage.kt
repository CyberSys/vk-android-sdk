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
package com.vk.sdk.api.widgets.dto

import com.google.gson.annotations.SerializedName
import com.vk.sdk.api.base.dto.BaseObjectCount
import kotlin.Int
import kotlin.String

/**
 * @param comments no description
 * @param date Date when widgets on the page has been initialized firstly in Unixtime
 * @param description Page description
 * @param id Page ID
 * @param likes no description
 * @param pageId page_id parameter value
 * @param photo URL of the preview image
 * @param title Page title
 * @param url Page absolute URL
 */
data class WidgetsWidgetPage(
    @SerializedName(value="comments")
    val comments: BaseObjectCount? = null,
    @SerializedName(value="date")
    val date: Int? = null,
    @SerializedName(value="description")
    val description: String? = null,
    @SerializedName(value="id")
    val id: Int? = null,
    @SerializedName(value="likes")
    val likes: BaseObjectCount? = null,
    @SerializedName(value="page_id")
    val pageId: String? = null,
    @SerializedName(value="photo")
    val photo: String? = null,
    @SerializedName(value="title")
    val title: String? = null,
    @SerializedName(value="url")
    val url: String? = null
)
