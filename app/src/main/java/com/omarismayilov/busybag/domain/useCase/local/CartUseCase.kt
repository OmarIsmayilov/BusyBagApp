package com.omarismayilov.busybag.domain.useCase.local

import com.omarismayilov.busybag.data.local.cart.CartDTO
import com.omarismayilov.busybag.domain.repository.ProductRepository
import javax.inject.Inject

class CartUseCase @Inject constructor(
    private val cartRepository : ProductRepository
) {
    suspend fun addProduct(product:CartDTO) = cartRepository.addCart(product)
    suspend fun deleteProduct(product:CartDTO) = cartRepository.deleteCart(product)
    suspend fun getProduct() = cartRepository.getCart()
}