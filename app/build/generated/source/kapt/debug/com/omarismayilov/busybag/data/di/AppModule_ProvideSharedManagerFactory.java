package com.omarismayilov.busybag.data.di;

import android.content.Context;
import com.omarismayilov.movaapp.common.utils.SharedPrefManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideSharedManagerFactory implements Factory<SharedPrefManager> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvideSharedManagerFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public SharedPrefManager get() {
    return provideSharedManager(contextProvider.get());
  }

  public static AppModule_ProvideSharedManagerFactory create(Provider<Context> contextProvider) {
    return new AppModule_ProvideSharedManagerFactory(contextProvider);
  }

  public static SharedPrefManager provideSharedManager(Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideSharedManager(context));
  }
}
