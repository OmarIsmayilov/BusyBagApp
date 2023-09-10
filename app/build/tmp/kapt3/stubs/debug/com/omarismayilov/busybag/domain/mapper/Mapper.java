package com.omarismayilov.busybag.domain.mapper;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005J\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n*\b\u0012\u0004\u0012\u00020\u00040\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\r0\nJ\n\u0010\u000e\u001a\u00020\r*\u00020\fJ\n\u0010\u000e\u001a\u00020\r*\u00020\u0006J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n*\b\u0012\u0004\u0012\u00020\u00100\nJ\n\u0010\u0011\u001a\u00020\u0006*\u00020\u0010\u00a8\u0006\u0012"}, d2 = {"Lcom/omarismayilov/busybag/domain/mapper/Mapper;", "", "()V", "toCartDTO", "Lcom/omarismayilov/busybag/data/local/cart/CartDTO;", "Lcom/omarismayilov/busybag/domain/model/CartUiModel;", "Lcom/omarismayilov/busybag/domain/model/ProductUiModel;", "favorite", "", "toCartUiList", "", "toFavUiModelList", "Lcom/omarismayilov/busybag/domain/model/FavoriteUiModel;", "Lcom/omarismayilov/busybag/data/local/favorite/FavoriteDTO;", "toFavoriteDTO", "toProductUiList", "Lcom/omarismayilov/busybag/data/remote/dto/ProductDTO;", "toProductUiModel", "app_debug"})
public final class Mapper {
    @org.jetbrains.annotations.NotNull
    public static final com.omarismayilov.busybag.domain.mapper.Mapper INSTANCE = null;
    
    private Mapper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.omarismayilov.busybag.domain.model.ProductUiModel toProductUiModel(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.data.remote.dto.ProductDTO $this$toProductUiModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.omarismayilov.busybag.data.local.favorite.FavoriteDTO toFavoriteDTO(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.domain.model.ProductUiModel $this$toFavoriteDTO) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.omarismayilov.busybag.data.local.cart.CartDTO toCartDTO(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.domain.model.ProductUiModel $this$toCartDTO, boolean favorite) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.omarismayilov.busybag.data.local.cart.CartDTO toCartDTO(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.domain.model.CartUiModel $this$toCartDTO) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.omarismayilov.busybag.data.local.favorite.FavoriteDTO toFavoriteDTO(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.domain.model.FavoriteUiModel $this$toFavoriteDTO) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.omarismayilov.busybag.domain.model.FavoriteUiModel> toFavUiModelList(@org.jetbrains.annotations.NotNull
    java.util.List<com.omarismayilov.busybag.data.local.favorite.FavoriteDTO> $this$toFavUiModelList) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.omarismayilov.busybag.domain.model.CartUiModel> toCartUiList(@org.jetbrains.annotations.NotNull
    java.util.List<com.omarismayilov.busybag.data.local.cart.CartDTO> $this$toCartUiList) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.omarismayilov.busybag.domain.model.ProductUiModel> toProductUiList(@org.jetbrains.annotations.NotNull
    java.util.List<com.omarismayilov.busybag.data.remote.dto.ProductDTO> $this$toProductUiList) {
        return null;
    }
}