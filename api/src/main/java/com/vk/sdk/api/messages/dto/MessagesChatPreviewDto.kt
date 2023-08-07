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
package com.vk.sdk.api.messages.dto

import com.google.gson.annotations.SerializedName
import com.vk.dto.common.id.UserId
import com.vk.sdk.api.base.dto.BaseLinkButtonDto
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * @param adminId
 * @param joined
 * @param localId
 * @param members
 * @param membersCount
 * @param title
 * @param isMember
 * @param photo
 * @param isDon
 * @param isNft
 * @param isGroupChannel
 * @param button
 */
data class MessagesChatPreviewDto(
    @SerializedName("admin_id")
    val adminId: UserId? = null,
    @SerializedName("joined")
    val joined: Boolean? = null,
    @SerializedName("local_id")
    val localId: Int? = null,
    @SerializedName("members")
    val members: List<UserId>? = null,
    @SerializedName("members_count")
    val membersCount: Int? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("is_member")
    val isMember: Boolean? = null,
    @SerializedName("photo")
    val photo: MessagesChatSettingsPhotoDto? = null,
    @SerializedName("is_don")
    val isDon: Boolean? = null,
    @SerializedName("is_nft")
    val isNft: Boolean? = null,
    @SerializedName("is_group_channel")
    val isGroupChannel: Boolean? = null,
    @SerializedName("button")
    val button: BaseLinkButtonDto? = null
)
