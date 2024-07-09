package com.assignment.simplenotess.di;

import android.content.Context;
import com.assignment.simplenotess.data.local.DatabaseHelper;
import com.assignment.simplenotess.data.repository.NotesRepository;
import com.assignment.simplenotess.helpers.PreferencesHelper;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Singleton;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\r"}, d2 = {"Lcom/assignment/simplenotess/di/AppModule;", "", "()V", "provideNotesDatabaseHelper", "Lcom/assignment/simplenotess/data/local/DatabaseHelper;", "context", "Landroid/content/Context;", "provideNotesRepository", "Lcom/assignment/simplenotess/data/repository/NotesRepository;", "notesDatabaseHelper", "sharedPreferencesHelper", "Lcom/assignment/simplenotess/helpers/PreferencesHelper;", "provideSharedPreferencesHelper", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.assignment.simplenotess.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.assignment.simplenotess.data.local.DatabaseHelper provideNotesDatabaseHelper(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.assignment.simplenotess.data.repository.NotesRepository provideNotesRepository(@org.jetbrains.annotations.NotNull
    com.assignment.simplenotess.data.local.DatabaseHelper notesDatabaseHelper, @org.jetbrains.annotations.NotNull
    com.assignment.simplenotess.helpers.PreferencesHelper sharedPreferencesHelper) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.assignment.simplenotess.helpers.PreferencesHelper provideSharedPreferencesHelper(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
}