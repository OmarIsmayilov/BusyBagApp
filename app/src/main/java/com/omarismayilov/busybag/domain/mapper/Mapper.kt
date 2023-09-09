package com.omarismayilov.busybag.domain.mapper

import com.omarismayilov.busybag.data.local.cart.CartDTO
import com.omarismayilov.busybag.data.local.favorite.FavoriteDTO
import com.omarismayilov.busybag.data.remote.dto.ProductDTO
import com.omarismayilov.busybag.domain.model.CartUiModel
import com.omarismayilov.busybag.domain.model.FavoriteUiModel
import com.omarismayilov.busybag.domain.model.ProductUiModel
import java.util.Locale

object Mapper {

    fun ProductDTO.toProductUiModel() =
        ProductUiModel(
            id,
            title.capitalize(Locale.ROOT),
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

    fun FavoriteUiModel.toFavoriteDTO() =
        FavoriteDTO(
            id,
            title,
            rating,
            price,
            originalPrice,
            discount,
            image
        )

    fun List<FavoriteDTO>.toFavUiModelList() = map {
        FavoriteUiModel(
            it.id,
            it.title,
            it.rating,
            it.price,
            it.originalPrice,
            it.discount,
            it.image
        )
    }

    fun List<CartDTO>.toCartUiList() = map {
        CartUiModel(
            it.id,
            it.title,
            "$ ${it.price}",
            it.image,
            it.quantity
        )
    }



    fun List<ProductDTO>.toProductUiList() = map {
        ProductUiModel(
            it.id,
            it.title.capitalize(Locale.ROOT),
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