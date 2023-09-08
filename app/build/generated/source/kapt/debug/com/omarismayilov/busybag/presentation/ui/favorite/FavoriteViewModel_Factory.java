package com.omarismayilov.busybag.presentation.ui.favorite;

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
public final class FavoriteViewModel_Factory implements Factory<FavoriteViewModel> {
  private final Provider<FavUseCase> favUseCaseProvider;

  public FavoriteViewModel_Factory(Provider<FavUseCase> favUseCaseProvider) {
    this.favUseCaseProvider = favUseCaseProvider;
  }

  @Override
  public FavoriteViewModel get() {
    return newInstance(favUseCaseProvider.get());
  }

  public static FavoriteViewModel_Factory create(Provider<FavUseCase> favUseCaseProvider) {
    return new FavoriteViewModel_Factory(favUseCaseProvider);
  }

  public static FavoriteViewModel newInstance(FavUseCase favUseCase) {
    return new FavoriteViewModel(favUseCase);
  }
}
