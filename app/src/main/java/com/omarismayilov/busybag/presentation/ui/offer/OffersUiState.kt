package com.omarismayilov.busybag.presentation.ui.offer

import com.omarismayilov.busybag.domain.model.ProductUiModel

sealed class OffersUiState {
    object Loading : OffersUiState()
    data class SuccessOfferProductData(val list : List<ProductUiModel>) : OffersUiState()
    data class Error(val message : String) :OffersUiState()
}