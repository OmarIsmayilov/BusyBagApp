package com.omarismayilov.busybag.data.repository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J#\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u001a0\u00190\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ#\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001a0\u00190\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ#\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001a0\u00190\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ#\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001a0\u00190\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ%\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00190\u00182\u0006\u0010#\u001a\u00020$H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J%\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\u00190\u00182\u0006\u0010(\u001a\u00020)H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u001d\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\u00190\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ%\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\u00190\u00182\u0006\u0010-\u001a\u00020)H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u001f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00182\u0006\u0010#\u001a\u00020$H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00060"}, d2 = {"Lcom/omarismayilov/busybag/data/repository/ProductRepositoryImpl;", "Lcom/omarismayilov/busybag/domain/repository/ProductRepository;", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "storage", "Lcom/google/firebase/storage/StorageReference;", "productApiService", "Lcom/omarismayilov/busybag/data/remote/api/ProductApiService;", "favoriteDAO", "Lcom/omarismayilov/busybag/data/local/favorite/FavoriteDAO;", "cartDAO", "Lcom/omarismayilov/busybag/data/local/cart/CartDAO;", "(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/storage/StorageReference;Lcom/omarismayilov/busybag/data/remote/api/ProductApiService;Lcom/omarismayilov/busybag/data/local/favorite/FavoriteDAO;Lcom/omarismayilov/busybag/data/local/cart/CartDAO;)V", "addCart", "", "product", "Lcom/omarismayilov/busybag/data/local/cart/CartDTO;", "(Lcom/omarismayilov/busybag/data/local/cart/CartDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addFav", "Lcom/omarismayilov/busybag/data/local/favorite/FavoriteDTO;", "(Lcom/omarismayilov/busybag/data/local/favorite/FavoriteDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCart", "deleteFav", "getCart", "Lkotlinx/coroutines/flow/Flow;", "Lcom/omarismayilov/busybag/common/Resource;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategories", "Lcom/omarismayilov/busybag/domain/model/CategoryUiModel;", "getFav", "getOffers", "Lcom/omarismayilov/busybag/domain/model/OfferUiModel;", "getProduct", "Lcom/omarismayilov/busybag/data/remote/dto/ProductDTO;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductByCategory", "Lcom/omarismayilov/busybag/data/remote/dto/ProductsDTO;", "category", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProducts", "getSearch", "query", "isProductFavorite", "", "app_debug"})
public final class ProductRepositoryImpl implements com.omarismayilov.busybag.domain.repository.ProductRepository {
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.firestore.FirebaseFirestore firestore = null;
    @org.jetbrains.annotations.NotNull
    private final com.google.firebase.storage.StorageReference storage = null;
    @org.jetbrains.annotations.NotNull
    private final com.omarismayilov.busybag.data.remote.api.ProductApiService productApiService = null;
    @org.jetbrains.annotations.NotNull
    private final com.omarismayilov.busybag.data.local.favorite.FavoriteDAO favoriteDAO = null;
    @org.jetbrains.annotations.NotNull
    private final com.omarismayilov.busybag.data.local.cart.CartDAO cartDAO = null;
    
    @javax.inject.Inject
    public ProductRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore firestore, @org.jetbrains.annotations.NotNull
    com.google.firebase.storage.StorageReference storage, @org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.data.remote.api.ProductApiService productApiService, @org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.data.local.favorite.FavoriteDAO favoriteDAO, @org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.data.local.cart.CartDAO cartDAO) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getOffers(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.omarismayilov.busybag.common.Resource<? extends java.util.List<com.omarismayilov.busybag.domain.model.OfferUiModel>>>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getCategories(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.omarismayilov.busybag.common.Resource<? extends java.util.List<com.omarismayilov.busybag.domain.model.CategoryUiModel>>>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getProductByCategory(@org.jetbrains.annotations.NotNull
    java.lang.String category, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.omarismayilov.busybag.common.Resource<com.omarismayilov.busybag.data.remote.dto.ProductsDTO>>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getProducts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.omarismayilov.busybag.common.Resource<com.omarismayilov.busybag.data.remote.dto.ProductsDTO>>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getProduct(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.omarismayilov.busybag.common.Resource<com.omarismayilov.busybag.data.remote.dto.ProductDTO>>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getSearch(@org.jetbrains.annotations.NotNull
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.omarismayilov.busybag.common.Resource<com.omarismayilov.busybag.data.remote.dto.ProductsDTO>>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object addFav(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.data.local.favorite.FavoriteDTO product, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object deleteFav(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.data.local.favorite.FavoriteDTO product, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getFav(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.omarismayilov.busybag.common.Resource<? extends java.util.List<com.omarismayilov.busybag.data.local.favorite.FavoriteDTO>>>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object isProductFavorite(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.Boolean>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object addCart(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.data.local.cart.CartDTO product, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object deleteCart(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.data.local.cart.CartDTO product, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getCart(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.omarismayilov.busybag.common.Resource<? extends java.util.List<com.omarismayilov.busybag.data.local.cart.CartDTO>>>> $completion) {
        return null;
    }
}