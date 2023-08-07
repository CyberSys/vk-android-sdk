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
package com.vk.sdk.api.notes

import com.vk.api.sdk.requests.VKRequest
import com.vk.dto.common.id.UserId
import com.vk.sdk.api.GsonHolder
import com.vk.sdk.api.NewApiRequest
import com.vk.sdk.api.base.dto.BaseOkResponseDto
import com.vk.sdk.api.mapToJsonPrimitive
import com.vk.sdk.api.notes.dto.NotesGetCommentsResponseDto
import com.vk.sdk.api.notes.dto.NotesGetCommentsSortDto
import com.vk.sdk.api.notes.dto.NotesGetResponseDto
import com.vk.sdk.api.notes.dto.NotesGetSortDto
import com.vk.sdk.api.notes.dto.NotesNoteDto
import com.vk.sdk.api.parse
import com.vk.sdk.api.parseList
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List

class NotesService {
    /**
     * Creates a new note for the current user.
     *
     * @param title - Note title.
     * @param text - Note text.
     * @param privacyView
     * @param privacyComment
     * @return [VKRequest] with [Int]
     */
    fun notesAdd(
        title: String,
        text: String,
        privacyView: List<String>? = null,
        privacyComment: List<String>? = null
    ): VKRequest<Int> = NewApiRequest("notes.add") {
        GsonHolder.gson.parse<Int>(it)
    }
    .apply {
        addParam("title", title)
        addParam("text", text)
        privacyView?.let { addParam("privacy_view", it) }
        privacyComment?.let { addParam("privacy_comment", it) }
    }

    /**
     * Adds a new comment on a note.
     *
     * @param noteId - Note ID.
     * @param message - Comment text.
     * @param ownerId - Note owner ID.
     * @param replyTo - ID of the user to whom the reply is addressed (if the comment is a reply to
     * another comment).
     * @param guid
     * @return [VKRequest] with [Int]
     */
    fun notesCreateComment(
        noteId: Int,
        message: String,
        ownerId: UserId? = null,
        replyTo: Int? = null,
        guid: String? = null
    ): VKRequest<Int> = NewApiRequest("notes.createComment") {
        GsonHolder.gson.parse<Int>(it)
    }
    .apply {
        addParam("note_id", noteId, min = 0)
        addParam("message", message)
        ownerId?.let { addParam("owner_id", it, min = 0) }
        replyTo?.let { addParam("reply_to", it, min = 0) }
        guid?.let { addParam("guid", it) }
    }

    /**
     * Deletes a note of the current user.
     *
     * @param noteId - Note ID.
     * @return [VKRequest] with [BaseOkResponseDto]
     */
    fun notesDelete(noteId: Int): VKRequest<BaseOkResponseDto> = NewApiRequest("notes.delete") {
        GsonHolder.gson.parse<BaseOkResponseDto>(it)
    }
    .apply {
        addParam("note_id", noteId, min = 0)
    }

    /**
     * Deletes a comment on a note.
     *
     * @param commentId - Comment ID.
     * @param ownerId - Note owner ID.
     * @return [VKRequest] with [BaseOkResponseDto]
     */
    fun notesDeleteComment(commentId: Int, ownerId: UserId? = null): VKRequest<BaseOkResponseDto> =
            NewApiRequest("notes.deleteComment") {
        GsonHolder.gson.parse<BaseOkResponseDto>(it)
    }
    .apply {
        addParam("comment_id", commentId, min = 0)
        ownerId?.let { addParam("owner_id", it, min = 0) }
    }

    /**
     * Edits a note of the current user.
     *
     * @param noteId - Note ID.
     * @param title - Note title.
     * @param text - Note text.
     * @param privacyView
     * @param privacyComment
     * @return [VKRequest] with [BaseOkResponseDto]
     */
    fun notesEdit(
        noteId: Int,
        title: String,
        text: String,
        privacyView: List<String>? = null,
        privacyComment: List<String>? = null
    ): VKRequest<BaseOkResponseDto> = NewApiRequest("notes.edit") {
        GsonHolder.gson.parse<BaseOkResponseDto>(it)
    }
    .apply {
        addParam("note_id", noteId, min = 0)
        addParam("title", title)
        addParam("text", text)
        privacyView?.let { addParam("privacy_view", it) }
        privacyComment?.let { addParam("privacy_comment", it) }
    }

    /**
     * Edits a comment on a note.
     *
     * @param commentId - Comment ID.
     * @param message - New comment text.
     * @param ownerId - Note owner ID.
     * @return [VKRequest] with [BaseOkResponseDto]
     */
    fun notesEditComment(
        commentId: Int,
        message: String,
        ownerId: UserId? = null
    ): VKRequest<BaseOkResponseDto> = NewApiRequest("notes.editComment") {
        GsonHolder.gson.parse<BaseOkResponseDto>(it)
    }
    .apply {
        addParam("comment_id", commentId, min = 0)
        addParam("message", message, minLength = 2)
        ownerId?.let { addParam("owner_id", it, min = 0) }
    }

    /**
     * Returns a list of notes created by a user.
     *
     * @param noteIds - Note IDs.
     * @param userId - Note owner ID.
     * @param offset
     * @param count - Number of notes to return.
     * @param sort
     * @return [VKRequest] with [NotesGetResponseDto]
     */
    fun notesGet(
        noteIds: List<Int>? = null,
        userId: UserId? = null,
        offset: Int? = null,
        count: Int? = null,
        sort: NotesGetSortDto? = null
    ): VKRequest<NotesGetResponseDto> = NewApiRequest("notes.get") {
        GsonHolder.gson.parse<NotesGetResponseDto>(it)
    }
    .apply {
        noteIds?.let { addParam("note_ids", it) }
        userId?.let { addParam("user_id", it, min = 0) }
        offset?.let { addParam("offset", it, min = 0) }
        count?.let { addParam("count", it, min = 0, max = 100) }
        sort?.let { addParam("sort", it.value) }
    }

    /**
     * Returns a note by its ID.
     *
     * @param noteId - Note ID.
     * @param ownerId - Note owner ID.
     * @param needWiki
     * @return [VKRequest] with [NotesNoteDto]
     */
    fun notesGetById(
        noteId: Int,
        ownerId: UserId? = null,
        needWiki: Boolean? = null
    ): VKRequest<NotesNoteDto> = NewApiRequest("notes.getById") {
        GsonHolder.gson.parse<NotesNoteDto>(it)
    }
    .apply {
        addParam("note_id", noteId, min = 0)
        ownerId?.let { addParam("owner_id", it, min = 0) }
        needWiki?.let { addParam("need_wiki", it) }
    }

    /**
     * Returns a list of comments on a note.
     *
     * @param noteId - Note ID.
     * @param ownerId - Note owner ID.
     * @param sort
     * @param offset
     * @param count - Number of comments to return.
     * @return [VKRequest] with [NotesGetCommentsResponseDto]
     */
    fun notesGetComments(
        noteId: Int,
        ownerId: UserId? = null,
        sort: NotesGetCommentsSortDto? = null,
        offset: Int? = null,
        count: Int? = null
    ): VKRequest<NotesGetCommentsResponseDto> = NewApiRequest("notes.getComments") {
        GsonHolder.gson.parse<NotesGetCommentsResponseDto>(it)
    }
    .apply {
        addParam("note_id", noteId, min = 0)
        ownerId?.let { addParam("owner_id", it, min = 0) }
        sort?.let { addParam("sort", it.value) }
        offset?.let { addParam("offset", it, min = 0) }
        count?.let { addParam("count", it, min = 0, max = 100) }
    }

    /**
     * Restores a deleted comment on a note.
     *
     * @param commentId - Comment ID.
     * @param ownerId - Note owner ID.
     * @return [VKRequest] with [BaseOkResponseDto]
     */
    fun notesRestoreComment(commentId: Int, ownerId: UserId? = null): VKRequest<BaseOkResponseDto> =
            NewApiRequest("notes.restoreComment") {
        GsonHolder.gson.parse<BaseOkResponseDto>(it)
    }
    .apply {
        addParam("comment_id", commentId, min = 0)
        ownerId?.let { addParam("owner_id", it, min = 0) }
    }

    object NotesCreateCommentRestrictions {
        const val NOTE_ID_MIN: Long = 0

        const val OWNER_ID_MIN: Long = 0

        const val REPLY_TO_MIN: Long = 0
    }

    object NotesDeleteRestrictions {
        const val NOTE_ID_MIN: Long = 0
    }

    object NotesDeleteCommentRestrictions {
        const val COMMENT_ID_MIN: Long = 0

        const val OWNER_ID_MIN: Long = 0
    }

    object NotesEditRestrictions {
        const val NOTE_ID_MIN: Long = 0
    }

    object NotesEditCommentRestrictions {
        const val COMMENT_ID_MIN: Long = 0

        const val MESSAGE_MIN_LENGTH: Int = 2

        const val OWNER_ID_MIN: Long = 0
    }

    object NotesGetRestrictions {
        const val USER_ID_MIN: Long = 0

        const val OFFSET_MIN: Long = 0

        const val COUNT_MIN: Long = 0

        const val COUNT_MAX: Long = 100

        const val SORT_MIN: Long = 0
    }

    object NotesGetByIdRestrictions {
        const val NOTE_ID_MIN: Long = 0

        const val OWNER_ID_MIN: Long = 0
    }

    object NotesGetCommentsRestrictions {
        const val NOTE_ID_MIN: Long = 0

        const val OWNER_ID_MIN: Long = 0

        const val SORT_MIN: Long = 0

        const val OFFSET_MIN: Long = 0

        const val COUNT_MIN: Long = 0

        const val COUNT_MAX: Long = 100
    }

    object NotesRestoreCommentRestrictions {
        const val COMMENT_ID_MIN: Long = 0

        const val OWNER_ID_MIN: Long = 0
    }
}
