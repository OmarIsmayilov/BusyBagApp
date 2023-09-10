package com.omarismayilov.busybag.presentation.ui.favorite

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.omarismayilov.busybag.common.Resource
import com.omarismayilov.busybag.domain.mapper.Mapper.toFavUiModelList
import com.omarismayilov.busybag.domain.mapper.Mapper.toFavoriteDTO
import com.omarismayilov.busybag.domain.model.FavoriteUiModel
import com.omarismayilov.busybag.domain.useCase.local.FavoriteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FavoriteViewModel @Inject constructor(
    private val favoriteUseCase: FavoriteUseCase
): ViewModel() {

    private val _favState = MutableLiveData<FavoriteUiState>()
    val favState :LiveData<FavoriteUiState> get() = _favState

    init {
        getFav()
    }

    private fun getFav(){
        viewModelScope.launch {
            favoriteUseCase.getFavorites().collectLatest {
                when(it){
                    is Resource.Success->{
                        _favState.value = it.data?.let { it1 -> FavoriteUiState.SuccessFavData(it1.toFavUiModelList()) }
                    }
                    is Resource.Error->{
                        _favState.value = FavoriteUiState.Error(it.exception)
                    }
                    is Resource.Loading->{
                        _favState.value = FavoriteUiState.Loading
                    }
                }
            }
        }
    }

    fun deleteFav(product:FavoriteUiModel){
        viewModelScope.launch {
            favoriteUseCase.deleteFavorite(product.toFavoriteDTO())
            getFav()
        }
    }


}