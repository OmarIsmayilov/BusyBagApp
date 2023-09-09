package com.omarismayilov.busybag.domain.useCase

import com.omarismayilov.busybag.domain.repository.ProductRepository
import javax.inject.Inject

class GetProductUseCase @Inject constructor(
    val repository: ProductRepository
) {
    suspend operator fun invoke(id:Int) =  repository.getProduct(id)
}