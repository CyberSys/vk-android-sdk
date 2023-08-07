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
import com.vk.sdk.api.apps.dto.AppsAppMinDto
import com.vk.sdk.api.audio.dto.AudioAudioDto
import com.vk.sdk.api.base.dto.BaseBoolIntDto
import com.vk.sdk.api.base.dto.BaseCityDto
import com.vk.sdk.api.base.dto.BaseCountryDto
import com.vk.sdk.api.base.dto.BaseCropPhotoDto
import com.vk.sdk.api.base.dto.BaseSexDto
import com.vk.sdk.api.friends.dto.FriendsFriendStatusStatusDto
import com.vk.sdk.api.friends.dto.FriendsRequestsMutualDto
import com.vk.sdk.api.owner.dto.OwnerStateDto
import com.vk.sdk.api.photos.dto.PhotosPhotoDto
import com.vk.sdk.api.users.dto.UsersCareerDto
import com.vk.sdk.api.users.dto.UsersExportsDto
import com.vk.sdk.api.users.dto.UsersLastSeenDto
import com.vk.sdk.api.users.dto.UsersMilitaryDto
import com.vk.sdk.api.users.dto.UsersOccupationDto
import com.vk.sdk.api.users.dto.UsersOnlineInfoDto
import com.vk.sdk.api.users.dto.UsersPersonalDto
import com.vk.sdk.api.users.dto.UsersRelativeDto
import com.vk.sdk.api.users.dto.UsersSchoolDto
import com.vk.sdk.api.users.dto.UsersUniversityDto
import com.vk.sdk.api.users.dto.UsersUserCountersDto
import com.vk.sdk.api.users.dto.UsersUserMinDto
import com.vk.sdk.api.users.dto.UsersUserRelationDto
import com.vk.sdk.api.video.dto.VideoLiveInfoDto
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * @param id - User ID
 * @param invitedBy - ID of the inviter
 * @param name - Name of group
 * @param type
 * @param firstNameNom - User's first name in nominative case
 * @param firstNameGen - User's first name in genitive case
 * @param firstNameDat - User's first name in dative case
 * @param firstNameAcc - User's first name in accusative case
 * @param firstNameIns - User's first name in instrumental case
 * @param firstNameAbl - User's first name in prepositional case
 * @param lastNameNom - User's last name in nominative case
 * @param lastNameGen - User's last name in genitive case
 * @param lastNameDat - User's last name in dative case
 * @param lastNameAcc - User's last name in accusative case
 * @param lastNameIns - User's last name in instrumental case
 * @param lastNameAbl - User's last name in prepositional case
 * @param nickname - User nickname
 * @param maidenName - User maiden name
 * @param contactName - User contact name
 * @param domain - Domain name of the user's page
 * @param bdate - User's date of birth
 * @param city
 * @param country
 * @param timezone - User's timezone
 * @param ownerState
 * @param photo200 - URL of square photo of the user with 200 pixels in width
 * @param photoMax - URL of square photo of the user with maximum width
 * @param photo200Orig - URL of user's photo with 200 pixels in width
 * @param photo400Orig - URL of user's photo with 400 pixels in width
 * @param photoMaxOrig - URL of user's photo of maximum size
 * @param photoId - ID of the user's main photo
 * @param hasPhoto - Information whether the user has main photo
 * @param hasMobile - Information whether the user specified his phone number
 * @param isFriend - Information whether the user is a friend of current user
 * @param isBestFriend - Information whether the user is a best friend of current user
 * @param wallComments - Information whether current user can comment wall posts
 * @param canPost - Information whether current user can post on the user's wall
 * @param canSeeAllPosts - Information whether current user can see other users' audio on the wall
 * @param canSeeAudio - Information whether current user can see the user's audio
 * @param email
 * @param skype
 * @param facebook
 * @param facebookName
 * @param twitter
 * @param livejournal
 * @param instagram
 * @param test
 * @param videoLive
 * @param isVideoLiveNotificationsBlocked
 * @param isService
 * @param serviceDescription
 * @param photoRec
 * @param photoMedium
 * @param photoMediumRec
 * @param photo
 * @param photoBig
 * @param photo400
 * @param photoMaxSize
 * @param language
 * @param storiesArchiveCount
 * @param hasUnseenStories
 * @param wallDefault
 * @param canCall - Information whether current user can call
 * @param canCallFromGroup - Information whether group can call user
 * @param canSeeWishes - Information whether current user can see the user's wishes
 * @param canSeeGifts - Information whether current user can see the user's gifts
 * @param interests
 * @param books
 * @param tv
 * @param quotes
 * @param about
 * @param games
 * @param movies
 * @param activities
 * @param music
 * @param canWritePrivateMessage - Information whether current user can write private message
 * @param canSendFriendRequest - Information whether current user can send a friend request
 * @param canBeInvitedGroup - Information whether current user can be invited to the community
 * @param mobilePhone - User's mobile phone number
 * @param homePhone - User's additional phone number
 * @param site - User's website
 * @param statusAudio
 * @param status - User's status
 * @param activity - User's status
 * @param statusApp
 * @param lastSeen
 * @param exports
 * @param cropPhoto
 * @param followersCount - Number of user's followers
 * @param videoLiveLevel - User level in live streams achievements
 * @param videoLiveCount - Number of user's live streams
 * @param clipsCount - Number of user's clips
 * @param blacklisted - Information whether current user is in the requested user's blacklist.
 * @param blacklistedByMe - Information whether the requested user is in current user's blacklist
 * @param isFavorite - Information whether the requested user is in faves of current user
 * @param isHiddenFromFeed - Information whether the requested user is hidden from current user's
 * newsfeed
 * @param commonCount - Number of common friends with current user
 * @param occupation
 * @param career
 * @param military
 * @param university - University ID
 * @param universityName - University name
 * @param universityGroupId
 * @param faculty - Faculty ID
 * @param facultyName - Faculty name
 * @param graduation - Graduation year
 * @param educationForm - Education form
 * @param educationStatus - User's education status
 * @param homeTown - User hometown
 * @param relation - User relationship status
 * @param relationPartner
 * @param personal
 * @param universities
 * @param schools
 * @param relatives
 * @param isSubscribedPodcasts - Information whether current user is subscribed to podcasts
 * @param canSubscribePodcasts - Owner in whitelist or not
 * @param canSubscribePosts - Can subscribe to wall
 * @param counters
 * @param accessKey
 * @param canUploadDoc
 * @param canBan - Information whether the user can be baned (added to black list) by me
 * @param hash
 * @param isNoIndex - Access to user profile is restricted for search engines
 * @param contactId - Contact person ID
 * @param isMessageRequest
 * @param descriptions
 * @param lists
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
data class MessagesUserXtrInvitedByDto(
    @SerializedName("id")
    val id: UserId,
    @SerializedName("invited_by")
    val invitedBy: UserId? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("type")
    val type: MessagesUserTypeForXtrInvitedByDto? = null,
    @SerializedName("first_name_nom")
    val firstNameNom: String? = null,
    @SerializedName("first_name_gen")
    val firstNameGen: String? = null,
    @SerializedName("first_name_dat")
    val firstNameDat: String? = null,
    @SerializedName("first_name_acc")
    val firstNameAcc: String? = null,
    @SerializedName("first_name_ins")
    val firstNameIns: String? = null,
    @SerializedName("first_name_abl")
    val firstNameAbl: String? = null,
    @SerializedName("last_name_nom")
    val lastNameNom: String? = null,
    @SerializedName("last_name_gen")
    val lastNameGen: String? = null,
    @SerializedName("last_name_dat")
    val lastNameDat: String? = null,
    @SerializedName("last_name_acc")
    val lastNameAcc: String? = null,
    @SerializedName("last_name_ins")
    val lastNameIns: String? = null,
    @SerializedName("last_name_abl")
    val lastNameAbl: String? = null,
    @SerializedName("nickname")
    val nickname: String? = null,
    @SerializedName("maiden_name")
    val maidenName: String? = null,
    @SerializedName("contact_name")
    val contactName: String? = null,
    @SerializedName("domain")
    val domain: String? = null,
    @SerializedName("bdate")
    val bdate: String? = null,
    @SerializedName("city")
    val city: BaseCityDto? = null,
    @SerializedName("country")
    val country: BaseCountryDto? = null,
    @SerializedName("timezone")
    val timezone: Float? = null,
    @SerializedName("owner_state")
    val ownerState: OwnerStateDto? = null,
    @SerializedName("photo_200")
    val photo200: String? = null,
    @SerializedName("photo_max")
    val photoMax: String? = null,
    @SerializedName("photo_200_orig")
    val photo200Orig: String? = null,
    @SerializedName("photo_400_orig")
    val photo400Orig: String? = null,
    @SerializedName("photo_max_orig")
    val photoMaxOrig: String? = null,
    @SerializedName("photo_id")
    val photoId: String? = null,
    @SerializedName("has_photo")
    val hasPhoto: BaseBoolIntDto? = null,
    @SerializedName("has_mobile")
    val hasMobile: BaseBoolIntDto? = null,
    @SerializedName("is_friend")
    val isFriend: BaseBoolIntDto? = null,
    @SerializedName("is_best_friend")
    val isBestFriend: Boolean? = null,
    @SerializedName("wall_comments")
    val wallComments: BaseBoolIntDto? = null,
    @SerializedName("can_post")
    val canPost: BaseBoolIntDto? = null,
    @SerializedName("can_see_all_posts")
    val canSeeAllPosts: BaseBoolIntDto? = null,
    @SerializedName("can_see_audio")
    val canSeeAudio: BaseBoolIntDto? = null,
    @SerializedName("email")
    val email: String? = null,
    @SerializedName("skype")
    val skype: String? = null,
    @SerializedName("facebook")
    val facebook: String? = null,
    @SerializedName("facebook_name")
    val facebookName: String? = null,
    @SerializedName("twitter")
    val twitter: String? = null,
    @SerializedName("livejournal")
    val livejournal: String? = null,
    @SerializedName("instagram")
    val instagram: String? = null,
    @SerializedName("test")
    val test: BaseBoolIntDto? = null,
    @SerializedName("video_live")
    val videoLive: VideoLiveInfoDto? = null,
    @SerializedName("is_video_live_notifications_blocked")
    val isVideoLiveNotificationsBlocked: BaseBoolIntDto? = null,
    @SerializedName("is_service")
    val isService: Boolean? = null,
    @SerializedName("service_description")
    val serviceDescription: String? = null,
    @SerializedName("photo_rec")
    val photoRec: String? = null,
    @SerializedName("photo_medium")
    val photoMedium: String? = null,
    @SerializedName("photo_medium_rec")
    val photoMediumRec: String? = null,
    @SerializedName("photo")
    val photo: String? = null,
    @SerializedName("photo_big")
    val photoBig: String? = null,
    @SerializedName("photo_400")
    val photo400: String? = null,
    @SerializedName("photo_max_size")
    val photoMaxSize: PhotosPhotoDto? = null,
    @SerializedName("language")
    val language: String? = null,
    @SerializedName("stories_archive_count")
    val storiesArchiveCount: Int? = null,
    @SerializedName("has_unseen_stories")
    val hasUnseenStories: Boolean? = null,
    @SerializedName("wall_default")
    val wallDefault: MessagesUserXtrInvitedByDto.WallDefaultDto? = null,
    @SerializedName("can_call")
    val canCall: Boolean? = null,
    @SerializedName("can_call_from_group")
    val canCallFromGroup: Boolean? = null,
    @SerializedName("can_see_wishes")
    val canSeeWishes: Boolean? = null,
    @SerializedName("can_see_gifts")
    val canSeeGifts: BaseBoolIntDto? = null,
    @SerializedName("interests")
    val interests: String? = null,
    @SerializedName("books")
    val books: String? = null,
    @SerializedName("tv")
    val tv: String? = null,
    @SerializedName("quotes")
    val quotes: String? = null,
    @SerializedName("about")
    val about: String? = null,
    @SerializedName("games")
    val games: String? = null,
    @SerializedName("movies")
    val movies: String? = null,
    @SerializedName("activities")
    val activities: String? = null,
    @SerializedName("music")
    val music: String? = null,
    @SerializedName("can_write_private_message")
    val canWritePrivateMessage: BaseBoolIntDto? = null,
    @SerializedName("can_send_friend_request")
    val canSendFriendRequest: BaseBoolIntDto? = null,
    @SerializedName("can_be_invited_group")
    val canBeInvitedGroup: Boolean? = null,
    @SerializedName("mobile_phone")
    val mobilePhone: String? = null,
    @SerializedName("home_phone")
    val homePhone: String? = null,
    @SerializedName("site")
    val site: String? = null,
    @SerializedName("status_audio")
    val statusAudio: AudioAudioDto? = null,
    @SerializedName("status")
    val status: String? = null,
    @SerializedName("activity")
    val activity: String? = null,
    @SerializedName("status_app")
    val statusApp: AppsAppMinDto? = null,
    @SerializedName("last_seen")
    val lastSeen: UsersLastSeenDto? = null,
    @SerializedName("exports")
    val exports: UsersExportsDto? = null,
    @SerializedName("crop_photo")
    val cropPhoto: BaseCropPhotoDto? = null,
    @SerializedName("followers_count")
    val followersCount: Int? = null,
    @SerializedName("video_live_level")
    val videoLiveLevel: Int? = null,
    @SerializedName("video_live_count")
    val videoLiveCount: Int? = null,
    @SerializedName("clips_count")
    val clipsCount: Int? = null,
    @SerializedName("blacklisted")
    val blacklisted: BaseBoolIntDto? = null,
    @SerializedName("blacklisted_by_me")
    val blacklistedByMe: BaseBoolIntDto? = null,
    @SerializedName("is_favorite")
    val isFavorite: BaseBoolIntDto? = null,
    @SerializedName("is_hidden_from_feed")
    val isHiddenFromFeed: BaseBoolIntDto? = null,
    @SerializedName("common_count")
    val commonCount: Int? = null,
    @SerializedName("occupation")
    val occupation: UsersOccupationDto? = null,
    @SerializedName("career")
    val career: List<UsersCareerDto>? = null,
    @SerializedName("military")
    val military: List<UsersMilitaryDto>? = null,
    @SerializedName("university")
    val university: Int? = null,
    @SerializedName("university_name")
    val universityName: String? = null,
    @SerializedName("university_group_id")
    val universityGroupId: Int? = null,
    @SerializedName("faculty")
    val faculty: Int? = null,
    @SerializedName("faculty_name")
    val facultyName: String? = null,
    @SerializedName("graduation")
    val graduation: Int? = null,
    @SerializedName("education_form")
    val educationForm: String? = null,
    @SerializedName("education_status")
    val educationStatus: String? = null,
    @SerializedName("home_town")
    val homeTown: String? = null,
    @SerializedName("relation")
    val relation: UsersUserRelationDto? = null,
    @SerializedName("relation_partner")
    val relationPartner: UsersUserMinDto? = null,
    @SerializedName("personal")
    val personal: UsersPersonalDto? = null,
    @SerializedName("universities")
    val universities: List<UsersUniversityDto>? = null,
    @SerializedName("schools")
    val schools: List<UsersSchoolDto>? = null,
    @SerializedName("relatives")
    val relatives: List<UsersRelativeDto>? = null,
    @SerializedName("is_subscribed_podcasts")
    val isSubscribedPodcasts: Boolean? = null,
    @SerializedName("can_subscribe_podcasts")
    val canSubscribePodcasts: Boolean? = null,
    @SerializedName("can_subscribe_posts")
    val canSubscribePosts: Boolean? = null,
    @SerializedName("counters")
    val counters: UsersUserCountersDto? = null,
    @SerializedName("access_key")
    val accessKey: String? = null,
    @SerializedName("can_upload_doc")
    val canUploadDoc: BaseBoolIntDto? = null,
    @SerializedName("can_ban")
    val canBan: Boolean? = null,
    @SerializedName("hash")
    val hash: String? = null,
    @SerializedName("is_no_index")
    val isNoIndex: Boolean? = null,
    @SerializedName("contact_id")
    val contactId: Int? = null,
    @SerializedName("is_message_request")
    val isMessageRequest: Boolean? = null,
    @SerializedName("descriptions")
    val descriptions: List<String>? = null,
    @SerializedName("lists")
    val lists: List<Int>? = null,
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
) {
    enum class WallDefaultDto(
        val value: String
    ) {
        @SerializedName("owner")
        OWNER("owner"),

        @SerializedName("all")
        ALL("all");
    }
}
