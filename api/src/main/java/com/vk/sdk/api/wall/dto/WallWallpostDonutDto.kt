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
package com.vk.sdk.api.wall.dto

import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Info about paid wall post
 * @param isDonut - Post only for dons
 * @param paidDuration - Value of this field need to pass in wall.post/edit in donut_paid_duration
 * @param placeholder - If placeholder was respond, text and all attachments will be hidden
 * @param canPublishFreeCopy - Says whether group admin can post free copy of this donut post
 * @param editMode - Says what user can edit in post about donut properties
 */
data class WallWallpostDonutDto(
    @SerializedName("is_donut")
    val isDonut: Boolean,
    @SerializedName("paid_duration")
    val paidDuration: Int? = null,
    @SerializedName("placeholder")
    val placeholder: WallWallpostDonutPlaceholderDto? = null,
    @SerializedName("can_publish_free_copy")
    val canPublishFreeCopy: Boolean? = null,
    @SerializedName("edit_mode")
    val editMode: WallWallpostDonutDto.EditModeDto? = null
) {
    enum class EditModeDto(
        val value: String
    ) {
        @SerializedName("all")
        ALL("all"),

        @SerializedName("duration")
        DURATION("duration");
    }
}
