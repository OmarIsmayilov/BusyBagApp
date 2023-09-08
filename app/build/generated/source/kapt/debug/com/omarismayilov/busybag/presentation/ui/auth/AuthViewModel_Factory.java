package com.omarismayilov.busybag.presentation.ui.auth;

import com.omarismayilov.busybag.domain.useCase.AuthUseCase;
import com.omarismayilov.movaapp.common.utils.SharedPrefManager;
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
public final class AuthViewModel_Factory implements Factory<AuthViewModel> {
  private final Provider<AuthUseCase> authUseCaseProvider;

  private final Provider<SharedPrefManager> spProvider;

  public AuthViewModel_Factory(Provider<AuthUseCase> authUseCaseProvider,
      Provider<SharedPrefManager> spProvider) {
    this.authUseCaseProvider = authUseCaseProvider;
    this.spProvider = spProvider;
  }

  @Override
  public AuthViewModel get() {
    return newInstance(authUseCaseProvider.get(), spProvider.get());
  }

  public static AuthViewModel_Factory create(Provider<AuthUseCase> authUseCaseProvider,
      Provider<SharedPrefManager> spProvider) {
    return new AuthViewModel_Factory(authUseCaseProvider, spProvider);
  }

  public static AuthViewModel newInstance(AuthUseCase authUseCase, SharedPrefManager sp) {
    return new AuthViewModel(authUseCase, sp);
  }
}
