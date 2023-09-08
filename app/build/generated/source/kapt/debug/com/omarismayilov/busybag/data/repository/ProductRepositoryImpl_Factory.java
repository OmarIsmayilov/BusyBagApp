package com.omarismayilov.busybag.data.repository;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.StorageReference;
import com.omarismayilov.busybag.data.local.FavoriteDAO;
import com.omarismayilov.busybag.data.remote.api.ProductApiService;
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
public final class ProductRepositoryImpl_Factory implements Factory<ProductRepositoryImpl> {
  private final Provider<FirebaseFirestore> firestoreProvider;

  private final Provider<StorageReference> storageProvider;

  private final Provider<ProductApiService> productApiServiceProvider;

  private final Provider<FavoriteDAO> favoriteDAOProvider;

  public ProductRepositoryImpl_Factory(Provider<FirebaseFirestore> firestoreProvider,
      Provider<StorageReference> storageProvider,
      Provider<ProductApiService> productApiServiceProvider,
      Provider<FavoriteDAO> favoriteDAOProvider) {
    this.firestoreProvider = firestoreProvider;
    this.storageProvider = storageProvider;
    this.productApiServiceProvider = productApiServiceProvider;
    this.favoriteDAOProvider = favoriteDAOProvider;
  }

  @Override
  public ProductRepositoryImpl get() {
    return newInstance(firestoreProvider.get(), storageProvider.get(), productApiServiceProvider.get(), favoriteDAOProvider.get());
  }

  public static ProductRepositoryImpl_Factory create(Provider<FirebaseFirestore> firestoreProvider,
      Provider<StorageReference> storageProvider,
      Provider<ProductApiService> productApiServiceProvider,
      Provider<FavoriteDAO> favoriteDAOProvider) {
    return new ProductRepositoryImpl_Factory(firestoreProvider, storageProvider, productApiServiceProvider, favoriteDAOProvider);
  }

  public static ProductRepositoryImpl newInstance(FirebaseFirestore firestore,
      StorageReference storage, ProductApiService productApiService, FavoriteDAO favoriteDAO) {
    return new ProductRepositoryImpl(firestore, storage, productApiService, favoriteDAO);
  }
}
