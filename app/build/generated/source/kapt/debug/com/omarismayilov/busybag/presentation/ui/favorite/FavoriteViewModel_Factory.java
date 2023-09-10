package com.omarismayilov.busybag.presentation.ui.favorite;

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
public final class FavoriteViewModel_Factory implements Factory<FavoriteViewModel> {
  private final Provider<FavoriteUseCase> favoriteUseCaseProvider;

  public FavoriteViewModel_Factory(Provider<FavoriteUseCase> favoriteUseCaseProvider) {
    this.favoriteUseCaseProvider = favoriteUseCaseProvider;
  }

  @Override
  public FavoriteViewModel get() {
    return newInstance(favoriteUseCaseProvider.get());
  }

  public static FavoriteViewModel_Factory create(
      Provider<FavoriteUseCase> favoriteUseCaseProvider) {
    return new FavoriteViewModel_Factory(favoriteUseCaseProvider);
  }

  public static FavoriteViewModel newInstance(FavoriteUseCase favoriteUseCase) {
    return new FavoriteViewModel(favoriteUseCase);
  }
}
