package com.assignment.simplenotess.data.local;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class DatabaseHelper_Factory implements Factory<DatabaseHelper> {
  private final Provider<Context> contextProvider;

  public DatabaseHelper_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public DatabaseHelper get() {
    return newInstance(contextProvider.get());
  }

  public static DatabaseHelper_Factory create(Provider<Context> contextProvider) {
    return new DatabaseHelper_Factory(contextProvider);
  }

  public static DatabaseHelper newInstance(Context context) {
    return new DatabaseHelper(context);
  }
}
