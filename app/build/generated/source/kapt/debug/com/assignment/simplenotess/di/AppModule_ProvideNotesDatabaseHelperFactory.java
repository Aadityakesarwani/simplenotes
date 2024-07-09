package com.assignment.simplenotess.di;

import android.content.Context;
import com.assignment.simplenotess.data.local.DatabaseHelper;
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
public final class AppModule_ProvideNotesDatabaseHelperFactory implements Factory<DatabaseHelper> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvideNotesDatabaseHelperFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public DatabaseHelper get() {
    return provideNotesDatabaseHelper(contextProvider.get());
  }

  public static AppModule_ProvideNotesDatabaseHelperFactory create(
      Provider<Context> contextProvider) {
    return new AppModule_ProvideNotesDatabaseHelperFactory(contextProvider);
  }

  public static DatabaseHelper provideNotesDatabaseHelper(Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideNotesDatabaseHelper(context));
  }
}
