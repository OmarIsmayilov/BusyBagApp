package com.omarismayilov.busybag.domain

import com.omarismayilov.busybag.domain.model.CartUiModel
import com.omarismayilov.busybag.domain.model.CategoryUiModel
import com.omarismayilov.busybag.domain.model.FavoriteUiModel
import com.omarismayilov.busybag.domain.model.OfferUiModel
import com.omarismayilov.busybag.domain.model.ProductUiModel


sealed class AppUiState {
    object Loading : AppUiState()
    object SuccessAuth : AppUiState()
    data class SuccessOfferProductData(val list : List<ProductUiModel>) : AppUiState()
    data class SuccessOfferData(val list : List<OfferUiModel>) : AppUiState()
    data class SuccessCategoryData(val list : List<CategoryUiModel>) : AppUiState()
    data class SuccessPopularData(val list : List<ProductUiModel>) : AppUiState()
    data class SuccessRecommendData(val list : List<ProductUiModel>) : AppUiState()
    data class SuccessFavProductData(val data: List<FavoriteUiModel>) : AppUiState()
    data class SuccessSearchData(val data: List<ProductUiModel>) : AppUiState()
    data class SuccessProductsData(val data: List<ProductUiModel>) : AppUiState()
    data class SuccessCartData(val data: List<CartUiModel>) : AppUiState()
    data class SuccessProductData(val data: ProductUiModel) : AppUiState()
    data class SuccessAddFavorite(val message: String?=null) : AppUiState()
    data class Error(val message: String) : AppUiState()
}
