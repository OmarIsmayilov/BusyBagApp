package com.omarismayilov.busybag.domain.useCase

import com.omarismayilov.busybag.domain.repository.ProductRepository
import javax.inject.Inject

class GetProductByCategoryUseCase  @Inject constructor(
    private val productRepository: ProductRepository
){
    suspend operator fun invoke(category:String) = productRepository.getProductByCategory(category)
}