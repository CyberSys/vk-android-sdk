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
package com.vk.sdk.api.users.dto

import com.google.gson.annotations.SerializedName
import com.vk.dto.common.id.UserId
import com.vk.sdk.api.base.dto.BaseBoolIntDto
import com.vk.sdk.api.base.dto.BaseSexDto
import com.vk.sdk.api.friends.dto.FriendsFriendStatusStatusDto
import com.vk.sdk.api.friends.dto.FriendsRequestsMutualDto
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * @param id - User ID
 * @param sex - User sex
 * @param screenName - Domain name of the user's page
 * @param photo50 - URL of square photo of the user with 50 pixels in width
 * @param photo100 - URL of square photo of the user with 100 pixels in width
 * @param onlineInfo
 * @param online - Information whether the user is online
 * @param onlineMobile - Information whether the user is online in mobile site or application
 * @param onlineApp - Application ID
 * @param verified - Information whether the user is verified
 * @param trending - Information whether the user has a "fire" pictogram.
 * @param friendStatus
 * @param mutual
 * @param deactivated - Returns if a profile is deleted or blocked
 * @param firstName - User first name
 * @param hidden - Returns if a profile is hidden.
 * @param lastName - User last name
 * @param canAccessClosed
 * @param isClosed
 */
data class UsersUserDto(
    @SerializedName("id")
    val id: UserId,
    @SerializedName("sex")
    val sex: BaseSexDto? = null,
    @SerializedName("screen_name")
    val screenName: String? = null,
    @SerializedName("photo_50")
    val photo50: String? = null,
    @SerializedName("photo_100")
    val photo100: String? = null,
    @SerializedName("online_info")
    val onlineInfo: UsersOnlineInfoDto? = null,
    @SerializedName("online")
    val online: BaseBoolIntDto? = null,
    @SerializedName("online_mobile")
    val onlineMobile: BaseBoolIntDto? = null,
    @SerializedName("online_app")
    val onlineApp: Int? = null,
    @SerializedName("verified")
    val verified: BaseBoolIntDto? = null,
    @SerializedName("trending")
    val trending: BaseBoolIntDto? = null,
    @SerializedName("friend_status")
    val friendStatus: FriendsFriendStatusStatusDto? = null,
    @SerializedName("mutual")
    val mutual: FriendsRequestsMutualDto? = null,
    @SerializedName("deactivated")
    val deactivated: String? = null,
    @SerializedName("first_name")
    val firstName: String? = null,
    @SerializedName("hidden")
    val hidden: Int? = null,
    @SerializedName("last_name")
    val lastName: String? = null,
    @SerializedName("can_access_closed")
    val canAccessClosed: Boolean? = null,
    @SerializedName("is_closed")
    val isClosed: Boolean? = null
)
