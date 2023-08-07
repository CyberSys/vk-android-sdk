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
import com.vk.sdk.api.base.dto.BaseBoolIntDto
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * @param type
 * @param id - Application ID
 * @param title - Application title
 * @param authorUrl - Application author's URL
 * @param banner1120 - URL of the app banner with 1120 px in width
 * @param banner560 - URL of the app banner with 560 px in width
 * @param icon16 - URL of the app icon with 16 px in width
 * @param isNew - Is new flag
 * @param pushEnabled - Is push enabled
 * @param friends
 * @param catalogPosition - Catalog position
 * @param description - Application description
 * @param genre - Genre name
 * @param genreId - Genre ID
 * @param international - Information whether the application is multilanguage
 * @param isInCatalog - Information whether application is in mobile catalog
 * @param leaderboardType
 * @param membersCount - Members number
 * @param platformId - Application ID in store
 * @param publishedDate - Date when the application has been published in Unixtime
 * @param screenName - Screen name
 * @param section - Application section name
 * @param authorOwnerId - Application author's ID
 * @param isInstalled - Is application installed
 * @param icon139 - URL of the app icon with 139 px in width
 * @param icon150 - URL of the app icon with 150 px in width
 * @param icon278 - URL of the app icon with 278 px in width
 * @param icon576 - URL of the app icon with 576 px in width
 * @param backgroundLoaderColor - Hex color code without hash sign
 * @param loaderIcon - SVG data
 * @param icon75 - URL of the app icon with 75 px in width
 * @param openInExternalBrowser - Open in external browser
 * @param screenOrientation - Screen orientation
 */
data class AppsAppDto(
    @SerializedName("type")
    val type: AppsAppTypeDto,
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("author_url")
    val authorUrl: String? = null,
    @SerializedName("banner_1120")
    val banner1120: String? = null,
    @SerializedName("banner_560")
    val banner560: String? = null,
    @SerializedName("icon_16")
    val icon16: String? = null,
    @SerializedName("is_new")
    val isNew: BaseBoolIntDto? = null,
    @SerializedName("push_enabled")
    val pushEnabled: BaseBoolIntDto? = null,
    @SerializedName("friends")
    val friends: List<Int>? = null,
    @SerializedName("catalog_position")
    val catalogPosition: Int? = null,
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("genre")
    val genre: String? = null,
    @SerializedName("genre_id")
    val genreId: Int? = null,
    @SerializedName("international")
    val international: Boolean? = null,
    @SerializedName("is_in_catalog")
    val isInCatalog: Int? = null,
    @SerializedName("leaderboard_type")
    val leaderboardType: AppsAppLeaderboardTypeDto? = null,
    @SerializedName("members_count")
    val membersCount: Int? = null,
    @SerializedName("platform_id")
    val platformId: String? = null,
    @SerializedName("published_date")
    val publishedDate: Int? = null,
    @SerializedName("screen_name")
    val screenName: String? = null,
    @SerializedName("section")
    val section: String? = null,
    @SerializedName("author_owner_id")
    val authorOwnerId: Int? = null,
    @SerializedName("is_installed")
    val isInstalled: Boolean? = null,
    @SerializedName("icon_139")
    val icon139: String? = null,
    @SerializedName("icon_150")
    val icon150: String? = null,
    @SerializedName("icon_278")
    val icon278: String? = null,
    @SerializedName("icon_576")
    val icon576: String? = null,
    @SerializedName("background_loader_color")
    val backgroundLoaderColor: String? = null,
    @SerializedName("loader_icon")
    val loaderIcon: String? = null,
    @SerializedName("icon_75")
    val icon75: String? = null,
    @SerializedName("open_in_external_browser")
    val openInExternalBrowser: Boolean? = null,
    @SerializedName("screen_orientation")
    val screenOrientation: Int? = null
)
