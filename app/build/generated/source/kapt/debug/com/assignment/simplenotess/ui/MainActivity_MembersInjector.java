package com.assignment.simplenotess.ui;

import com.assignment.simplenotess.helpers.PreferencesHelper;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<PreferencesHelper> sharedPreferencesHelperProvider;

  public MainActivity_MembersInjector(Provider<PreferencesHelper> sharedPreferencesHelperProvider) {
    this.sharedPreferencesHelperProvider = sharedPreferencesHelperProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<PreferencesHelper> sharedPreferencesHelperProvider) {
    return new MainActivity_MembersInjector(sharedPreferencesHelperProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectSharedPreferencesHelper(instance, sharedPreferencesHelperProvider.get());
  }

  @InjectedFieldSignature("com.assignment.simplenotess.ui.MainActivity.sharedPreferencesHelper")
  public static void injectSharedPreferencesHelper(MainActivity instance,
      PreferencesHelper sharedPreferencesHelper) {
    instance.sharedPreferencesHelper = sharedPreferencesHelper;
  }
}
