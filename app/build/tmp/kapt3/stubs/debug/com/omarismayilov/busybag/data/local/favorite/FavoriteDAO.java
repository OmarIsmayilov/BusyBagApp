package com.omarismayilov.busybag.data.local.favorite;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/omarismayilov/busybag/data/local/favorite/FavoriteDAO;", "", "addFav", "", "product", "Lcom/omarismayilov/busybag/data/local/favorite/FavoriteDTO;", "(Lcom/omarismayilov/busybag/data/local/favorite/FavoriteDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFav", "getFav", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isProductFavorite", "", "productId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao
public abstract interface FavoriteDAO {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addFav(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.data.local.favorite.FavoriteDTO product, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteFav(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.data.local.favorite.FavoriteDTO product, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM favorite_product")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getFav(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.omarismayilov.busybag.data.local.favorite.FavoriteDTO>> $completion);
    
    @androidx.room.Query(value = "SELECT EXISTS (SELECT 1 FROM favorite_product WHERE id = :productId)")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object isProductFavorite(int productId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
}