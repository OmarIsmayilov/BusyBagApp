package com.omarismayilov.busybag.presentation.ui.profile;

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
public final class ProfileViewModel_Factory implements Factory<ProfileViewModel> {
  private final Provider<SharedPrefManager> spProvider;

  public ProfileViewModel_Factory(Provider<SharedPrefManager> spProvider) {
    this.spProvider = spProvider;
  }

  @Override
  public ProfileViewModel get() {
    return newInstance(spProvider.get());
  }

  public static ProfileViewModel_Factory create(Provider<SharedPrefManager> spProvider) {
    return new ProfileViewModel_Factory(spProvider);
  }

  public static ProfileViewModel newInstance(SharedPrefManager sp) {
    return new ProfileViewModel(sp);
  }
}
