package com.assignment.simplenotess.data.local

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.assignment.simplenotess.data.model.Note
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

//@inject annotation means that dagger hil will use this constructor to provide instance of databaseHelper
//@ApplicationContext annotation indicates that the context parameter should be injected with the app resources

class DatabaseHelper @Inject constructor(@ApplicationContext context: Context) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "notes.db"
        private const val DATABASE_VERSION = 1

        //users table
        private const val TABLE_USERS = "users"
        private const val COLUMN_USER_ID = "user_id"
        private const val COLUMN_USER_NAME = "user_email"

        //note table
        private const val TABLE_NOTES = "notes"
        private const val COLUMN_NOTE_ID = "note_id"
        private const val COLUMN_NOTE_CONTENT = "note_content"
    }

    override fun onCreate(db: SQLiteDatabase) {
        val createUsersTable = """
              CREATE TABLE $TABLE_USERS (
                $COLUMN_USER_ID TEXT PRIMARY KEY,
                $COLUMN_USER_NAME TEXT
            )  """

        db.execSQL(createUsersTable)


        val createNotesTable =
            """ CREATE TABLE $TABLE_NOTES (
                $COLUMN_NOTE_ID INTEGER PRIMARY KEY AUTOINCREMENT,
                $COLUMN_NOTE_CONTENT TEXT,
                $COLUMN_USER_ID TEXT,
                FOREIGN KEY ($COLUMN_USER_ID) REFERENCES $TABLE_USERS($COLUMN_USER_ID)
            )  """
        db.execSQL(createNotesTable)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        //no need to write anything here since db version is 1
        //on update of db schema, increment db version and write migration logic here
    }


    //CRUD operation
    fun getNotesByUserId(userId: String): List<Note> {
        val db = readableDatabase
        val cursor = db.query(
            TABLE_NOTES,
            null,
            "$COLUMN_USER_ID = ?",
            arrayOf(userId),
            null,
            null,
            null
        )
        val notes = mutableListOf<Note>()
        while (cursor.moveToNext()) {
            val id = cursor.getInt(cursor.getColumnIndexOrThrow(COLUMN_NOTE_ID))
            val content = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NOTE_CONTENT))
            notes.add(Note(id, content))
        }
        cursor.close()
        return notes
    }

    fun insertUser(userId: String, userEmail: String): Long {
        val db = writableDatabase
        val values = ContentValues().apply {
            put(COLUMN_USER_ID, userId)
            put(COLUMN_USER_NAME, userEmail)
        }
        return db.insert(TABLE_USERS, null, values)
    }

    fun insertNote(note: Note, userId: String): Long {
        val db = writableDatabase
        val values = ContentValues().apply {
            put(COLUMN_NOTE_CONTENT, note.content)
            put(COLUMN_USER_ID, userId)
        }
        return db.insert(TABLE_NOTES, null, values)
    }
    fun update(note: Note): Int {
        val db = writableDatabase
        val values = ContentValues().apply {
            put(COLUMN_NOTE_CONTENT, note.content)
        }

        return db.update(TABLE_NOTES, values, "$COLUMN_NOTE_ID = ?", arrayOf(note.id.toString()))
    }

    fun delete(note: Note): Int {
        val db = writableDatabase
        return db.delete(TABLE_NOTES, "$COLUMN_NOTE_ID = ?", arrayOf(note.id.toString()))
    }

}



/*
Foreign Key - It is is constraint that ensures that user_id in notes table must be exist in User table
if we try to insert note with userid that doesn't exist on users table db will throw error
*/