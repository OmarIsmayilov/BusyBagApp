package com.omarismayilov.busybag.data.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/omarismayilov/busybag/data/di/RepositoryModule;", "", "()V", "provideAuthRepository", "Lcom/omarismayilov/busybag/domain/repository/AuthRepository;", "authRepositoryImpl", "Lcom/omarismayilov/busybag/data/repository/AuthRepositoryImpl;", "provideProductRepository", "Lcom/omarismayilov/busybag/domain/repository/ProductRepository;", "productRepositoryImpl", "Lcom/omarismayilov/busybag/data/repository/ProductRepositoryImpl;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @javax.inject.Singleton
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.omarismayilov.busybag.domain.repository.AuthRepository provideAuthRepository(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.data.repository.AuthRepositoryImpl authRepositoryImpl);
    
    @javax.inject.Singleton
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.omarismayilov.busybag.domain.repository.ProductRepository provideProductRepository(@org.jetbrains.annotations.NotNull
    com.omarismayilov.busybag.data.repository.ProductRepositoryImpl productRepositoryImpl);
}