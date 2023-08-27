package com.omarismayilov.busybag.presentation.ui.home

import com.omarismayilov.busybag.data.remote.dto.ProductDTO
import com.omarismayilov.busybag.domain.model.CategoryUiModel
import com.omarismayilov.busybag.domain.model.OfferUiModel
import com.omarismayilov.busybag.domain.model.ProductUiModel

sealed class HomeUiState{
    object Loading :HomeUiState()
    data class SuccessOfferData(val list : List<OfferUiModel>) : HomeUiState()
    data class SuccessCategoryData(val list : List<CategoryUiModel>) : HomeUiState()
    data class SuccessPopularData(val list : List<ProductUiModel>) : HomeUiState()
    data class SuccessRecommendData(val list : List<ProductUiModel>) : HomeUiState()
    data class Error(val message : String) : HomeUiState()
}
