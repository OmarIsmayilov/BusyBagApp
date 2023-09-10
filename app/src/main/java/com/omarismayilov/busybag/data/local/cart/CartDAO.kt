package com.omarismayilov.busybag.data.local.cart

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CartDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addCart(product: CartDTO)

    @Delete
    suspend fun deleteCart(product: CartDTO)

    @Query("Select * from cart_product")
    suspend fun getCart() : List<CartDTO>

}