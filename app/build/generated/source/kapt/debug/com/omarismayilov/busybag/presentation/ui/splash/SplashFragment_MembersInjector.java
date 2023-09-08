package com.omarismayilov.busybag.presentation.ui.splash;

import com.omarismayilov.busybag.common.ValidationHelper;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class SplashFragment_MembersInjector implements MembersInjector<SplashFragment> {
  private final Provider<ValidationHelper> helperProvider;

  public SplashFragment_MembersInjector(Provider<ValidationHelper> helperProvider) {
    this.helperProvider = helperProvider;
  }

  public static MembersInjector<SplashFragment> create(Provider<ValidationHelper> helperProvider) {
    return new SplashFragment_MembersInjector(helperProvider);
  }

  @Override
  public void injectMembers(SplashFragment instance) {
    injectHelper(instance, helperProvider.get());
  }

  @InjectedFieldSignature("com.omarismayilov.busybag.presentation.ui.splash.SplashFragment.helper")
  public static void injectHelper(SplashFragment instance, ValidationHelper helper) {
    instance.helper = helper;
  }
}
