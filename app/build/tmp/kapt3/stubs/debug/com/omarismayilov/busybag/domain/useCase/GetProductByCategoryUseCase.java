package com.omarismayilov.busybag.domain.useCase;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/omarismayilov/busybag/domain/useCase/GetProductByCategoryUseCase;", "", "productRepository", "Lcom/omarismayilov/busybag/domain/repository/ProductRepository;", "(Lcom/omarismayilov/busybag/domain/repository/ProductRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/omarismayilov/busybag/common/Resource;", "Lcom/omarismayilov/busybag/data/remote/dto/ProductsDTO;", "category", "", "app_debug"})
public final class GetProductByCategoryUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.omarismayilov.busybag.domain.repository.ProductRepository productRepository = null;
    
    @javax.inject.Inject
    public GetProductByCategoryUseCase(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.domain.repository.ProductRepository productRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.omarismayilov.busybag.common.Resource<com.omarismayilov.busybag.data.remote.dto.ProductsDTO>> invoke(@org.jetbrains.annotations.NotNull
    java.lang.String category) {
        return null;
    }
}