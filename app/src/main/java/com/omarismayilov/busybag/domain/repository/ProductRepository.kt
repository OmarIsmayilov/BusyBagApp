package com.omarismayilov.busybag.domain.repository

import com.omarismayilov.busybag.common.Resource
import com.omarismayilov.busybag.data.local.cart.CartDTO
import com.omarismayilov.busybag.data.local.favorite.FavoriteDTO
import com.omarismayilov.busybag.data.remote.dto.ProductDTO
import com.omarismayilov.busybag.data.remote.dto.ProductsDTO
import com.omarismayilov.busybag.domain.model.CategoryUiModel
import com.omarismayilov.busybag.domain.model.OfferUiModel
import kotlinx.coroutines.flow.Flow

interface ProductRepository {
    suspend fun getOffers(): Flow<Resource<List<OfferUiModel>>>
    suspend fun getCategories(): Flow<Resource<List<CategoryUiModel>>>
    suspend fun getProductByCategory(category:String) : Flow<Resource<ProductsDTO>>
    suspend fun getProducts() : Flow<Resource<ProductsDTO>>
    suspend fun getProduct(id:Int) : Flow<Resource<ProductDTO>>
    suspend fun getSearch(query:String) : Flow<Resource<ProductsDTO>>
    suspend fun addFav(product: FavoriteDTO)
    suspend fun deleteFav(product: FavoriteDTO)
    suspend fun getFav() : Flow<Resource<List<FavoriteDTO>>>
    suspend fun isProductFavorite(id:Int) : Flow<Boolean>
    suspend fun addCart(product: CartDTO)
    suspend fun deleteCart(product: CartDTO)
    suspend fun getCart() : Flow<Resource<List<CartDTO>>>
}