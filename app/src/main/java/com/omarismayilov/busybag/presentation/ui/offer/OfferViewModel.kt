package com.omarismayilov.busybag.presentation.ui.offer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.omarismayilov.busybag.common.Resource
import com.omarismayilov.busybag.domain.AppUiState
import com.omarismayilov.busybag.domain.mapper.Mapper.toProductUiList
import com.omarismayilov.busybag.domain.useCase.GetProductsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OfferViewModel @Inject constructor(
    val getProductsUseCase: GetProductsUseCase
) : ViewModel() {

    private val _offerState = MutableLiveData<AppUiState>()
    val offerState: LiveData<AppUiState> get() = _offerState


    fun getProducts(discount: Double) {
        viewModelScope.launch {
            getProductsUseCase().collectLatest { result ->
                when (result) {
                    is Resource.Success -> {
                        _offerState.postValue(result.data?.let { it1 ->
                            AppUiState.SuccessOfferProductData(
                                it1.productDTOS.toProductUiList().filter { it.discount.toInt()==discount.toInt() }
                            )
                        })
                    }

                    is Resource.Error -> {
                        _offerState.postValue(AppUiState.Error(result.exception))
                    }

                    is Resource.Loading -> {
                        _offerState.postValue(AppUiState.Loading)
                    }

                }
            }
        }
    }
}