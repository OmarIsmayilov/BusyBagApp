package com.omarismayilov.busybag.domain.useCase;

import com.omarismayilov.busybag.domain.repository.AuthRepository;
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
public final class AuthUseCase_Factory implements Factory<AuthUseCase> {
  private final Provider<AuthRepository> repositoryProvider;

  public AuthUseCase_Factory(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public AuthUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static AuthUseCase_Factory create(Provider<AuthRepository> repositoryProvider) {
    return new AuthUseCase_Factory(repositoryProvider);
  }

  public static AuthUseCase newInstance(AuthRepository repository) {
    return new AuthUseCase(repository);
  }
}
