package com.assignment.simplenotess.helpers;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PreferencesHelper_Factory implements Factory<PreferencesHelper> {
  private final Provider<Context> contextProvider;

  public PreferencesHelper_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public PreferencesHelper get() {
    return newInstance(contextProvider.get());
  }

  public static PreferencesHelper_Factory create(Provider<Context> contextProvider) {
    return new PreferencesHelper_Factory(contextProvider);
  }

  public static PreferencesHelper newInstance(Context context) {
    return new PreferencesHelper(context);
  }
}
