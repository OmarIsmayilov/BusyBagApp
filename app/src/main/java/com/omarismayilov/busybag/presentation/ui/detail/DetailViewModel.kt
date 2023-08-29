package com.omarismayilov.busybag.presentation.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.omarismayilov.busybag.common.Resource
import com.omarismayilov.busybag.domain.mapper.Mapper.toProductUiModel
import com.omarismayilov.busybag.domain.useCase.GetProductUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    val getProductUseCase: GetProductUseCase,
) : ViewModel() {

    private val _detailState = MutableLiveData<DetailUiState>()
    val detailState: LiveData<DetailUiState> get() = _detailState

    fun getProduct(id: Int) {
        viewModelScope.launch {
            getProductUseCase(id).collectLatest {
                when (it) {
                    is Resource.Success -> {
                        _detailState.value = it.data?.let { it1 ->
                            DetailUiState.SuccessProductData(
                                it1.toProductUiModel()
                            )
                        }
                    }

                    is Resource.Error -> {
                        _detailState.value = DetailUiState.Error(it.exception)
                    }

                    is Resource.Loading -> {
                        _detailState.value = DetailUiState.Loading

                    }
                }
            }
        }
    }

}