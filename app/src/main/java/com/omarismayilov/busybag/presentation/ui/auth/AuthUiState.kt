package com.omarismayilov.busybag.presentation.ui.auth

import com.google.firebase.auth.AuthResult


sealed class AuthUiState {
    object Loading : AuthUiState()
    object SuccessAuth : AuthUiState()
    data class Error(val message: String) : AuthUiState()
}
