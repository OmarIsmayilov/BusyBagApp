package com.omarismayilov.busybag.data.repository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\r0\fH\u0016J\u001a\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00130\r0\fH\u0016J\u001a\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00130\r0\fH\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\r0\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\r0\f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0014\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\r0\fH\u0016J\u001c\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\r0\f2\u0006\u0010\"\u001a\u00020\u001fH\u0016J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/omarismayilov/busybag/data/repository/ProductRepositoryImpl;", "Lcom/omarismayilov/busybag/domain/repository/ProductRepository;", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "storage", "Lcom/google/firebase/storage/StorageReference;", "productApiService", "Lcom/omarismayilov/busybag/data/remote/api/ProductApiService;", "favoriteDAO", "Lcom/omarismayilov/busybag/data/local/FavoriteDAO;", "(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/storage/StorageReference;Lcom/omarismayilov/busybag/data/remote/api/ProductApiService;Lcom/omarismayilov/busybag/data/local/FavoriteDAO;)V", "addFav", "Lkotlinx/coroutines/flow/Flow;", "Lcom/omarismayilov/busybag/common/Resource;", "", "product", "Lcom/omarismayilov/busybag/data/local/dto/FavoriteDTO;", "deleteFav", "getCategories", "", "Lcom/omarismayilov/busybag/domain/model/CategoryUiModel;", "getFav", "getOffers", "Lcom/omarismayilov/busybag/domain/model/OfferUiModel;", "getProduct", "Lcom/omarismayilov/busybag/data/remote/dto/ProductDTO;", "id", "", "getProductByCategory", "Lcom/omarismayilov/busybag/data/remote/dto/ProductsDTO;", "category", "", "getProducts", "getSearch", "query", "isProductFavorite", "app_debug"})
public final class ProductRepositoryImpl implements com.omarismayilov.busybag.domain.repository.ProductRepository {
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.firestore.FirebaseFirestore firestore = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.storage.StorageReference storage = null;
    @org.jetbrains.annotations.NotNull
    private final com.omarismayilov.busybag.data.remote.api.ProductApiService productApiService = null;
    @org.jetbrains.annotations.NotNull
    private final com.omarismayilov.busybag.data.local.FavoriteDAO favoriteDAO = null;
    
    @javax.inject.Inject
    public ProductRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore firestore, @org.jetbrains.annotations.NotNull
    com.google.firebase.storage.StorageReference storage, @org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.data.remote.api.ProductApiService productApiService, @org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.data.local.FavoriteDAO favoriteDAO) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<com.omarismayilov.busybag.common.Resource<java.util.List<com.omarismayilov.busybag.domain.model.OfferUiModel>>> getOffers() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<com.omarismayilov.busybag.common.Resource<java.util.List<com.omarismayilov.busybag.domain.model.CategoryUiModel>>> getCategories() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<com.omarismayilov.busybag.common.Resource<com.omarismayilov.busybag.data.remote.dto.ProductsDTO>> getProductByCategory(@org.jetbrains.annotations.NotNull
    java.lang.String category) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<com.omarismayilov.busybag.common.Resource<com.omarismayilov.busybag.data.remote.dto.ProductsDTO>> getProducts() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<com.omarismayilov.busybag.common.Resource<com.omarismayilov.busybag.data.remote.dto.ProductDTO>> getProduct(int id) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<com.omarismayilov.busybag.common.Resource<com.omarismayilov.busybag.data.remote.dto.ProductsDTO>> getSearch(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<com.omarismayilov.busybag.common.Resource<java.lang.Boolean>> addFav(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.data.local.dto.FavoriteDTO product) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<com.omarismayilov.busybag.common.Resource<java.lang.Boolean>> deleteFav(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.data.local.dto.FavoriteDTO product) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<com.omarismayilov.busybag.common.Resource<java.util.List<com.omarismayilov.busybag.data.local.dto.FavoriteDTO>>> getFav() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.lang.Boolean> isProductFavorite(int id) {
        return null;
    }
}