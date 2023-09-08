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
public final class RegisterFragment_MembersInjector implements MembersInjector<RegisterFragment> {
  private final Provider<ValidationHelper> helperProvider;

  public RegisterFragment_MembersInjector(Provider<ValidationHelper> helperProvider) {
    this.helperProvider = helperProvider;
  }

  public static MembersInjector<RegisterFragment> create(
      Provider<ValidationHelper> helperProvider) {
    return new RegisterFragment_MembersInjector(helperProvider);
  }

  @Override
  public void injectMembers(RegisterFragment instance) {
    injectHelper(instance, helperProvider.get());
  }

  @InjectedFieldSignature("com.omarismayilov.busybag.presentation.ui.auth.RegisterFragment.helper")
  public static void injectHelper(RegisterFragment instance, ValidationHelper helper) {
    instance.helper = helper;
  }
}
