package com.omarismayilov.busybag.presentation.ui.auth

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.omarismayilov.busybag.common.Resource
import com.omarismayilov.busybag.domain.model.UserUiModel
import com.omarismayilov.busybag.domain.useCase.AuthUseCase
import com.omarismayilov.movaapp.common.utils.SharedPrefManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    val authUseCase: AuthUseCase,
    val sp: SharedPrefManager,
) : ViewModel() {

    private val _authState = MutableLiveData<AuthUiState>()
    val authState: LiveData<AuthUiState> get() = _authState


    fun loginUser(email: String, password: String, userUiModel: UserUiModel) {
        viewModelScope.launch {
            authUseCase.login(email, password).collectLatest {
                when (it) {
                    is Resource.Loading -> {
                        _authState.postValue(AuthUiState.Loading)
                    }

                    is Resource.Success -> {
                        sp.saveToken(it.data?.user?.uid)
                        _authState.postValue(AuthUiState.SuccessAuth)
                        addUser(userUiModel)
                    }

                    is Resource.Error -> {
                        _authState.postValue(AuthUiState.Error(it.exception))
                    }
                }
            }
        }
    }

    private fun addUser(userUiModel: UserUiModel) {
        viewModelScope.launch {
            authUseCase.addUser(userUiModel).collectLatest {
                when(it){
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

    fun registerUser(email: String, password: String) {
        viewModelScope.launch {
            authUseCase.register(email, password).collectLatest {
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
            authUseCase.logout().collectLatest {
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