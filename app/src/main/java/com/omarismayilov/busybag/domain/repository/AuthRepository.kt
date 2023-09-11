package com.omarismayilov.busybag.domain.repository

import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseUser
import com.omarismayilov.busybag.common.InfoEnum
import com.omarismayilov.busybag.common.Resource
import com.omarismayilov.busybag.domain.model.UserUiModel
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    suspend fun loginUser(email: String, password: String): Flow<Resource<AuthResult>>
    suspend fun registerUser(email: String, password: String): Flow<Resource<AuthResult>>
    suspend fun getUserInfo(): Flow<Resource<UserUiModel>>
    suspend fun logOutUser(): Flow<Resource<Boolean>>
    suspend fun addUser(userUiModel: UserUiModel): Flow<Resource<Boolean>>
    suspend fun updateUser(info: InfoEnum, updatedData: String): Flow<Resource<Boolean>>

}