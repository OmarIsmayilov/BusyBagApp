package com.omarismayilov.busybag.presentation.ui.favorite

import com.omarismayilov.busybag.domain.model.FavoriteUiModel
import com.omarismayilov.busybag.domain.model.ProductUiModel
import com.omarismayilov.busybag.presentation.ui.detail.DetailUiState

sealed class FavoriteUiState {
    object Loading : FavoriteUiState()
    data class SuccessFavData(val data: List<FavoriteUiModel>) : FavoriteUiState()
    data class SuccessDeleteData(val message: String) : FavoriteUiState()
    data class Error(val message: String) : FavoriteUiState()
}