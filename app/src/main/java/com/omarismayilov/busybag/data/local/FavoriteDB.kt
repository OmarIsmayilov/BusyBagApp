package com.omarismayilov.busybag.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.omarismayilov.busybag.data.local.dto.FavoriteDTO

@Database(entities = [FavoriteDTO::class], version = 1, exportSchema = false)
abstract class FavoriteDB : RoomDatabase() {
    abstract fun getFavDao(): FavoriteDAO
}