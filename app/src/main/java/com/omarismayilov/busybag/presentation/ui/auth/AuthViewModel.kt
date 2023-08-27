package com.omarismayilov.busybag.presentation.ui.auth

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.omarismayilov.busybag.common.Resource
import com.omarismayilov.busybag.domain.repository.AuthRepository
import com.omarismayilov.busybag.domain.useCase.GetUserInfoUseCase
import com.omarismayilov.busybag.domain.useCase.LoginUseCase
import com.omarismayilov.busybag.domain.useCase.LogoutUseCase
import com.omarismayilov.busybag.domain.useCase.RegisterUseCase
import com.omarismayilov.movaapp.common.utils.SharedPrefManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    val loginUseCase: LoginUseCase,
    val registerUseCase: RegisterUseCase,
    val logoutUseCase: LogoutUseCase,
    val getUserInfoUseCase: GetUserInfoUseCase,
    val sp: SharedPrefManager,
) : ViewModel() {

    private val _authState = MutableLiveData<AuthUiState>()
    val authState: LiveData<AuthUiState> get() = _authState

    fun loginUser(email: String, password: String) {
        viewModelScope.launch {
            loginUseCase(email, password).collectLatest {
                when (it) {
                    is Resource.Loading -> {
                        _authState.postValue(AuthUiState.Loading)
                    }

                    is Resource.Success -> {
                        sp.saveToken(it.data?.user?.uid)
                        _authState.postValue(AuthUiState.SuccessAuth)
                    }

                    is Resource.Error -> {
                        _authState.postValue(AuthUiState.Error(it.exception))
                    }
                }
            }
        }
    }

    fun registerUser(email: String, password: String) {
        viewModelScope.launch {
            registerUseCase(email, password).collectLatest {
                when (it) {
                    is Resource.Loading -> {
                        _authState.postValue(AuthUiState.Loading)
                    }

                    is Resource.Success -> {
                        _authState.postValue(AuthUiState.SuccessAuth)
                    }

                    is Resource.Error -> {
                        _authState.postValue(AuthUiState.Error(it.exception))
                    }
                }
            }
        }
    }

     fun logoutUser() {
        viewModelScope.launch {
            logoutUseCase().collectLatest {
                when (it) {
                    is Resource.Loading -> {
                        _authState.postValue(AuthUiState.Loading)
                    }

                    is Resource.Success -> {
                        sp.saveToken(null)
                        _authState.postValue(AuthUiState.SuccessAuth)
                    }

                    is Resource.Error -> {
                        _authState.postValue(AuthUiState.Error(it.exception))
                    }
                }
            }
        }
    }




}