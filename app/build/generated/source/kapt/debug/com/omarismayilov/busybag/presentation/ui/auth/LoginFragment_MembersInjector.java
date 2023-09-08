package com.omarismayilov.busybag.presentation.ui.auth;

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
public final class LoginFragment_MembersInjector implements MembersInjector<LoginFragment> {
  private final Provider<ValidationHelper> helperProvider;

  public LoginFragment_MembersInjector(Provider<ValidationHelper> helperProvider) {
    this.helperProvider = helperProvider;
  }

  public static MembersInjector<LoginFragment> create(Provider<ValidationHelper> helperProvider) {
    return new LoginFragment_MembersInjector(helperProvider);
  }

  @Override
  public void injectMembers(LoginFragment instance) {
    injectHelper(instance, helperProvider.get());
  }

  @InjectedFieldSignature("com.omarismayilov.busybag.presentation.ui.auth.LoginFragment.helper")
  public static void injectHelper(LoginFragment instance, ValidationHelper helper) {
    instance.helper = helper;
  }
}
