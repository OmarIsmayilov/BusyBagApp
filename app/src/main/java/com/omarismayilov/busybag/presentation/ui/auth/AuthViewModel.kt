package com.omarismayilov.busybag.presentation.ui.auth

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.omarismayilov.busybag.common.Resource
import com.omarismayilov.busybag.domain.AppUiState
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

    private val _authState = MutableLiveData<AppUiState>()
    val authState: LiveData<AppUiState> get() = _authState


    fun loginUser(email: String, password: String) {
        viewModelScope.launch {
            authUseCase.login(email, password).collectLatest {
                when (it) {
                    is Resource.Loading -> {
                        _authState.postValue(AppUiState.Loading)
                    }

                    is Resource.Success -> {
                        sp.saveToken(it.data?.user?.uid)
                        _authState.postValue(AppUiState.SuccessAuth)
                    }

                    is Resource.Error -> {
                        _authState.postValue(AppUiState.Error(it.exception))
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
                        _authState.postValue(AppUiState.Loading)
                    }

                    is Resource.Success -> {
                        _authState.postValue(AppUiState.SuccessAuth)
                    }

                    is Resource.Error -> {
                        _authState.postValue(AppUiState.Error(it.exception))
                    }
                }
            }
        }
    }

    fun registerUser(email: String, password: String,user:UserUiModel) {
        viewModelScope.launch {
            authUseCase.register(email, password).collectLatest {
                when (it) {
                    is Resource.Loading -> {
                        _authState.postValue(AppUiState.Loading)
                    }

                    is Resource.Success -> {
                        _authState.postValue(AppUiState.SuccessAuth)
                        addUser(user)
                    }

                    is Resource.Error -> {
                        _authState.postValue(AppUiState.Error(it.exception))
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
                        _authState.postValue(AppUiState.Loading)
                    }

                    is Resource.Success -> {
                        sp.saveToken(null)
                        _authState.postValue(AppUiState.SuccessAuth)
                    }

                    is Resource.Error -> {
                        _authState.postValue(AppUiState.Error(it.exception))
                    }
                }
            }
        }
    }


}