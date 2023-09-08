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
public final class GetOfferUseCase_Factory implements Factory<GetOfferUseCase> {
  private final Provider<ProductRepository> productRepositoryProvider;

  public GetOfferUseCase_Factory(Provider<ProductRepository> productRepositoryProvider) {
    this.productRepositoryProvider = productRepositoryProvider;
  }

  @Override
  public GetOfferUseCase get() {
    return newInstance(productRepositoryProvider.get());
  }

  public static GetOfferUseCase_Factory create(
      Provider<ProductRepository> productRepositoryProvider) {
    return new GetOfferUseCase_Factory(productRepositoryProvider);
  }

  public static GetOfferUseCase newInstance(ProductRepository productRepository) {
    return new GetOfferUseCase(productRepository);
  }
}
