package com.omarismayilov.busybag.domain.model

import com.google.gson.annotations.SerializedName

data class ProductUiModel(
    val id: Int,
    val title: String,
    val description: String,
    val rating: Int,
    val discount: Double,
    val images: List<String>,
    val price: Int,
    val originalPrice: Double,
    val thumbnail: String,
) {
    fun formatPrice() = "$ $price"
    fun formatDiscount() = "% ${discount.toInt()} Off "

}
