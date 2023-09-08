package com.omarismayilov.busybag.presentation.ui.explore;

import com.omarismayilov.busybag.domain.useCase.GetCategoryUseCase;
import com.omarismayilov.busybag.domain.useCase.GetProductByCategoryUseCase;
import com.omarismayilov.busybag.domain.useCase.GetSearchUseCase;
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
public final class ExploreViewModel_Factory implements Factory<ExploreViewModel> {
  private final Provider<GetCategoryUseCase> getCategoryUseCaseProvider;

  private final Provider<GetProductByCategoryUseCase> getProductByCategoryUseCaseProvider;

  private final Provider<GetSearchUseCase> getSearchUseCaseProvider;

  public ExploreViewModel_Factory(Provider<GetCategoryUseCase> getCategoryUseCaseProvider,
      Provider<GetProductByCategoryUseCase> getProductByCategoryUseCaseProvider,
      Provider<GetSearchUseCase> getSearchUseCaseProvider) {
    this.getCategoryUseCaseProvider = getCategoryUseCaseProvider;
    this.getProductByCategoryUseCaseProvider = getProductByCategoryUseCaseProvider;
    this.getSearchUseCaseProvider = getSearchUseCaseProvider;
  }

  @Override
  public ExploreViewModel get() {
    return newInstance(getCategoryUseCaseProvider.get(), getProductByCategoryUseCaseProvider.get(), getSearchUseCaseProvider.get());
  }

  public static ExploreViewModel_Factory create(
      Provider<GetCategoryUseCase> getCategoryUseCaseProvider,
      Provider<GetProductByCategoryUseCase> getProductByCategoryUseCaseProvider,
      Provider<GetSearchUseCase> getSearchUseCaseProvider) {
    return new ExploreViewModel_Factory(getCategoryUseCaseProvider, getProductByCategoryUseCaseProvider, getSearchUseCaseProvider);
  }

  public static ExploreViewModel newInstance(GetCategoryUseCase getCategoryUseCase,
      GetProductByCategoryUseCase getProductByCategoryUseCase, GetSearchUseCase getSearchUseCase) {
    return new ExploreViewModel(getCategoryUseCase, getProductByCategoryUseCase, getSearchUseCase);
  }
}
