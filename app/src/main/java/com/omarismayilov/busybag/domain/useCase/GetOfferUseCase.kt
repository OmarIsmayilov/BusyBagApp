package com.omarismayilov.busybag.domain.useCase

import com.omarismayilov.busybag.domain.repository.ProductRepository
import javax.inject.Inject

class GetOfferUseCase @Inject constructor(
    private val productRepository: ProductRepository
){
    operator fun invoke() = productRepository.getOffers()
}