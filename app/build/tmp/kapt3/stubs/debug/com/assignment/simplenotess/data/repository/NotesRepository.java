package com.assignment.simplenotess.data.repository;

import com.assignment.simplenotess.data.local.DatabaseHelper;
import com.assignment.simplenotess.data.model.Note;
import com.assignment.simplenotess.helpers.PreferencesHelper;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/assignment/simplenotess/data/repository/NotesRepository;", "", "dtabaseHelper", "Lcom/assignment/simplenotess/data/local/DatabaseHelper;", "preferenceshelper", "Lcom/assignment/simplenotess/helpers/PreferencesHelper;", "(Lcom/assignment/simplenotess/data/local/DatabaseHelper;Lcom/assignment/simplenotess/helpers/PreferencesHelper;)V", "addNote", "", "note", "Lcom/assignment/simplenotess/data/model/Note;", "addUser", "userId", "", "userEmail", "deleteNote", "", "getAllNotes", "", "updateNote", "app_debug"})
public final class NotesRepository {
    @org.jetbrains.annotations.NotNull
    private final com.assignment.simplenotess.data.local.DatabaseHelper dtabaseHelper = null;
    @org.jetbrains.annotations.NotNull
    private final com.assignment.simplenotess.helpers.PreferencesHelper preferenceshelper = null;
    
    @javax.inject.Inject
    public NotesRepository(@org.jetbrains.annotations.NotNull
    com.assignment.simplenotess.data.local.DatabaseHelper dtabaseHelper, @org.jetbrains.annotations.NotNull
    com.assignment.simplenotess.helpers.PreferencesHelper preferenceshelper) {
        super();
    }
    
    public final void addUser(@org.jetbrains.annotations.NotNull
    java.lang.String userId, @org.jetbrains.annotations.NotNull
    java.lang.String userEmail) {
    }
    
    public final void addNote(@org.jetbrains.annotations.NotNull
    com.assignment.simplenotess.data.model.Note note) {
    }
    
    public final int updateNote(@org.jetbrains.annotations.NotNull
    com.assignment.simplenotess.data.model.Note note) {
        return 0;
    }
    
    public final int deleteNote(@org.jetbrains.annotations.NotNull
    com.assignment.simplenotess.data.model.Note note) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.assignment.simplenotess.data.model.Note> getAllNotes() {
        return null;
    }
}