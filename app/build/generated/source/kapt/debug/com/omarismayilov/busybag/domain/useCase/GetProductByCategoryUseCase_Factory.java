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
public final class GetProductByCategoryUseCase_Factory implements Factory<GetProductByCategoryUseCase> {
  private final Provider<ProductRepository> productRepositoryProvider;

  public GetProductByCategoryUseCase_Factory(
      Provider<ProductRepository> productRepositoryProvider) {
    this.productRepositoryProvider = productRepositoryProvider;
  }

  @Override
  public GetProductByCategoryUseCase get() {
    return newInstance(productRepositoryProvider.get());
  }

  public static GetProductByCategoryUseCase_Factory create(
      Provider<ProductRepository> productRepositoryProvider) {
    return new GetProductByCategoryUseCase_Factory(productRepositoryProvider);
  }

  public static GetProductByCategoryUseCase newInstance(ProductRepository productRepository) {
    return new GetProductByCategoryUseCase(productRepository);
  }
}
