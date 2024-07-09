package com.assignment.simplenotess.di;

import com.assignment.simplenotess.data.local.DatabaseHelper;
import com.assignment.simplenotess.data.repository.NotesRepository;
import com.assignment.simplenotess.helpers.PreferencesHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideNotesRepositoryFactory implements Factory<NotesRepository> {
  private final Provider<DatabaseHelper> notesDatabaseHelperProvider;

  private final Provider<PreferencesHelper> sharedPreferencesHelperProvider;

  public AppModule_ProvideNotesRepositoryFactory(
      Provider<DatabaseHelper> notesDatabaseHelperProvider,
      Provider<PreferencesHelper> sharedPreferencesHelperProvider) {
    this.notesDatabaseHelperProvider = notesDatabaseHelperProvider;
    this.sharedPreferencesHelperProvider = sharedPreferencesHelperProvider;
  }

  @Override
  public NotesRepository get() {
    return provideNotesRepository(notesDatabaseHelperProvider.get(), sharedPreferencesHelperProvider.get());
  }

  public static AppModule_ProvideNotesRepositoryFactory create(
      Provider<DatabaseHelper> notesDatabaseHelperProvider,
      Provider<PreferencesHelper> sharedPreferencesHelperProvider) {
    return new AppModule_ProvideNotesRepositoryFactory(notesDatabaseHelperProvider, sharedPreferencesHelperProvider);
  }

  public static NotesRepository provideNotesRepository(DatabaseHelper notesDatabaseHelper,
      PreferencesHelper sharedPreferencesHelper) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideNotesRepository(notesDatabaseHelper, sharedPreferencesHelper));
  }
}
