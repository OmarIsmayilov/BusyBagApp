package com.omarismayilov.busybag.presentation.ui.cart

import com.omarismayilov.busybag.data.local.cart.CartDTO
import com.omarismayilov.busybag.domain.model.CartUiModel

sealed class CartUiState {
    object Loading : CartUiState()
    data class CartData(val data: List<CartUiModel>) : CartUiState()
    data class Error(val message: String) : CartUiState()
}
