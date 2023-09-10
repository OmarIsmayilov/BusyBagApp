package com.omarismayilov.busybag.data.di;

import com.omarismayilov.busybag.data.local.FavoriteDB;
import com.omarismayilov.busybag.data.local.cart.CartDAO;
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
public final class DatabaseModule_ProvideCartDaoFactory implements Factory<CartDAO> {
  private final Provider<FavoriteDB> dbProvider;

  public DatabaseModule_ProvideCartDaoFactory(Provider<FavoriteDB> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public CartDAO get() {
    return provideCartDao(dbProvider.get());
  }

  public static DatabaseModule_ProvideCartDaoFactory create(Provider<FavoriteDB> dbProvider) {
    return new DatabaseModule_ProvideCartDaoFactory(dbProvider);
  }

  public static CartDAO provideCartDao(FavoriteDB db) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideCartDao(db));
  }
}
