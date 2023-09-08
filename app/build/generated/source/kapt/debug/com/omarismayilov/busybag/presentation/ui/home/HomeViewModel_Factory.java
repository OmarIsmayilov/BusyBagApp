package com.omarismayilov.busybag.presentation.ui.home;

import com.omarismayilov.busybag.domain.useCase.GetCategoryUseCase;
import com.omarismayilov.busybag.domain.useCase.GetOfferUseCase;
import com.omarismayilov.busybag.domain.useCase.GetProductByCategoryUseCase;
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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<GetCategoryUseCase> getCategoryUseCaseProvider;

  private final Provider<GetOfferUseCase> getOfferUseCaseProvider;

  private final Provider<GetProductByCategoryUseCase> getProductByCategoryUseCaseProvider;

  public HomeViewModel_Factory(Provider<GetCategoryUseCase> getCategoryUseCaseProvider,
      Provider<GetOfferUseCase> getOfferUseCaseProvider,
      Provider<GetProductByCategoryUseCase> getProductByCategoryUseCaseProvider) {
    this.getCategoryUseCaseProvider = getCategoryUseCaseProvider;
    this.getOfferUseCaseProvider = getOfferUseCaseProvider;
    this.getProductByCategoryUseCaseProvider = getProductByCategoryUseCaseProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(getCategoryUseCaseProvider.get(), getOfferUseCaseProvider.get(), getProductByCategoryUseCaseProvider.get());
  }

  public static HomeViewModel_Factory create(
      Provider<GetCategoryUseCase> getCategoryUseCaseProvider,
      Provider<GetOfferUseCase> getOfferUseCaseProvider,
      Provider<GetProductByCategoryUseCase> getProductByCategoryUseCaseProvider) {
    return new HomeViewModel_Factory(getCategoryUseCaseProvider, getOfferUseCaseProvider, getProductByCategoryUseCaseProvider);
  }

  public static HomeViewModel newInstance(GetCategoryUseCase getCategoryUseCase,
      GetOfferUseCase getOfferUseCase, GetProductByCategoryUseCase getProductByCategoryUseCase) {
    return new HomeViewModel(getCategoryUseCase, getOfferUseCase, getProductByCategoryUseCase);
  }
}
