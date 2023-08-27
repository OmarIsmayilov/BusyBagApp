package com.omarismayilov.busybag.data.remote.dto


import com.google.gson.annotations.SerializedName

data class ProductsDTO(
    @SerializedName("limit")
    val limit: Int,
    @SerializedName("products")
    val productDTOS: List<ProductDTO>,
    @SerializedName("skip")
    val skip: Int,
    @SerializedName("total")
    val total: Int
)