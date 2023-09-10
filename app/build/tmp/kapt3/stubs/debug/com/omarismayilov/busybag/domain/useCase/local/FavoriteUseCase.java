package com.omarismayilov.busybag.domain.useCase.local;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ#\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00100\u000f0\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/omarismayilov/busybag/domain/useCase/local/FavoriteUseCase;", "", "repository", "Lcom/omarismayilov/busybag/domain/repository/ProductRepository;", "(Lcom/omarismayilov/busybag/domain/repository/ProductRepository;)V", "getRepository", "()Lcom/omarismayilov/busybag/domain/repository/ProductRepository;", "addFavorite", "", "product", "Lcom/omarismayilov/busybag/data/local/favorite/FavoriteDTO;", "(Lcom/omarismayilov/busybag/data/local/favorite/FavoriteDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFavorite", "getFavorites", "Lkotlinx/coroutines/flow/Flow;", "Lcom/omarismayilov/busybag/common/Resource;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFavorite", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class FavoriteUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.omarismayilov.busybag.domain.repository.ProductRepository repository = null;
    
    @javax.inject.Inject
    public FavoriteUseCase(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.domain.repository.ProductRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.omarismayilov.busybag.domain.repository.ProductRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addFavorite(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.data.local.favorite.FavoriteDTO product, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteFavorite(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.data.local.favorite.FavoriteDTO product, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getFavorites(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.omarismayilov.busybag.common.Resource<? extends java.util.List<com.omarismayilov.busybag.data.local.favorite.FavoriteDTO>>>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object isFavorite(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<java.lang.Boolean>> $completion) {
        return null;
    }
}