package com.omarismayilov.busybag.data.di;

import com.omarismayilov.busybag.data.local.FavoriteDB;
import com.omarismayilov.busybag.data.local.favorite.FavoriteDAO;
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
public final class DatabaseModule_ProvideFavDaoFactory implements Factory<FavoriteDAO> {
  private final Provider<FavoriteDB> dbProvider;

  public DatabaseModule_ProvideFavDaoFactory(Provider<FavoriteDB> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public FavoriteDAO get() {
    return provideFavDao(dbProvider.get());
  }

  public static DatabaseModule_ProvideFavDaoFactory create(Provider<FavoriteDB> dbProvider) {
    return new DatabaseModule_ProvideFavDaoFactory(dbProvider);
  }

  public static FavoriteDAO provideFavDao(FavoriteDB db) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideFavDao(db));
  }
}
