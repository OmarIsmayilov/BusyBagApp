package com.omarismayilov.busybag.domain.useCase

import com.omarismayilov.busybag.domain.repository.ProductRepository
import javax.inject.Inject

class GetCategoryUseCase @Inject constructor(
    private val productRepository: ProductRepository
){
    suspend operator fun invoke() = productRepository.getCategories()
}