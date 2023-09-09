package com.omarismayilov.busybag.domain.useCase

import com.omarismayilov.busybag.domain.repository.ProductRepository
import javax.inject.Inject

class GetSearchUseCase @Inject constructor(
    val repository: ProductRepository
){
    suspend operator fun invoke(query:String) = repository.getSearch(query)
}