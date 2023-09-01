package com.omarismayilov.busybag.presentation.ui.detail

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.omarismayilov.busybag.common.Resource
import com.omarismayilov.busybag.data.local.FavoriteDAO
import com.omarismayilov.busybag.data.local.dto.FavoriteDTO
import com.omarismayilov.busybag.domain.mapper.Mapper.toFavoriteDTO
import com.omarismayilov.busybag.domain.mapper.Mapper.toProductUiModel
import com.omarismayilov.busybag.domain.model.ProductUiModel
import com.omarismayilov.busybag.domain.useCase.GetProductUseCase
import com.omarismayilov.busybag.domain.useCase.local.FavUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    private val getProductUseCase: GetProductUseCase,
    private val favUseCase: FavUseCase
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

    fun addFav(product: ProductUiModel){
        viewModelScope.launch {
            favUseCase.addFavorite(product.toFavoriteDTO()).collectLatest {
                when(it){
                    is Resource.Success->{
                        _detailState.value = DetailUiState.SuccessFavData("Added succesfully")
                    }
                    is Resource.Error->{
                        _detailState.value = DetailUiState.Error(it.exception)
                    }
                    is Resource.Loading->{
                        _detailState.value = DetailUiState.Loading
                    }
                }
            }
        }
    }


    fun deleteFav(product: ProductUiModel){
        viewModelScope.launch {
            favUseCase.deleteFavorite(product.toFavoriteDTO()).collectLatest {
                when(it){
                    is Resource.Success->{
                        _detailState.value = DetailUiState.SuccessFavData("Removed succesfully")
                    }
                    is Resource.Error->{
                        _detailState.value = DetailUiState.Error(it.exception)
                    }
                    is Resource.Loading->{
                        _detailState.value = DetailUiState.Loading
                    }
                }
            }
        }
    }


    fun isProductFavorite(id: Int, callback: (Boolean) -> Unit) {
        viewModelScope.launch {
            favUseCase.isFavorite(id).collectLatest {
                callback(it)
            }
        }
    }





}