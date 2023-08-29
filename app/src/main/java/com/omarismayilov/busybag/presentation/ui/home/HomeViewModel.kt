package com.omarismayilov.busybag.presentation.ui.home

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.omarismayilov.busybag.common.Resource
import com.omarismayilov.busybag.domain.mapper.Mapper.toProductUiList
import com.omarismayilov.busybag.domain.useCase.GetCategoryUseCase
import com.omarismayilov.busybag.domain.useCase.GetOfferUseCase
import com.omarismayilov.busybag.domain.useCase.GetPopularUseCase
import com.omarismayilov.busybag.domain.useCase.GetRecommendUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getCategoryUseCase: GetCategoryUseCase,
    private val getOfferUseCase: GetOfferUseCase,
    private val getPopularUseCase: GetPopularUseCase,
    private val getRecommendUseCase: GetRecommendUseCase,
) : ViewModel() {

    private val _homeState = MutableLiveData<HomeUiState>()
    val homeState: LiveData<HomeUiState> get() = _homeState


    init {
        getCategories()
        getPopular()
        getOffers()
        getRecommend()
    }


    private fun getRecommend() {
        viewModelScope.launch {
            getRecommendUseCase().collectLatest {
                when (it) {
                    is Resource.Success -> {
                        _homeState.value =
                            it.data?.let { it1 -> HomeUiState.SuccessRecommendData(it1.productDTOS.toProductUiList()) }
                    }

                    is Resource.Error -> {
                        _homeState.value = HomeUiState.Error(it.exception)
                    }

                    is Resource.Loading -> {
                        _homeState.value = HomeUiState.Loading
                    }
                }
            }
        }
    }


    private fun getPopular() {
        viewModelScope.launch {
            getPopularUseCase().collectLatest {
                when (it) {
                    is Resource.Success -> {
                        _homeState.value =
                            it.data?.let { it1 -> HomeUiState.SuccessPopularData(it1.productDTOS.toProductUiList()) }
                    }

                    is Resource.Error -> {
                        _homeState.value = HomeUiState.Error(it.exception)
                    }

                    is Resource.Loading -> {
                        _homeState.value = HomeUiState.Loading
                    }
                }
            }
        }
    }


    private fun getOffers() {
        viewModelScope.launch {
            getOfferUseCase().collectLatest {
                when (it) {
                    is Resource.Success -> {
                        _homeState.value =
                            it.data?.let { it1 -> HomeUiState.SuccessOfferData(it1.shuffled()) }
                    }

                    is Resource.Error -> {
                        _homeState.value = HomeUiState.Error(it.exception)
                    }

                    is Resource.Loading -> {
                        _homeState.value = HomeUiState.Loading
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
                            HomeUiState.SuccessCategoryData(
                                it1.sortedBy { it.id })
                        }
                    }

                    is Resource.Error -> {
                        _homeState.value = HomeUiState.Error(it.exception)
                    }

                    is Resource.Loading -> {
                        _homeState.value = HomeUiState.Loading
                    }
                }
            }
        }
    }


}