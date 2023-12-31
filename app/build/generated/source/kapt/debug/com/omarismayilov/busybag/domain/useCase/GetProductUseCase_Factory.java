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
public final class GetProductUseCase_Factory implements Factory<GetProductUseCase> {
  private final Provider<ProductRepository> repositoryProvider;

  public GetProductUseCase_Factory(Provider<ProductRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetProductUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetProductUseCase_Factory create(Provider<ProductRepository> repositoryProvider) {
    return new GetProductUseCase_Factory(repositoryProvider);
  }

  public static GetProductUseCase newInstance(ProductRepository repository) {
    return new GetProductUseCase(repository);
  }
}
