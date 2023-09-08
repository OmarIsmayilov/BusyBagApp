package com.omarismayilov.busybag.data.di;

import android.content.Context;
import com.omarismayilov.busybag.common.ValidationHelper;
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
public final class AppModule_ProvideValidationHelperFactory implements Factory<ValidationHelper> {
  private final Provider<Context> contextProvider;

  public AppModule_ProvideValidationHelperFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public ValidationHelper get() {
    return provideValidationHelper(contextProvider.get());
  }

  public static AppModule_ProvideValidationHelperFactory create(Provider<Context> contextProvider) {
    return new AppModule_ProvideValidationHelperFactory(contextProvider);
  }

  public static ValidationHelper provideValidationHelper(Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideValidationHelper(context));
  }
}
