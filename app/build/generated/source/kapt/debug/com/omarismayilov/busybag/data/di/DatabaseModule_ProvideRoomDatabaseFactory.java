package com.omarismayilov.busybag.data.di;

import android.content.Context;
import com.omarismayilov.busybag.data.local.FavoriteDB;
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
public final class DatabaseModule_ProvideRoomDatabaseFactory implements Factory<FavoriteDB> {
  private final Provider<Context> contextProvider;

  public DatabaseModule_ProvideRoomDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public FavoriteDB get() {
    return provideRoomDatabase(contextProvider.get());
  }

  public static DatabaseModule_ProvideRoomDatabaseFactory create(
      Provider<Context> contextProvider) {
    return new DatabaseModule_ProvideRoomDatabaseFactory(contextProvider);
  }

  public static FavoriteDB provideRoomDatabase(Context context) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideRoomDatabase(context));
  }
}
