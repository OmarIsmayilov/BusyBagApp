package com.omarismayilov.busybag.presentation.ui.explore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.omarismayilov.busybag.common.Resource
import com.omarismayilov.busybag.domain.AppUiState
import com.omarismayilov.busybag.domain.mapper.Mapper.toProductUiList
import com.omarismayilov.busybag.domain.useCase.GetCategoryUseCase
import com.omarismayilov.busybag.domain.useCase.GetProductByCategoryUseCase
import com.omarismayilov.busybag.domain.useCase.GetSearchUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ExploreViewModel @Inject constructor(
    val getCategoryUseCase: GetCategoryUseCase,
    val getProductByCategoryUseCase: GetProductByCategoryUseCase,
    val getSearchUseCase: GetSearchUseCase
) : ViewModel() {

    private val _exploreState = MutableLiveData<AppUiState>()
    val exploreState: LiveData<AppUiState> get() = _exploreState

    init {
        getCategory()
    }

    private fun getCategory() {
        viewModelScope.launch {
            getCategoryUseCase().collectLatest {
                when (it) {
                    is Resource.Success -> {
                        _exploreState.value = it.data?.let { it1 ->
                            AppUiState.SuccessCategoryData(
                                it1
                            )
                        }
                    }

                    is Resource.Error -> {
                        _exploreState.value = AppUiState.Error(it.exception)
                    }

                    is Resource.Loading -> {
                        _exploreState.value = AppUiState.Loading

                    }
                }
            }
        }
    }


    fun getProductByCategory(category: String) {
        viewModelScope.launch {
            getProductByCategoryUseCase(category).collectLatest {
                when (it) {
                    is Resource.Success -> {
                        _exploreState.value = it.data?.let { it1 ->
                            AppUiState.SuccessProductsData(
                                it1.productDTOS.toProductUiList()
                            )
                        }
                    }

                    is Resource.Error -> {
                        _exploreState.value = AppUiState.Error(it.exception)
                    }

                    is Resource.Loading -> {
                        _exploreState.value = AppUiState.Loading

                    }
                }
            }
        }
    }


    fun getSearch(query: String) {
        viewModelScope.launch {
            getSearchUseCase(query).collectLatest {
                when (it) {
                    is Resource.Success -> {
                        _exploreState.value = it.data?.let { it1 ->
                            AppUiState.SuccessSearchData(
                                it1.productDTOS.toProductUiList()
                            )
                        }
                    }

                    is Resource.Error -> {
                        _exploreState.value = AppUiState.Error(it.exception)
                    }

                    is Resource.Loading -> {
                        _exploreState.value = AppUiState.Loading

                    }
                }
            }
        }
    }


}