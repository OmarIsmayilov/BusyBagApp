package com.omarismayilov.busybag.presentation.ui.offer;

import com.omarismayilov.busybag.domain.useCase.GetProductsUseCase;
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
public final class OfferViewModel_Factory implements Factory<OfferViewModel> {
  private final Provider<GetProductsUseCase> getProductsUseCaseProvider;

  public OfferViewModel_Factory(Provider<GetProductsUseCase> getProductsUseCaseProvider) {
    this.getProductsUseCaseProvider = getProductsUseCaseProvider;
  }

  @Override
  public OfferViewModel get() {
    return newInstance(getProductsUseCaseProvider.get());
  }

  public static OfferViewModel_Factory create(
      Provider<GetProductsUseCase> getProductsUseCaseProvider) {
    return new OfferViewModel_Factory(getProductsUseCaseProvider);
  }

  public static OfferViewModel newInstance(GetProductsUseCase getProductsUseCase) {
    return new OfferViewModel(getProductsUseCase);
  }
}
