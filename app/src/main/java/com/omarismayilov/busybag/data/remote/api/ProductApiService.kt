package com.omarismayilov.busybag.data.remote.api

import com.omarismayilov.busybag.data.remote.dto.ProductsDTO
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ProductApiService {

    @GET("products")
    suspend fun getProducts(
        @Query("limit") limit: Int = 50,
    ): ProductsDTO

    @GET("products/category/{category}")
    suspend fun getProductsByCategory(
        @Path("category") slug: String,
        @Query("limit") limit: Int = 50
    ): ProductsDTO

}