package com.omarismayilov.busybag.domain.useCase

import com.omarismayilov.busybag.common.InfoEnum
import com.omarismayilov.busybag.domain.model.UserUiModel
import com.omarismayilov.busybag.domain.repository.AuthRepository
import javax.inject.Inject

class AuthUseCase @Inject constructor(
    val repository: AuthRepository
) {
    suspend fun login(email:String,password:String) = repository.loginUser(email,password)
    suspend fun register(email: String, password: String) = repository.registerUser(email, password)
    suspend fun logout() = repository.logOutUser()
    suspend fun getUserInfo() =  repository.getUserInfo()
    suspend fun addUser(userUiModel:UserUiModel) =  repository.addUser(userUiModel)
    suspend fun updateUser(info: InfoEnum, updatedData: String) = repository.updateUser(info, updatedData)
}