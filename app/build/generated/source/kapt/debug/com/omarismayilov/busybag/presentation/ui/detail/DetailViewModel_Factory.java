package com.omarismayilov.busybag.presentation.ui.detail;

import com.omarismayilov.busybag.domain.useCase.GetProductUseCase;
import com.omarismayilov.busybag.domain.useCase.local.FavUseCase;
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

  private final Provider<FavUseCase> favUseCaseProvider;

  public DetailViewModel_Factory(Provider<GetProductUseCase> getProductUseCaseProvider,
      Provider<FavUseCase> favUseCaseProvider) {
    this.getProductUseCaseProvider = getProductUseCaseProvider;
    this.favUseCaseProvider = favUseCaseProvider;
  }

  @Override
  public DetailViewModel get() {
    return newInstance(getProductUseCaseProvider.get(), favUseCaseProvider.get());
  }

  public static DetailViewModel_Factory create(
      Provider<GetProductUseCase> getProductUseCaseProvider,
      Provider<FavUseCase> favUseCaseProvider) {
    return new DetailViewModel_Factory(getProductUseCaseProvider, favUseCaseProvider);
  }

  public static DetailViewModel newInstance(GetProductUseCase getProductUseCase,
      FavUseCase favUseCase) {
    return new DetailViewModel(getProductUseCase, favUseCase);
  }
}
