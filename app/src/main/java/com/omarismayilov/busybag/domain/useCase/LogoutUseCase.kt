package com.omarismayilov.busybag.domain.useCase

import com.omarismayilov.busybag.domain.repository.AuthRepository
import javax.inject.Inject

class LogoutUseCase @Inject constructor(
    private val  repository: AuthRepository
) {
    operator fun invoke() = repository.logOutUser()
}