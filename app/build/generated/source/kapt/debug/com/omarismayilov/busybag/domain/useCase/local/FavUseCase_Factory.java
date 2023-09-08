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
public final class FavUseCase_Factory implements Factory<FavUseCase> {
  private final Provider<ProductRepository> repositoryProvider;

  public FavUseCase_Factory(Provider<ProductRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public FavUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static FavUseCase_Factory create(Provider<ProductRepository> repositoryProvider) {
    return new FavUseCase_Factory(repositoryProvider);
  }

  public static FavUseCase newInstance(ProductRepository repository) {
    return new FavUseCase(repository);
  }
}
