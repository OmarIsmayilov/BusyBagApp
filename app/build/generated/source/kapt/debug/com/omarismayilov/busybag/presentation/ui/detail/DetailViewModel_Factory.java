package com.omarismayilov.busybag.presentation.ui.detail;

import com.omarismayilov.busybag.domain.useCase.GetProductUseCase;
import com.omarismayilov.busybag.domain.useCase.local.CartUseCase;
import com.omarismayilov.busybag.domain.useCase.local.FavoriteUseCase;
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
public final class DetailViewModel_Factory implements Factory<DetailViewModel> {
  private final Provider<GetProductUseCase> getProductUseCaseProvider;

  private final Provider<FavoriteUseCase> favoriteUseCaseProvider;

  private final Provider<CartUseCase> cartUseCaseProvider;

  public DetailViewModel_Factory(Provider<GetProductUseCase> getProductUseCaseProvider,
      Provider<FavoriteUseCase> favoriteUseCaseProvider,
      Provider<CartUseCase> cartUseCaseProvider) {
    this.getProductUseCaseProvider = getProductUseCaseProvider;
    this.favoriteUseCaseProvider = favoriteUseCaseProvider;
    this.cartUseCaseProvider = cartUseCaseProvider;
  }

  @Override
  public DetailViewModel get() {
    return newInstance(getProductUseCaseProvider.get(), favoriteUseCaseProvider.get(), cartUseCaseProvider.get());
  }

  public static DetailViewModel_Factory create(
      Provider<GetProductUseCase> getProductUseCaseProvider,
      Provider<FavoriteUseCase> favoriteUseCaseProvider,
      Provider<CartUseCase> cartUseCaseProvider) {
    return new DetailViewModel_Factory(getProductUseCaseProvider, favoriteUseCaseProvider, cartUseCaseProvider);
  }

  public static DetailViewModel newInstance(GetProductUseCase getProductUseCase,
      FavoriteUseCase favoriteUseCase, CartUseCase cartUseCase) {
    return new DetailViewModel(getProductUseCase, favoriteUseCase, cartUseCase);
  }
}
