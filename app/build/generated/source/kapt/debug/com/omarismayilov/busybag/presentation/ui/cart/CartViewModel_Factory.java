package com.omarismayilov.busybag.presentation.ui.cart;

import com.omarismayilov.busybag.domain.useCase.local.CartUseCase;
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
public final class CartViewModel_Factory implements Factory<CartViewModel> {
  private final Provider<CartUseCase> cartUseCaseProvider;

  public CartViewModel_Factory(Provider<CartUseCase> cartUseCaseProvider) {
    this.cartUseCaseProvider = cartUseCaseProvider;
  }

  @Override
  public CartViewModel get() {
    return newInstance(cartUseCaseProvider.get());
  }

  public static CartViewModel_Factory create(Provider<CartUseCase> cartUseCaseProvider) {
    return new CartViewModel_Factory(cartUseCaseProvider);
  }

  public static CartViewModel newInstance(CartUseCase cartUseCase) {
    return new CartViewModel(cartUseCase);
  }
}
