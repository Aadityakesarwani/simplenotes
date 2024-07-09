package com.assignment.simplenotess.data.repository

import com.assignment.simplenotess.data.local.DatabaseHelper
import com.assignment.simplenotess.data.model.Note
import com.assignment.simplenotess.helpers.PreferencesHelper
import javax.inject.Inject

class NotesRepository @Inject constructor(
    private val dtabaseHelper: DatabaseHelper,
    private val preferenceshelper: PreferencesHelper

) {

    fun addUser(userId: String, userEmail: String) {
        dtabaseHelper.insertUser(userId, userEmail)
    }

    fun addNote(note: Note) {
        val userId = preferenceshelper.getLoggedInUserId()
        //only logged in users can add notes
        if (userId != null) {
            dtabaseHelper.insertNote(note, userId)
        }
    }

    fun updateNote(note: Note): Int {
        return dtabaseHelper.update(note)
    }

    fun deleteNote(note: Note): Int {
        return dtabaseHelper.delete(note)
    }

    fun getAllNotes(): List<Note> {
        val userId = preferenceshelper.getLoggedInUserId()
        return if (userId != null) {
            dtabaseHelper.getNotesByUserId(userId)
        } else {
            emptyList()
        }
    }
}
