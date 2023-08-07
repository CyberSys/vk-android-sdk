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
package com.vk.sdk.api.market.dto

import com.google.gson.annotations.SerializedName
import com.vk.dto.common.id.UserId
import com.vk.sdk.api.base.dto.BaseBoolIntDto
import com.vk.sdk.api.base.dto.BaseLikesDto
import com.vk.sdk.api.base.dto.BaseLinkDto
import com.vk.sdk.api.base.dto.BaseRepostsInfoDto
import com.vk.sdk.api.photos.dto.PhotosPhotoDto
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * @param availability
 * @param category
 * @param description - Item description
 * @param id - Item ID
 * @param ownerId - Item owner's ID
 * @param price
 * @param title - Item title
 * @param albumsIds
 * @param photos
 * @param canComment - Information whether current use can comment the item
 * @param canRepost - Information whether current use can repost the item
 * @param likes
 * @param reposts
 * @param viewsCount - Views number
 * @param wishlistItemId - Object identifier in wishlist of viewer
 * @param cancelInfo - Information for cancel and revert order
 * @param userAgreementInfo - User agreement info
 * @param adId - Contains ad ID if it has
 * @param ownerInfo - Information about the group where the item is placed
 * @param canEdit - Can the item be updated by current user?
 * @param canDelete - Can item be deleted by current user?
 * @param canShowConvertToService - Can the item be converted from a product into a service?
 * @param promotion - Information about promotion of the item
 * @param vkPayDiscount - The amount of the discount if VK Pay is used for payment
 * @param accessKey - Access key for the market item
 * @param buttonTitle - Title for button for url
 * @param categoryV2
 * @param date - Date when the item has been created in Unixtime
 * @param externalId
 * @param isFavorite
 * @param isOwner
 * @param isAdult
 * @param thumbPhoto - URL of the preview image
 * @param url - URL to item
 * @param variantsGroupingId
 * @param isMainVariant
 * @param sku
 * @param postId - Attach for post id
 * @param postOwnerId - Attach for post owner id
 */
data class MarketMarketItemFullDto(
    @SerializedName("availability")
    val availability: MarketMarketItemAvailabilityDto,
    @SerializedName("category")
    val category: MarketMarketCategoryDto,
    @SerializedName("description")
    val description: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("owner_id")
    val ownerId: UserId,
    @SerializedName("price")
    val price: MarketPriceDto,
    @SerializedName("title")
    val title: String,
    @SerializedName("albums_ids")
    val albumsIds: List<Int>? = null,
    @SerializedName("photos")
    val photos: List<PhotosPhotoDto>? = null,
    @SerializedName("can_comment")
    val canComment: BaseBoolIntDto? = null,
    @SerializedName("can_repost")
    val canRepost: BaseBoolIntDto? = null,
    @SerializedName("likes")
    val likes: BaseLikesDto? = null,
    @SerializedName("reposts")
    val reposts: BaseRepostsInfoDto? = null,
    @SerializedName("views_count")
    val viewsCount: Int? = null,
    @SerializedName("wishlist_item_id")
    val wishlistItemId: Int? = null,
    @SerializedName("cancel_info")
    val cancelInfo: BaseLinkDto? = null,
    @SerializedName("user_agreement_info")
    val userAgreementInfo: String? = null,
    @SerializedName("ad_id")
    val adId: Int? = null,
    @SerializedName("owner_info")
    val ownerInfo: MarketItemOwnerInfoDto? = null,
    @SerializedName("can_edit")
    val canEdit: Boolean? = null,
    @SerializedName("can_delete")
    val canDelete: Boolean? = null,
    @SerializedName("can_show_convert_to_service")
    val canShowConvertToService: Boolean? = null,
    @SerializedName("promotion")
    val promotion: MarketItemPromotionInfoDto? = null,
    @SerializedName("vk_pay_discount")
    val vkPayDiscount: Int? = null,
    @SerializedName("access_key")
    val accessKey: String? = null,
    @SerializedName("button_title")
    val buttonTitle: String? = null,
    @SerializedName("category_v2")
    val categoryV2: MarketMarketCategoryDto? = null,
    @SerializedName("date")
    val date: Int? = null,
    @SerializedName("external_id")
    val externalId: String? = null,
    @SerializedName("is_favorite")
    val isFavorite: Boolean? = null,
    @SerializedName("is_owner")
    val isOwner: Boolean? = null,
    @SerializedName("is_adult")
    val isAdult: Boolean? = null,
    @SerializedName("thumb_photo")
    val thumbPhoto: String? = null,
    @SerializedName("url")
    val url: String? = null,
    @SerializedName("variants_grouping_id")
    val variantsGroupingId: Int? = null,
    @SerializedName("is_main_variant")
    val isMainVariant: Boolean? = null,
    @SerializedName("sku")
    val sku: String? = null,
    @SerializedName("post_id")
    val postId: Int? = null,
    @SerializedName("post_owner_id")
    val postOwnerId: UserId? = null
)
