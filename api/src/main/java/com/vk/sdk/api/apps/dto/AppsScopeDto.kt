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
package com.vk.sdk.api.apps.dto

import com.google.gson.annotations.SerializedName
import kotlin.String

/**
 * Scope description
 * @param name - Scope name
 * @param title - Scope title
 */
data class AppsScopeDto(
    @SerializedName("name")
    val name: AppsScopeDto.NameDto,
    @SerializedName("title")
    val title: String? = null
) {
    enum class NameDto(
        val value: String
    ) {
        @SerializedName("friends")
        FRIENDS("friends"),

        @SerializedName("photos")
        PHOTOS("photos"),

        @SerializedName("video")
        VIDEO("video"),

        @SerializedName("pages")
        PAGES("pages"),

        @SerializedName("status")
        STATUS("status"),

        @SerializedName("notes")
        NOTES("notes"),

        @SerializedName("wall")
        WALL("wall"),

        @SerializedName("docs")
        DOCS("docs"),

        @SerializedName("groups")
        GROUPS("groups"),

        @SerializedName("stats")
        STATS("stats"),

        @SerializedName("market")
        MARKET("market"),

        @SerializedName("stories")
        STORIES("stories"),

        @SerializedName("app_widget")
        APP_WIDGET("app_widget"),

        @SerializedName("messages")
        MESSAGES("messages"),

        @SerializedName("manage")
        MANAGE("manage"),

        @SerializedName("notify")
        NOTIFY("notify"),

        @SerializedName("audio")
        AUDIO("audio"),

        @SerializedName("support")
        SUPPORT("support"),

        @SerializedName("menu")
        MENU("menu"),

        @SerializedName("wallmenu")
        WALLMENU("wallmenu"),

        @SerializedName("ads")
        ADS("ads"),

        @SerializedName("offline")
        OFFLINE("offline"),

        @SerializedName("notifications")
        NOTIFICATIONS("notifications"),

        @SerializedName("email")
        EMAIL("email"),

        @SerializedName("adsweb")
        ADSWEB("adsweb"),

        @SerializedName("leads")
        LEADS("leads"),

        @SerializedName("group_messages")
        GROUP_MESSAGES("group_messages"),

        @SerializedName("exchange")
        EXCHANGE("exchange"),

        @SerializedName("phone")
        PHONE("phone");
    }
}
