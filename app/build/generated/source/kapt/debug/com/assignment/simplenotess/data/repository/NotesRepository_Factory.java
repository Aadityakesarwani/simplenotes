package com.assignment.simplenotess.data.repository;

import com.assignment.simplenotess.data.local.DatabaseHelper;
import com.assignment.simplenotess.helpers.PreferencesHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class NotesRepository_Factory implements Factory<NotesRepository> {
  private final Provider<DatabaseHelper> dtabaseHelperProvider;

  private final Provider<PreferencesHelper> preferenceshelperProvider;

  public NotesRepository_Factory(Provider<DatabaseHelper> dtabaseHelperProvider,
      Provider<PreferencesHelper> preferenceshelperProvider) {
    this.dtabaseHelperProvider = dtabaseHelperProvider;
    this.preferenceshelperProvider = preferenceshelperProvider;
  }

  @Override
  public NotesRepository get() {
    return newInstance(dtabaseHelperProvider.get(), preferenceshelperProvider.get());
  }

  public static NotesRepository_Factory create(Provider<DatabaseHelper> dtabaseHelperProvider,
      Provider<PreferencesHelper> preferenceshelperProvider) {
    return new NotesRepository_Factory(dtabaseHelperProvider, preferenceshelperProvider);
  }

  public static NotesRepository newInstance(DatabaseHelper dtabaseHelper,
      PreferencesHelper preferenceshelper) {
    return new NotesRepository(dtabaseHelper, preferenceshelper);
  }
}
