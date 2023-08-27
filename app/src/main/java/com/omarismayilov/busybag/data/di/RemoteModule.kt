package com.omarismayilov.busybag.data.di

import android.content.Context
import com.omarismayilov.busybag.common.Constants.BASE_URL
import com.omarismayilov.busybag.data.remote.api.ProductApiService
import com.omarismayilov.movaapp.common.utils.SharedPrefManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RemoteModule {

    @Singleton
    @Provides
    fun provideRetrofit() = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()


    @Singleton
    @Provides
    fun provideApiService(retrofit:Retrofit) = retrofit.create(ProductApiService::class.java)

}