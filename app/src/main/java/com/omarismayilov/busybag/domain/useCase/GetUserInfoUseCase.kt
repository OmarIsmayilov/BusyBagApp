package com.omarismayilov.busybag.domain.useCase

import com.omarismayilov.busybag.domain.repository.AuthRepository
import javax.inject.Inject

class GetUserInfoUseCase @Inject constructor(
    private val repository: AuthRepository
) {
    operator fun invoke() = repository.getUserData()
}