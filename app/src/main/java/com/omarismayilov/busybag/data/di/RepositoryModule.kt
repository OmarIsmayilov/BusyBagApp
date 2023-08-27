package com.omarismayilov.busybag.data.di

import com.omarismayilov.busybag.data.repository.AuthRepositoryImpl
import com.omarismayilov.busybag.data.repository.ProductRepositoryImpl
import com.omarismayilov.busybag.domain.repository.AuthRepository
import com.omarismayilov.busybag.domain.repository.ProductRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun provideAuthRepository(authRepositoryImpl: AuthRepositoryImpl): AuthRepository

    @Singleton
    @Binds
    abstract fun provideProductRepository(productRepositoryImpl: ProductRepositoryImpl): ProductRepository

}