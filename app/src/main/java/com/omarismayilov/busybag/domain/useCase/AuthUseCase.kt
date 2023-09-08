package com.omarismayilov.busybag.domain.useCase

import com.omarismayilov.busybag.domain.model.UserUiModel
import com.omarismayilov.busybag.domain.repository.AuthRepository
import javax.inject.Inject

class AuthUseCase @Inject constructor(
    val repository: AuthRepository
) {
    fun login(email:String,password:String) = repository.loginUser(email,password)
    fun register(email: String, password: String) = repository.registerUser(email, password)
    fun logout() = repository.logOutUser()
    fun getUser() =  repository.getUserData()
    fun addUser(userUiModel:UserUiModel) =  repository.addUser(userUiModel)
}