package com.assignment.simplenotess.di;

import android.content.Context;
import com.assignment.simplenotess.helpers.PreferencesHelper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvideSharedPreferencesHelperFactory implements Factory<PreferencesHelper> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvideSharedPreferencesHelperFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public PreferencesHelper get() {
    return provideSharedPreferencesHelper(contextProvider.get());
  }

  public static AppModule_ProvideSharedPreferencesHelperFactory create(
      Provider<Context> contextProvider) {
    return new AppModule_ProvideSharedPreferencesHelperFactory(contextProvider);
  }

  public static PreferencesHelper provideSharedPreferencesHelper(Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideSharedPreferencesHelper(context));
  }
}
