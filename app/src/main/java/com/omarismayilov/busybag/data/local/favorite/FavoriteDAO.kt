package com.omarismayilov.busybag.data.local.favorite

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface FavoriteDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addFav(product: FavoriteDTO)

    @Delete
    suspend fun deleteFav(product: FavoriteDTO)

    @Query("SELECT * FROM favorite_product")
    suspend fun getFav(): List<FavoriteDTO>

    @Query("SELECT EXISTS (SELECT 1 FROM favorite_product WHERE id = :productId)")
    suspend fun isProductFavorite(productId: Int): Boolean

}