package com.omarismayilov.busybag.domain.useCase;

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
public final class GetProductsUseCase_Factory implements Factory<GetProductsUseCase> {
  private final Provider<ProductRepository> repositoryProvider;

  public GetProductsUseCase_Factory(Provider<ProductRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetProductsUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetProductsUseCase_Factory create(Provider<ProductRepository> repositoryProvider) {
    return new GetProductsUseCase_Factory(repositoryProvider);
  }

  public static GetProductsUseCase newInstance(ProductRepository repository) {
    return new GetProductsUseCase(repository);
  }
}
