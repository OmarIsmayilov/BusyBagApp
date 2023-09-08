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
public final class GetCategoryUseCase_Factory implements Factory<GetCategoryUseCase> {
  private final Provider<ProductRepository> productRepositoryProvider;

  public GetCategoryUseCase_Factory(Provider<ProductRepository> productRepositoryProvider) {
    this.productRepositoryProvider = productRepositoryProvider;
  }

  @Override
  public GetCategoryUseCase get() {
    return newInstance(productRepositoryProvider.get());
  }

  public static GetCategoryUseCase_Factory create(
      Provider<ProductRepository> productRepositoryProvider) {
    return new GetCategoryUseCase_Factory(productRepositoryProvider);
  }

  public static GetCategoryUseCase newInstance(ProductRepository productRepository) {
    return new GetCategoryUseCase(productRepository);
  }
}
