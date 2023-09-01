package com.omarismayilov.busybag.domain.useCase.local

import com.omarismayilov.busybag.data.local.dto.FavoriteDTO
import com.omarismayilov.busybag.domain.repository.ProductRepository
import javax.inject.Inject

class FavUseCase @Inject constructor(
    val repository: ProductRepository
) {
    fun addFavorite(product: FavoriteDTO) = repository.addFav(product)
    fun deleteFavorite(product: FavoriteDTO) = repository.deleteFav(product)

    fun getFavorites() = repository.getFav()
}