package com.omarismayilov.busybag.domain.useCase.local;

import com.omarismayilov.busybag.domain.repository.ProductRepository;
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
public final class FavoriteUseCase_Factory implements Factory<FavoriteUseCase> {
  private final Provider<ProductRepository> repositoryProvider;

  public FavoriteUseCase_Factory(Provider<ProductRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public FavoriteUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static FavoriteUseCase_Factory create(Provider<ProductRepository> repositoryProvider) {
    return new FavoriteUseCase_Factory(repositoryProvider);
  }

  public static FavoriteUseCase newInstance(ProductRepository repository) {
    return new FavoriteUseCase(repository);
  }
}
