package com.omarismayilov.busybag.presentation.ui.explore

import com.omarismayilov.busybag.domain.model.CategoryUiModel
import com.omarismayilov.busybag.domain.model.ProductUiModel
import com.omarismayilov.busybag.presentation.ui.detail.DetailUiState

sealed class ExploreUiState {
    object Loading : ExploreUiState()
    data class SuccessCategoryData(val data: List<CategoryUiModel>) : ExploreUiState()
    data class SuccessSearchData(val data: List<ProductUiModel>) : ExploreUiState()
    data class SuccessProductData(val data: List<ProductUiModel>) : ExploreUiState()
    data class Error(val message: String) : ExploreUiState()
}