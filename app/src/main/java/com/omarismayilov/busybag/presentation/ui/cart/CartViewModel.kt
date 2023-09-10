package com.omarismayilov.busybag.presentation.ui.cart

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.omarismayilov.busybag.common.Resource
import com.omarismayilov.busybag.data.local.cart.CartDTO
import com.omarismayilov.busybag.domain.AppUiState
import com.omarismayilov.busybag.domain.mapper.Mapper.toCartDTO
import com.omarismayilov.busybag.domain.mapper.Mapper.toCartUiList
import com.omarismayilov.busybag.domain.model.CartUiModel
import com.omarismayilov.busybag.domain.useCase.local.CartUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CartViewModel @Inject constructor(
    private val cartUseCase: CartUseCase,
) : ViewModel() {

    private val _cartState = MutableLiveData<AppUiState>()
    val cartState: LiveData<AppUiState> get() = _cartState

    private val _totalPrice = MutableLiveData(0)
    val totalPrice: LiveData<Int> get() = _totalPrice


    init {
        getProduct()
    }


    fun deleteProduct(product: CartUiModel) {
        viewModelScope.launch {
            cartUseCase.deleteProduct(product.toCartDTO())
            _totalPrice.value = 0
            getProduct()
        }
    }

    private fun getProduct(){
        viewModelScope.launch {
            cartUseCase.getProduct().collectLatest {
                when(it){
                    is Resource.Error -> _cartState.value = AppUiState.Error(it.exception)
                    Resource.Loading -> _cartState.value = AppUiState.Loading
                    is Resource.Success -> {
                        _cartState.value = AppUiState.SuccessCartData(it.data?.toCartUiList() ?: emptyList())
                        setTotal(it.data?.toCartUiList() ?: emptyList())
                    }
                }
            }
        }
    }

    fun decreasePrice(price: Int) {
        _totalPrice.value = _totalPrice.value?.minus(price)
    }

    fun increasePrice(price: Int) {
        _totalPrice.value = _totalPrice.value?.plus(price)
    }

    private fun setTotal(list: List<CartUiModel>) {
        list.forEach { increasePrice(it.price) }
    }

}