package com.omarismayilov.busybag.presentation.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.omarismayilov.busybag.common.Resource
import com.omarismayilov.busybag.domain.AppUiState
import com.omarismayilov.busybag.domain.mapper.Mapper.toProductUiList
import com.omarismayilov.busybag.domain.useCase.GetCategoryUseCase
import com.omarismayilov.busybag.domain.useCase.GetOfferUseCase
import com.omarismayilov.busybag.domain.useCase.GetProductByCategoryUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getCategoryUseCase: GetCategoryUseCase,
    private val getOfferUseCase: GetOfferUseCase,
    private val getProductByCategoryUseCase: GetProductByCategoryUseCase,
) : ViewModel() {

    private val _homeState = MutableLiveData<AppUiState>()
    val homeState: LiveData<AppUiState> get() = _homeState


    init {
        getCategories()
        getPopular()
        getOffers()
        getRecommend()
    }


    private fun getRecommend() {
        viewModelScope.launch {
            getProductByCategoryUseCase("laptops").collectLatest {
                when (it) {
                    is Resource.Success -> {
                        _homeState.value =
                            it.data?.let { it1 -> AppUiState.SuccessRecommendData(it1.productDTOS.toProductUiList()) }
                    }

                    is Resource.Error -> {
                        _homeState.value = AppUiState.Error(it.exception)
                    }

                    is Resource.Loading -> {
                        _homeState.value = AppUiState.Loading
                    }
                }
            }
        }
    }


    private fun getPopular() {
        viewModelScope.launch {
            getProductByCategoryUseCase("tops").collectLatest {
                when (it) {
                    is Resource.Success -> {
                        _homeState.value =
                            it.data?.let { it1 -> AppUiState.SuccessPopularData(it1.productDTOS.toProductUiList()) }
                    }

                    is Resource.Error -> {
                        _homeState.value = AppUiState.Error(it.exception)
                    }

                    is Resource.Loading -> {
                        _homeState.value = AppUiState.Loading
                    }
                }
            }
        }
    }


    fun getOffers() {
        viewModelScope.launch {
            getOfferUseCase().collectLatest {
                when (it) {
                    is Resource.Success -> {
                        _homeState.value =
                            it.data?.let { it1 -> AppUiState.SuccessOfferData(it1.shuffled()) }
                    }

                    is Resource.Error -> {
                        _homeState.value = AppUiState.Error(it.exception)
                    }

                    is Resource.Loading -> {
                        _homeState.value = AppUiState.Loading
                    }
                }
            }
        }
    }

    private fun getCategories() {
        viewModelScope.launch {
            getCategoryUseCase().collectLatest {
                when (it) {
                    is Resource.Success -> {
                        _homeState.value = it.data?.let { it1 ->
                            AppUiState.SuccessCategoryData(
                                it1.sortedBy { it.id })
                        }
                    }

                    is Resource.Error -> {
                        _homeState.value = AppUiState.Error(it.exception)
                    }

                    is Resource.Loading -> {
                        _homeState.value = AppUiState.Loading
                    }
                }
            }
        }
    }


}