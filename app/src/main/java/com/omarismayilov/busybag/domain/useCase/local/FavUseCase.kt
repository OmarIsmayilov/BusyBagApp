package com.omarismayilov.busybag.domain.useCase.local

import com.omarismayilov.busybag.data.local.favorite.FavoriteDTO
import com.omarismayilov.busybag.domain.repository.ProductRepository
import javax.inject.Inject

class FavUseCase @Inject constructor(
    val repository: ProductRepository,
) {
    suspend fun addFavorite(product: FavoriteDTO) = repository.addFav(product)
    suspend fun deleteFavorite(product: FavoriteDTO) = repository.deleteFav(product)
    suspend fun getFavorites() = repository.getFav()
    suspend fun isFavorite(id: Int) = repository.isProductFavorite(id)
}