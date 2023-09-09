package com.omarismayilov.busybag.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.omarismayilov.busybag.data.local.cart.CartDAO
import com.omarismayilov.busybag.data.local.cart.CartDTO
import com.omarismayilov.busybag.data.local.favorite.FavoriteDTO
import com.omarismayilov.busybag.data.local.favorite.FavoriteDAO

@Database(entities = [FavoriteDTO::class,CartDTO::class], version = 1, exportSchema = false)
abstract class FavoriteDB : RoomDatabase() {
    abstract fun getFavDao(): FavoriteDAO
    abstract fun getCartDao(): CartDAO
}