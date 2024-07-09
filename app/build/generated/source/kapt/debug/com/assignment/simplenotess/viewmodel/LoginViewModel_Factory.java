package com.assignment.simplenotess.viewmodel;

import com.assignment.simplenotess.data.repository.NotesRepository;
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
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<PreferencesHelper> preferencesHelperProvider;

  private final Provider<NotesRepository> notesRepositoryProvider;

  public LoginViewModel_Factory(Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<NotesRepository> notesRepositoryProvider) {
    this.preferencesHelperProvider = preferencesHelperProvider;
    this.notesRepositoryProvider = notesRepositoryProvider;
  }

  @Override
  public LoginViewModel get() {
    return newInstance(preferencesHelperProvider.get(), notesRepositoryProvider.get());
  }

  public static LoginViewModel_Factory create(Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<NotesRepository> notesRepositoryProvider) {
    return new LoginViewModel_Factory(preferencesHelperProvider, notesRepositoryProvider);
  }

  public static LoginViewModel newInstance(PreferencesHelper preferencesHelper,
      NotesRepository notesRepository) {
    return new LoginViewModel(preferencesHelper, notesRepository);
  }
}
