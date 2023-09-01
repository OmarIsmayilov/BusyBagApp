package com.omarismayilov.busybag.domain.repository

import com.omarismayilov.busybag.common.Resource
import com.omarismayilov.busybag.data.local.dto.FavoriteDTO
import com.omarismayilov.busybag.data.remote.dto.ProductDTO
import com.omarismayilov.busybag.data.remote.dto.ProductsDTO
import com.omarismayilov.busybag.domain.model.CategoryUiModel
import com.omarismayilov.busybag.domain.model.OfferUiModel
import com.omarismayilov.busybag.domain.model.ProductUiModel
import kotlinx.coroutines.flow.Flow

interface ProductRepository {
    fun getOffers(): Flow<Resource<List<OfferUiModel>>>
    fun getCategories(): Flow<Resource<List<CategoryUiModel>>>
    fun getProductByCategory(category:String) : Flow<Resource<ProductsDTO>>
    fun getProducts() : Flow<Resource<ProductsDTO>>
    fun getProduct(id:Int) : Flow<Resource<ProductDTO>>
    fun getSearch(query:String) : Flow<Resource<ProductsDTO>>
    fun addFav(product:FavoriteDTO) : Flow<Resource<Boolean>>
    fun deleteFav(product:FavoriteDTO) : Flow<Resource<Boolean>>
    fun getFav() : Flow<Resource<List<FavoriteDTO>>>
    fun isProductFavorite(id:Int) : Flow<Boolean>
}