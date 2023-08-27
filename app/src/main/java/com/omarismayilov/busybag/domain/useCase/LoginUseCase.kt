package com.omarismayilov.busybag.domain.useCase

import com.omarismayilov.busybag.domain.repository.AuthRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val repository: AuthRepository
) {
    operator fun invoke(email:String,password:String) = repository.loginUser(email,password)
}