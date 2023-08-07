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
package com.vk.sdk.api.groups.dto

import com.google.gson.annotations.SerializedName
import kotlin.String

enum class GroupsFieldsDto(
    val value: String
) {
    @SerializedName("id")
    ID("id"),

    @SerializedName("name")
    NAME("name"),

    @SerializedName("screen_name")
    SCREEN_NAME("screen_name"),

    @SerializedName("is_closed")
    IS_CLOSED("is_closed"),

    @SerializedName("type")
    TYPE("type"),

    @SerializedName("is_admin")
    IS_ADMIN("is_admin"),

    @SerializedName("admin_level")
    ADMIN_LEVEL("admin_level"),

    @SerializedName("is_member")
    IS_MEMBER("is_member"),

    @SerializedName("is_advertiser")
    IS_ADVERTISER("is_advertiser"),

    @SerializedName("start_date")
    START_DATE("start_date"),

    @SerializedName("finish_date")
    FINISH_DATE("finish_date"),

    @SerializedName("deactivated")
    DEACTIVATED("deactivated"),

    @SerializedName("photo_50")
    PHOTO_50("photo_50"),

    @SerializedName("photo_100")
    PHOTO_100("photo_100"),

    @SerializedName("photo_200")
    PHOTO_200("photo_200"),

    @SerializedName("photo_200_orig")
    PHOTO_200_ORIG("photo_200_orig"),

    @SerializedName("photo_400")
    PHOTO_400("photo_400"),

    @SerializedName("photo_400_orig")
    PHOTO_400_ORIG("photo_400_orig"),

    @SerializedName("photo_max")
    PHOTO_MAX("photo_max"),

    @SerializedName("photo_max_orig")
    PHOTO_MAX_ORIG("photo_max_orig"),

    @SerializedName("photo_base")
    PHOTO_BASE("photo_base"),

    @SerializedName("est_date")
    EST_DATE("est_date"),

    @SerializedName("public_date_label")
    PUBLIC_DATE_LABEL("public_date_label"),

    @SerializedName("photo_max_size")
    PHOTO_MAX_SIZE("photo_max_size"),

    @SerializedName("is_video_live_notifications_blocked")
    IS_VIDEO_LIVE_NOTIFICATIONS_BLOCKED("is_video_live_notifications_blocked"),

    @SerializedName("video_live")
    VIDEO_LIVE("video_live"),

    @SerializedName("market")
    MARKET("market"),

    @SerializedName("member_status")
    MEMBER_STATUS("member_status"),

    @SerializedName("is_adult")
    IS_ADULT("is_adult"),

    @SerializedName("is_hidden_from_feed")
    IS_HIDDEN_FROM_FEED("is_hidden_from_feed"),

    @SerializedName("is_favorite")
    IS_FAVORITE("is_favorite"),

    @SerializedName("is_subscribed")
    IS_SUBSCRIBED("is_subscribed"),

    @SerializedName("city")
    CITY("city"),

    @SerializedName("country")
    COUNTRY("country"),

    @SerializedName("verified")
    VERIFIED("verified"),

    @SerializedName("description")
    DESCRIPTION("description"),

    @SerializedName("wiki_page")
    WIKI_PAGE("wiki_page"),

    @SerializedName("members_count")
    MEMBERS_COUNT("members_count"),

    @SerializedName("members_count_text")
    MEMBERS_COUNT_TEXT("members_count_text"),

    @SerializedName("requests_count")
    REQUESTS_COUNT("requests_count"),

    @SerializedName("video_live_level")
    VIDEO_LIVE_LEVEL("video_live_level"),

    @SerializedName("video_live_count")
    VIDEO_LIVE_COUNT("video_live_count"),

    @SerializedName("clips_count")
    CLIPS_COUNT("clips_count"),

    @SerializedName("textlives_count")
    TEXTLIVES_COUNT("textlives_count"),

    @SerializedName("counters")
    COUNTERS("counters"),

    @SerializedName("cover")
    COVER("cover"),

    @SerializedName("can_post")
    CAN_POST("can_post"),

    @SerializedName("can_suggest")
    CAN_SUGGEST("can_suggest"),

    @SerializedName("can_upload_story")
    CAN_UPLOAD_STORY("can_upload_story"),

    @SerializedName("can_upload_doc")
    CAN_UPLOAD_DOC("can_upload_doc"),

    @SerializedName("can_upload_video")
    CAN_UPLOAD_VIDEO("can_upload_video"),

    @SerializedName("can_upload_clip")
    CAN_UPLOAD_CLIP("can_upload_clip"),

    @SerializedName("can_see_all_posts")
    CAN_SEE_ALL_POSTS("can_see_all_posts"),

    @SerializedName("can_create_topic")
    CAN_CREATE_TOPIC("can_create_topic"),

    @SerializedName("activity")
    ACTIVITY("activity"),

    @SerializedName("fixed_post")
    FIXED_POST("fixed_post"),

    @SerializedName("has_photo")
    HAS_PHOTO("has_photo"),

    @SerializedName("crop_photo")
    CROP_PHOTO("crop_photo"),

    @SerializedName("status")
    STATUS("status"),

    @SerializedName("status_audio")
    STATUS_AUDIO("status_audio"),

    @SerializedName("main_album_id")
    MAIN_ALBUM_ID("main_album_id"),

    @SerializedName("links")
    LINKS("links"),

    @SerializedName("contacts")
    CONTACTS("contacts"),

    @SerializedName("wall")
    WALL("wall"),

    @SerializedName("site")
    SITE("site"),

    @SerializedName("main_section")
    MAIN_SECTION("main_section"),

    @SerializedName("secondary_section")
    SECONDARY_SECTION("secondary_section"),

    @SerializedName("trending")
    TRENDING("trending"),

    @SerializedName("can_message")
    CAN_MESSAGE("can_message"),

    @SerializedName("is_messages_blocked")
    IS_MESSAGES_BLOCKED("is_messages_blocked"),

    @SerializedName("can_send_notify")
    CAN_SEND_NOTIFY("can_send_notify"),

    @SerializedName("online_status")
    ONLINE_STATUS("online_status"),

    @SerializedName("invited_by")
    INVITED_BY("invited_by"),

    @SerializedName("age_limits")
    AGE_LIMITS("age_limits"),

    @SerializedName("ban_info")
    BAN_INFO("ban_info"),

    @SerializedName("has_market_app")
    HAS_MARKET_APP("has_market_app"),

    @SerializedName("using_vkpay_market_app")
    USING_VKPAY_MARKET_APP("using_vkpay_market_app"),

    @SerializedName("has_group_channel")
    HAS_GROUP_CHANNEL("has_group_channel"),

    @SerializedName("addresses")
    ADDRESSES("addresses"),

    @SerializedName("is_subscribed_podcasts")
    IS_SUBSCRIBED_PODCASTS("is_subscribed_podcasts"),

    @SerializedName("can_subscribe_podcasts")
    CAN_SUBSCRIBE_PODCASTS("can_subscribe_podcasts"),

    @SerializedName("can_subscribe_posts")
    CAN_SUBSCRIBE_POSTS("can_subscribe_posts"),

    @SerializedName("live_covers")
    LIVE_COVERS("live_covers"),

    @SerializedName("stories_archive_count")
    STORIES_ARCHIVE_COUNT("stories_archive_count"),

    @SerializedName("has_unseen_stories")
    HAS_UNSEEN_STORIES("has_unseen_stories"),

    @SerializedName("like")
    LIKE("like"),

    @SerializedName("friends")
    FRIENDS("friends"),

    @SerializedName("had_torch")
    HAD_TORCH("had_torch"),

    @SerializedName("worki_classifieds_vacancy_price")
    WORKI_CLASSIFIEDS_VACANCY_PRICE("worki_classifieds_vacancy_price"),

    @SerializedName("is_widget_messages_enabled")
    IS_WIDGET_MESSAGES_ENABLED("is_widget_messages_enabled"),

    @SerializedName("vkpay_can_transfer")
    VKPAY_CAN_TRANSFER("vkpay_can_transfer"),

    @SerializedName("vkpay_receiver_id")
    VKPAY_RECEIVER_ID("vkpay_receiver_id"),

    @SerializedName("phone")
    PHONE("phone"),

    @SerializedName("app_button")
    APP_BUTTON("app_button"),

    @SerializedName("app_buttons")
    APP_BUTTONS("app_buttons"),

    @SerializedName("audio_artist_id")
    AUDIO_ARTIST_ID("audio_artist_id"),

    @SerializedName("audio_curator_id")
    AUDIO_CURATOR_ID("audio_curator_id"),

    @SerializedName("buttons")
    BUTTONS("buttons"),

    @SerializedName("market_services")
    MARKET_SERVICES("market_services"),

    @SerializedName("music_awards")
    MUSIC_AWARDS("music_awards"),

    @SerializedName("textlive")
    TEXTLIVE("textlive"),

    @SerializedName("action_button")
    ACTION_BUTTON("action_button"),

    @SerializedName("author_id")
    AUTHOR_ID("author_id"),

    @SerializedName("is_market_cart_enabled")
    IS_MARKET_CART_ENABLED("is_market_cart_enabled"),

    @SerializedName("group_channel")
    GROUP_CHANNEL("group_channel"),

    @SerializedName("is_subscribed_stories")
    IS_SUBSCRIBED_STORIES("is_subscribed_stories"),

    @SerializedName("can_subscribe_stories")
    CAN_SUBSCRIBE_STORIES("can_subscribe_stories"),

    @SerializedName("is_subscribed_textlives")
    IS_SUBSCRIBED_TEXTLIVES("is_subscribed_textlives"),

    @SerializedName("vk_admin_status")
    VK_ADMIN_STATUS("vk_admin_status"),

    @SerializedName("menu")
    MENU("menu"),

    @SerializedName("warning_notification")
    WARNING_NOTIFICATION("warning_notification"),

    @SerializedName("create_date")
    CREATE_DATE("create_date"),

    @SerializedName("donut")
    DONUT("donut"),

    @SerializedName("donut_payment_info")
    DONUT_PAYMENT_INFO("donut_payment_info"),

    @SerializedName("can_post_donut")
    CAN_POST_DONUT("can_post_donut"),

    @SerializedName("can_see_members")
    CAN_SEE_MEMBERS("can_see_members"),

    @SerializedName("msg_push_allowed")
    MSG_PUSH_ALLOWED("msg_push_allowed"),

    @SerializedName("chats_status")
    CHATS_STATUS("chats_status"),

    @SerializedName("can_report")
    CAN_REPORT("can_report"),

    @SerializedName("is_business")
    IS_BUSINESS("is_business"),

    @SerializedName("is_business_category")
    IS_BUSINESS_CATEGORY("is_business_category"),

    @SerializedName("microlanding")
    MICROLANDING("microlanding"),

    @SerializedName("tariffs")
    TARIFFS("tariffs"),

    @SerializedName("verification_end_time")
    VERIFICATION_END_TIME("verification_end_time"),

    @SerializedName("can_manage")
    CAN_MANAGE("can_manage"),

    @SerializedName("has_suggestions")
    HAS_SUGGESTIONS("has_suggestions"),

    @SerializedName("show_suggestions")
    SHOW_SUGGESTIONS("show_suggestions"),

    @SerializedName("can_view_stats")
    CAN_VIEW_STATS("can_view_stats"),

    @SerializedName("can_view_post_reach_stats")
    CAN_VIEW_POST_REACH_STATS("can_view_post_reach_stats"),

    @SerializedName("ads_easy_promote")
    ADS_EASY_PROMOTE("ads_easy_promote"),

    @SerializedName("ads_easy_promote_allowed")
    ADS_EASY_PROMOTE_ALLOWED("ads_easy_promote_allowed"),

    @SerializedName("ads_posting_restricted_today")
    ADS_POSTING_RESTRICTED_TODAY("ads_posting_restricted_today"),

    @SerializedName("ads_market_autopromote_allowed")
    ADS_MARKET_AUTOPROMOTE_ALLOWED("ads_market_autopromote_allowed"),

    @SerializedName("ads_market_easy_promote")
    ADS_MARKET_EASY_PROMOTE("ads_market_easy_promote"),

    @SerializedName("ads_market_autopromote_reasons_not_allowed")
    ADS_MARKET_AUTOPROMOTE_REASONS_NOT_ALLOWED("ads_market_autopromote_reasons_not_allowed"),

    @SerializedName("ads_market_services_autopromote_reasons_not_allowed")
    ADS_MARKET_SERVICES_AUTOPROMOTE_REASONS_NOT_ALLOWED("ads_market_services_autopromote_reasons_not_allowed"),

    @SerializedName("ads_market_services_autopromote_allowed")
    ADS_MARKET_SERVICES_AUTOPROMOTE_ALLOWED("ads_market_services_autopromote_allowed"),

    @SerializedName("ads_market_services_easy_promote")
    ADS_MARKET_SERVICES_EASY_PROMOTE("ads_market_services_easy_promote"),

    @SerializedName("ads_easy_promote_reasons_not_allowed")
    ADS_EASY_PROMOTE_REASONS_NOT_ALLOWED("ads_easy_promote_reasons_not_allowed"),

    @SerializedName("can_see_invite_links")
    CAN_SEE_INVITE_LINKS("can_see_invite_links"),

    @SerializedName("subject_id")
    SUBJECT_ID("subject_id"),

    @SerializedName("public_category")
    PUBLIC_CATEGORY("public_category"),

    @SerializedName("public_subcategory")
    PUBLIC_SUBCATEGORY("public_subcategory"),

    @SerializedName("installed_apps_count")
    INSTALLED_APPS_COUNT("installed_apps_count"),

    @SerializedName("login_confirmation_status")
    LOGIN_CONFIRMATION_STATUS("login_confirmation_status"),

    @SerializedName("youla_status")
    YOULA_STATUS("youla_status"),

    @SerializedName("extended_market")
    EXTENDED_MARKET("extended_market"),

    @SerializedName("youla_use_wallpost_redirect")
    YOULA_USE_WALLPOST_REDIRECT("youla_use_wallpost_redirect"),

    @SerializedName("youla_use_wallpost_redirect_onboarding")
    YOULA_USE_WALLPOST_REDIRECT_ONBOARDING("youla_use_wallpost_redirect_onboarding"),

    @SerializedName("youla_wallpost_redirect_miniapp_url")
    YOULA_WALLPOST_REDIRECT_MINIAPP_URL("youla_wallpost_redirect_miniapp_url"),

    @SerializedName("classifieds_antibaraholka_design_version")
    CLASSIFIEDS_ANTIBARAHOLKA_DESIGN_VERSION("classifieds_antibaraholka_design_version"),

    @SerializedName("is_youla_posting_to_wall_allowed")
    IS_YOULA_POSTING_TO_WALL_ALLOWED("is_youla_posting_to_wall_allowed"),

    @SerializedName("worki_use_wallpost_redirect")
    WORKI_USE_WALLPOST_REDIRECT("worki_use_wallpost_redirect"),

    @SerializedName("category2")
    CATEGORY2("category2"),

    @SerializedName("deactivated_message")
    DEACTIVATED_MESSAGE("deactivated_message"),

    @SerializedName("deactivated_type")
    DEACTIVATED_TYPE("deactivated_type"),

    @SerializedName("is_clips_notifications_ignored")
    IS_CLIPS_NOTIFICATIONS_IGNORED("is_clips_notifications_ignored"),

    @SerializedName("youla_posting_method")
    YOULA_POSTING_METHOD("youla_posting_method"),

    @SerializedName("place")
    PLACE("place"),

    @SerializedName("targ_artist_id")
    TARG_ARTIST_ID("targ_artist_id"),

    @SerializedName("is_government_organization")
    IS_GOVERNMENT_ORGANIZATION("is_government_organization"),

    @SerializedName("settings_tooltips_active")
    SETTINGS_TOOLTIPS_ACTIVE("settings_tooltips_active"),

    @SerializedName("rating")
    RATING("rating"),

    @SerializedName("photo_avg_color")
    PHOTO_AVG_COLOR("photo_avg_color"),

    @SerializedName("has_live_cover")
    HAS_LIVE_COVER("has_live_cover"),

    @SerializedName("name_history")
    NAME_HISTORY("name_history"),

    @SerializedName("service_rating")
    SERVICE_RATING("service_rating"),

    @SerializedName("recommended_tips_widget")
    RECOMMENDED_TIPS_WIDGET("recommended_tips_widget"),

    @SerializedName("inn")
    INN("inn"),

    @SerializedName("ogrn")
    OGRN("ogrn"),

    @SerializedName("kpp")
    KPP("kpp"),

    @SerializedName("subject")
    SUBJECT("subject"),

    @SerializedName("region")
    REGION("region"),

    @SerializedName("is_set_tab_order")
    IS_SET_TAB_ORDER("is_set_tab_order"),

    @SerializedName("business_community_tooltips")
    BUSINESS_COMMUNITY_TOOLTIPS("business_community_tooltips"),

    @SerializedName("can_call_to_community")
    CAN_CALL_TO_COMMUNITY("can_call_to_community"),

    @SerializedName("post_reach_avg_current_month")
    POST_REACH_AVG_CURRENT_MONTH("post_reach_avg_current_month"),

    @SerializedName("category1_name")
    CATEGORY1_NAME("category1_name"),

    @SerializedName("authors_marketplace")
    AUTHORS_MARKETPLACE("authors_marketplace"),

    @SerializedName("ads_posts_info")
    ADS_POSTS_INFO("ads_posts_info"),

    @SerializedName("thematic")
    THEMATIC("thematic"),

    @SerializedName("banner_ads_main_client")
    BANNER_ADS_MAIN_CLIENT("banner_ads_main_client"),

    @SerializedName("banner_ads_setting_miniapp")
    BANNER_ADS_SETTING_MINIAPP("banner_ads_setting_miniapp"),

    @SerializedName("leave_mode")
    LEAVE_MODE("leave_mode"),

    @SerializedName("banner_ads_main_mvk")
    BANNER_ADS_MAIN_MVK("banner_ads_main_mvk"),

    @SerializedName("age_mark")
    AGE_MARK("age_mark"),

    @SerializedName("is_media_wall_enabled")
    IS_MEDIA_WALL_ENABLED("is_media_wall_enabled");
}
