package com.omarismayilov.busybag.presentation.ui.splash;

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
public final class SplashViewModel_Factory implements Factory<SplashViewModel> {
  private final Provider<SharedPrefManager> spProvider;

  public SplashViewModel_Factory(Provider<SharedPrefManager> spProvider) {
    this.spProvider = spProvider;
  }

  @Override
  public SplashViewModel get() {
    return newInstance(spProvider.get());
  }

  public static SplashViewModel_Factory create(Provider<SharedPrefManager> spProvider) {
    return new SplashViewModel_Factory(spProvider);
  }

  public static SplashViewModel newInstance(SharedPrefManager sp) {
    return new SplashViewModel(sp);
  }
}
