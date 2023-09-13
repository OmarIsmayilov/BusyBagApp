package com.omarismayilov.busybag.domain.useCase.local;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e0\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/omarismayilov/busybag/domain/useCase/local/CartUseCase;", "", "cartRepository", "Lcom/omarismayilov/busybag/domain/repository/ProductRepository;", "(Lcom/omarismayilov/busybag/domain/repository/ProductRepository;)V", "addProduct", "", "product", "Lcom/omarismayilov/busybag/data/local/cart/CartDTO;", "(Lcom/omarismayilov/busybag/data/local/cart/CartDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteProduct", "getProduct", "Lkotlinx/coroutines/flow/Flow;", "Lcom/omarismayilov/busybag/common/Resource;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CartUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.omarismayilov.busybag.domain.repository.ProductRepository cartRepository = null;
    
    @javax.inject.Inject
    public CartUseCase(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.domain.repository.ProductRepository cartRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addProduct(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.data.local.cart.CartDTO product, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteProduct(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.data.local.cart.CartDTO product, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getProduct(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.omarismayilov.busybag.common.Resource<? extends java.util.List<com.omarismayilov.busybag.data.local.cart.CartDTO>>>> $completion) {
        return null;
    }
}