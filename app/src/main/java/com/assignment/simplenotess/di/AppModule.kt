package com.assignment.simplenotess.di


import android.content.Context
import com.assignment.simplenotess.data.local.DatabaseHelper
import com.assignment.simplenotess.data.repository.NotesRepository
import com.assignment.simplenotess.helpers.PreferencesHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

//this module provides instruction on how to create and provide instances of defined functions within the singltoncomponent
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNotesDatabaseHelper(@ApplicationContext context: Context): DatabaseHelper {
        return DatabaseHelper(context)
    }

    @Provides
    @Singleton
    fun provideNotesRepository(notesDatabaseHelper: DatabaseHelper, sharedPreferencesHelper: PreferencesHelper): NotesRepository {
        return NotesRepository(notesDatabaseHelper,sharedPreferencesHelper)
    }

    @Provides
    @Singleton
    fun provideSharedPreferencesHelper(@ApplicationContext context: Context): PreferencesHelper {
        return PreferencesHelper(context)
    }
}
