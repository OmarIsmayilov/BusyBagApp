package com.omarismayilov.busybag.domain.mapper

import com.omarismayilov.busybag.data.local.dto.FavoriteDTO
import com.omarismayilov.busybag.data.remote.dto.ProductDTO
import com.omarismayilov.busybag.domain.model.ProductUiModel

object Mapper {

    fun ProductDTO.toProductUiModel() =
        ProductUiModel(
            id,
            title.capitalize(),
            description,
            rating.toInt(),
            discountPercentage,
            images,
            price,
            price / (1 - (discountPercentage / 100)),
            stock,
            category,
            brand,
            thumbnail

        )

    fun ProductUiModel.toFavoriteDTO() =
        FavoriteDTO(
            id,
            title,
            rating,
            price,
            originalPrice,
            discount.toInt(),
            images[0]
        )

    fun List<ProductDTO>.toProductUiList() = map {
        ProductUiModel(
            it.id,
            it.title.capitalize(),
            it.description,
            it.rating.toInt(),
            it.discountPercentage,
            it.images,
            it.price,
            it.price / (1 - (it.discountPercentage / 100)),
            it.stock,
            it.category,
            it.brand,
            it.thumbnail
        )
    }
}