package com.assignment.simplenotess.data.local;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.assignment.simplenotess.data.model.Note;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\"\u0010\u0015\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0016J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\u001a"}, d2 = {"Lcom/assignment/simplenotess/data/local/DatabaseHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "delete", "", "note", "Lcom/assignment/simplenotess/data/model/Note;", "getNotesByUserId", "", "userId", "", "insertNote", "", "insertUser", "userEmail", "onCreate", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onUpgrade", "oldVersion", "newVersion", "update", "Companion", "app_debug"})
public final class DatabaseHelper extends android.database.sqlite.SQLiteOpenHelper {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String DATABASE_NAME = "notes.db";
    private static final int DATABASE_VERSION = 1;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TABLE_USERS = "users";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String COLUMN_USER_ID = "user_id";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String COLUMN_USER_NAME = "user_email";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TABLE_NOTES = "notes";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String COLUMN_NOTE_ID = "note_id";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String COLUMN_NOTE_CONTENT = "note_content";
    @org.jetbrains.annotations.NotNull
    public static final com.assignment.simplenotess.data.local.DatabaseHelper.Companion Companion = null;
    
    @javax.inject.Inject
    public DatabaseHelper(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, null, 0);
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.NotNull
    android.database.sqlite.SQLiteDatabase db) {
    }
    
    @java.lang.Override
    public void onUpgrade(@org.jetbrains.annotations.Nullable
    android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.assignment.simplenotess.data.model.Note> getNotesByUserId(@org.jetbrains.annotations.NotNull
    java.lang.String userId) {
        return null;
    }
    
    public final long insertUser(@org.jetbrains.annotations.NotNull
    java.lang.String userId, @org.jetbrains.annotations.NotNull
    java.lang.String userEmail) {
        return 0L;
    }
    
    public final long insertNote(@org.jetbrains.annotations.NotNull
    com.assignment.simplenotess.data.model.Note note, @org.jetbrains.annotations.NotNull
    java.lang.String userId) {
        return 0L;
    }
    
    public final int update(@org.jetbrains.annotations.NotNull
    com.assignment.simplenotess.data.model.Note note) {
        return 0;
    }
    
    public final int delete(@org.jetbrains.annotations.NotNull
    com.assignment.simplenotess.data.model.Note note) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/assignment/simplenotess/data/local/DatabaseHelper$Companion;", "", "()V", "COLUMN_NOTE_CONTENT", "", "COLUMN_NOTE_ID", "COLUMN_USER_ID", "COLUMN_USER_NAME", "DATABASE_NAME", "DATABASE_VERSION", "", "TABLE_NOTES", "TABLE_USERS", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}