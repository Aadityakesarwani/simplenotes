package com.assignment.simplenotess.helpers

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PreferencesHelper @Inject constructor(@ApplicationContext context: Context) {

    private val preferences: SharedPreferences =
        context.getSharedPreferences("simple_notes_prefs", Context.MODE_PRIVATE)

    fun isLoggedIn(): Boolean {
        return preferences.getBoolean(LOGGED_IN, false)
    }

    fun setLoggedInUser(userId: String) {
        preferences.edit {
            putBoolean(LOGGED_IN, true)

            putString(USER_ID, userId)
        }
    }

    fun getLoggedInUserId(): String? {
        return preferences.getString(USER_ID, null)
    }

    fun clearLoggedInUser() {
        preferences.edit {
            putBoolean(LOGGED_IN, false)
            remove(USER_ID)
        }
    }

    companion object {
        private const val LOGGED_IN = "logged_in"
        private const val USER_ID = "user_id"
    }
}