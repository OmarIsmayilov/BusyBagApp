package com.omarismayilov.busybag.data.di;

import com.google.firebase.storage.StorageReference;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class FirebaseModule_ProvideStorageFactory implements Factory<StorageReference> {
  @Override
  public StorageReference get() {
    return provideStorage();
  }

  public static FirebaseModule_ProvideStorageFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static StorageReference provideStorage() {
    return Preconditions.checkNotNullFromProvides(FirebaseModule.INSTANCE.provideStorage());
  }

  private static final class InstanceHolder {
    private static final FirebaseModule_ProvideStorageFactory INSTANCE = new FirebaseModule_ProvideStorageFactory();
  }
}
