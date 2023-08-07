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
package com.vk.sdk.api.photos.dto

import com.google.gson.annotations.SerializedName
import com.vk.dto.common.id.UserId
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * @param albumId - Album ID
 * @param date - Date when uploaded
 * @param id - Photo ID
 * @param ownerId - Photo owner's ID
 * @param accessKey - Access key for the photo
 * @param height - Original photo height
 * @param lat - Latitude
 * @param long - Longitude
 * @param photo1280 - URL of image with 1280 px width
 * @param photo130 - URL of image with 130 px width
 * @param photo2560 - URL of image with 2560 px width
 * @param photo604 - URL of image with 604 px width
 * @param photo75 - URL of image with 75 px width
 * @param photo807 - URL of image with 807 px width
 * @param placerId - ID of the tag creator
 * @param postId - Post ID
 * @param sizes
 * @param tagCreated - Date when tag has been added in Unixtime
 * @param tagId - Tag ID
 * @param text - Photo caption
 * @param userId - ID of the user who have uploaded the photo
 * @param width - Original photo width
 * @param hasTags - Whether photo has attached tag links
 */
data class PhotosPhotoXtrTagInfoDto(
    @SerializedName("album_id")
    val albumId: Int,
    @SerializedName("date")
    val date: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("owner_id")
    val ownerId: UserId,
    @SerializedName("access_key")
    val accessKey: String? = null,
    @SerializedName("height")
    val height: Int? = null,
    @SerializedName("lat")
    val lat: Float? = null,
    @SerializedName("long")
    val long: Float? = null,
    @SerializedName("photo_1280")
    val photo1280: String? = null,
    @SerializedName("photo_130")
    val photo130: String? = null,
    @SerializedName("photo_2560")
    val photo2560: String? = null,
    @SerializedName("photo_604")
    val photo604: String? = null,
    @SerializedName("photo_75")
    val photo75: String? = null,
    @SerializedName("photo_807")
    val photo807: String? = null,
    @SerializedName("placer_id")
    val placerId: Int? = null,
    @SerializedName("post_id")
    val postId: Int? = null,
    @SerializedName("sizes")
    val sizes: List<PhotosPhotoSizesDto>? = null,
    @SerializedName("tag_created")
    val tagCreated: Int? = null,
    @SerializedName("tag_id")
    val tagId: Int? = null,
    @SerializedName("text")
    val text: String? = null,
    @SerializedName("user_id")
    val userId: UserId? = null,
    @SerializedName("width")
    val width: Int? = null,
    @SerializedName("has_tags")
    val hasTags: Boolean? = null
)
