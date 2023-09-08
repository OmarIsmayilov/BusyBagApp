package com.omarismayilov.busybag.data.di;

import com.omarismayilov.busybag.data.remote.api.ProductApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
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
public final class RemoteModule_ProvideApiServiceFactory implements Factory<ProductApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public RemoteModule_ProvideApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ProductApiService get() {
    return provideApiService(retrofitProvider.get());
  }

  public static RemoteModule_ProvideApiServiceFactory create(Provider<Retrofit> retrofitProvider) {
    return new RemoteModule_ProvideApiServiceFactory(retrofitProvider);
  }

  public static ProductApiService provideApiService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(RemoteModule.INSTANCE.provideApiService(retrofit));
  }
}
