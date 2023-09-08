package com.omarismayilov.busybag.domain.useCase;

import com.omarismayilov.busybag.domain.repository.ProductRepository;
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
public final class GetSearchUseCase_Factory implements Factory<GetSearchUseCase> {
  private final Provider<ProductRepository> repositoryProvider;

  public GetSearchUseCase_Factory(Provider<ProductRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetSearchUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetSearchUseCase_Factory create(Provider<ProductRepository> repositoryProvider) {
    return new GetSearchUseCase_Factory(repositoryProvider);
  }

  public static GetSearchUseCase newInstance(ProductRepository repository) {
    return new GetSearchUseCase(repository);
  }
}
