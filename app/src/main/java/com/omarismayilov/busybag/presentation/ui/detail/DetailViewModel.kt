package com.omarismayilov.busybag.presentation.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.omarismayilov.busybag.common.Resource
import com.omarismayilov.busybag.data.local.cart.CartDTO
import com.omarismayilov.busybag.domain.AppUiState
import com.omarismayilov.busybag.domain.mapper.Mapper.toFavoriteDTO
import com.omarismayilov.busybag.domain.mapper.Mapper.toProductUiModel
import com.omarismayilov.busybag.domain.model.ProductUiModel
import com.omarismayilov.busybag.domain.useCase.GetProductUseCase
import com.omarismayilov.busybag.domain.useCase.local.CartUseCase
import com.omarismayilov.busybag.domain.useCase.local.FavoriteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    private val getProductUseCase: GetProductUseCase,
    private val favoriteUseCase: FavoriteUseCase,
    private val cartUseCase: CartUseCase,

    ) : ViewModel() {

    private val _detailState = MutableLiveData<AppUiState>()
    val detailState: LiveData<AppUiState> get() = _detailState

    fun getProduct(id: Int) {
        viewModelScope.launch {
            getProductUseCase(id).collectLatest {
                when (it) {
                    is Resource.Success -> {
                        _detailState.value = it.data?.let { it1 ->
                            AppUiState.SuccessProductData(
                                it1.toProductUiModel()
                            )
                        }
                    }

                    is Resource.Error -> {
                        _detailState.value = AppUiState.Error(it.exception)
                    }

                    is Resource.Loading -> {
                        _detailState.value = AppUiState.Loading
                    }
                }
            }
        }
    }

    fun addFavorite(product: ProductUiModel){
        viewModelScope.launch {
            favoriteUseCase.addFavorite(product.toFavoriteDTO())
        }
    }


    fun deleteFavorite(product: ProductUiModel){
        viewModelScope.launch {
            favoriteUseCase.deleteFavorite(product.toFavoriteDTO())
        }
    }


    fun isProductFavorite(id: Int, callback: (Boolean) -> Unit) {
        viewModelScope.launch {
            favoriteUseCase.isFavorite(id).collectLatest {
                callback(it)
            }
        }
    }

    fun addCartProduct(product: CartDTO) {
        viewModelScope.launch {
            cartUseCase.addProduct(product)
        }
    }





}