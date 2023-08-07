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
package com.vk.sdk.api.base.dto

import com.google.gson.annotations.SerializedName
import kotlin.String

enum class BaseLinkButtonActionTypeDto(
    val value: String
) {
    @SerializedName("open_url")
    OPEN_URL("open_url"),

    @SerializedName("open_amp")
    OPEN_AMP("open_amp"),

    @SerializedName("join_group_and_open_url")
    JOIN_GROUP_AND_OPEN_URL("join_group_and_open_url"),

    @SerializedName("user_subscribe_and_open_url")
    USER_SUBSCRIBE_AND_OPEN_URL("user_subscribe_and_open_url"),

    @SerializedName("open_section")
    OPEN_SECTION("open_section"),

    @SerializedName("follow")
    FOLLOW("follow"),

    @SerializedName("upload_video")
    UPLOAD_VIDEO("upload_video"),

    @SerializedName("create_playlist")
    CREATE_PLAYLIST("create_playlist"),

    @SerializedName("create_album")
    CREATE_ALBUM("create_album"),

    @SerializedName("friends_lists")
    FRIENDS_LISTS("friends_lists"),

    @SerializedName("friends_sort_modes")
    FRIENDS_SORT_MODES("friends_sort_modes"),

    @SerializedName("add_friend")
    ADD_FRIEND("add_friend"),

    @SerializedName("block_filter")
    BLOCK_FILTER("block_filter"),

    @SerializedName("qr_camera")
    QR_CAMERA("qr_camera"),

    @SerializedName("friends_requests")
    FRIENDS_REQUESTS("friends_requests"),

    @SerializedName("open_screen")
    OPEN_SCREEN("open_screen"),

    @SerializedName("open_screen_large")
    OPEN_SCREEN_LARGE("open_screen_large"),

    @SerializedName("friends_message")
    FRIENDS_MESSAGE("friends_message"),

    @SerializedName("friends_call")
    FRIENDS_CALL("friends_call"),

    @SerializedName("friends_send_gift")
    FRIENDS_SEND_GIFT("friends_send_gift"),

    @SerializedName("friends_label")
    FRIENDS_LABEL("friends_label"),

    @SerializedName("play_audios_from_block")
    PLAY_AUDIOS_FROM_BLOCK("play_audios_from_block"),

    @SerializedName("play_audio")
    PLAY_AUDIO("play_audio"),

    @SerializedName("open_challenge")
    OPEN_CHALLENGE("open_challenge"),

    @SerializedName("play_videos_from_block")
    PLAY_VIDEOS_FROM_BLOCK("play_videos_from_block"),

    @SerializedName("play_shuffled_audios_from_block")
    PLAY_SHUFFLED_AUDIOS_FROM_BLOCK("play_shuffled_audios_from_block"),

    @SerializedName("unfollow_artist")
    UNFOLLOW_ARTIST("unfollow_artist"),

    @SerializedName("create_group")
    CREATE_GROUP("create_group"),

    @SerializedName("close_notification")
    CLOSE_NOTIFICATION("close_notification"),

    @SerializedName("switch_section")
    SWITCH_SECTION("switch_section"),

    @SerializedName("clear_recent_groups")
    CLEAR_RECENT_GROUPS("clear_recent_groups"),

    @SerializedName("close_catalog_banner")
    CLOSE_CATALOG_BANNER("close_catalog_banner"),

    @SerializedName("enable_top_newsfeed")
    ENABLE_TOP_NEWSFEED("enable_top_newsfeed"),

    @SerializedName("groups_advertisement")
    GROUPS_ADVERTISEMENT("groups_advertisement"),

    @SerializedName("owner_button")
    OWNER_BUTTON("owner_button"),

    @SerializedName("enter_edit_mode")
    ENTER_EDIT_MODE("enter_edit_mode"),

    @SerializedName("playlists_lists")
    PLAYLISTS_LISTS("playlists_lists"),

    @SerializedName("unfollow_curator")
    UNFOLLOW_CURATOR("unfollow_curator"),

    @SerializedName("unfollow_music_owner")
    UNFOLLOW_MUSIC_OWNER("unfollow_music_owner"),

    @SerializedName("reorder_items")
    REORDER_ITEMS("reorder_items"),

    @SerializedName("edit_items")
    EDIT_ITEMS("edit_items"),

    @SerializedName("select_sorting")
    SELECT_SORTING("select_sorting"),

    @SerializedName("market_clear_recent_queries")
    MARKET_CLEAR_RECENT_QUERIES("market_clear_recent_queries"),

    @SerializedName("market_abandoned_carts")
    MARKET_ABANDONED_CARTS("market_abandoned_carts"),

    @SerializedName("market_write")
    MARKET_WRITE("market_write"),

    @SerializedName("call")
    CALL("call"),

    @SerializedName("close_web_app")
    CLOSE_WEB_APP("close_web_app"),

    @SerializedName("modal_page")
    MODAL_PAGE("modal_page"),

    @SerializedName("live_categories")
    LIVE_CATEGORIES("live_categories"),

    @SerializedName("movie_categories")
    MOVIE_CATEGORIES("movie_categories"),

    @SerializedName("toggle_video_album_subscription")
    TOGGLE_VIDEO_ALBUM_SUBSCRIPTION("toggle_video_album_subscription"),

    @SerializedName("clear_video_history")
    CLEAR_VIDEO_HISTORY("clear_video_history"),

    @SerializedName("help_hint")
    HELP_HINT("help_hint"),

    @SerializedName("open_vkapp")
    OPEN_VKAPP("open_vkapp"),

    @SerializedName("open_game")
    OPEN_GAME("open_game"),

    @SerializedName("open_internal_vkui")
    OPEN_INTERNAL_VKUI("open_internal_vkui"),

    @SerializedName("specials_perform_action")
    SPECIALS_PERFORM_ACTION("specials_perform_action"),

    @SerializedName("open_birthday_modal")
    OPEN_BIRTHDAY_MODAL("open_birthday_modal"),

    @SerializedName("share")
    SHARE("share"),

    @SerializedName("perform_action_with_url")
    PERFORM_ACTION_WITH_URL("perform_action_with_url"),

    @SerializedName("open_search_tab")
    OPEN_SEARCH_TAB("open_search_tab"),

    @SerializedName("hide_block")
    HIDE_BLOCK("hide_block"),

    @SerializedName("market_edit")
    MARKET_EDIT("market_edit"),

    @SerializedName("market_delete")
    MARKET_DELETE("market_delete"),

    @SerializedName("toggle_curator_subscription")
    TOGGLE_CURATOR_SUBSCRIPTION("toggle_curator_subscription"),

    @SerializedName("toggle_artist_subscription")
    TOGGLE_ARTIST_SUBSCRIPTION("toggle_artist_subscription"),

    @SerializedName("toggle_album_subscription")
    TOGGLE_ALBUM_SUBSCRIPTION("toggle_album_subscription"),

    @SerializedName("music_follow_owner")
    MUSIC_FOLLOW_OWNER("music_follow_owner"),

    @SerializedName("upload_audio")
    UPLOAD_AUDIO("upload_audio"),

    @SerializedName("subscribe_ads_acceptance")
    SUBSCRIBE_ADS_ACCEPTANCE("subscribe_ads_acceptance"),

    @SerializedName("sync_contacts")
    SYNC_CONTACTS("sync_contacts"),

    @SerializedName("import_contacts")
    IMPORT_CONTACTS("import_contacts"),

    @SerializedName("add_friends")
    ADD_FRIENDS("add_friends"),

    @SerializedName("close_popup")
    CLOSE_POPUP("close_popup"),

    @SerializedName("onboarding")
    ONBOARDING("onboarding"),

    @SerializedName("groups_my_groups_tabs")
    GROUPS_MY_GROUPS_TABS("groups_my_groups_tabs"),

    @SerializedName("login")
    LOGIN("login");
}
