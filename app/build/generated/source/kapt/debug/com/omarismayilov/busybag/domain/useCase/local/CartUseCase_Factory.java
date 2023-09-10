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
public final class CartUseCase_Factory implements Factory<CartUseCase> {
  private final Provider<ProductRepository> cartRepositoryProvider;

  public CartUseCase_Factory(Provider<ProductRepository> cartRepositoryProvider) {
    this.cartRepositoryProvider = cartRepositoryProvider;
  }

  @Override
  public CartUseCase get() {
    return newInstance(cartRepositoryProvider.get());
  }

  public static CartUseCase_Factory create(Provider<ProductRepository> cartRepositoryProvider) {
    return new CartUseCase_Factory(cartRepositoryProvider);
  }

  public static CartUseCase newInstance(ProductRepository cartRepository) {
    return new CartUseCase(cartRepository);
  }
}
