package com.omarismayilov.busybag.domain.repository

import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseUser
import com.omarismayilov.busybag.common.Resource
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    fun loginUser(email: String, password: String): Flow<Resource<AuthResult>>
    fun registerUser(email: String, password: String): Flow<Resource<AuthResult>>
    fun getUserData(): Flow<Resource<FirebaseUser>>
    fun logOutUser(): Flow<Resource<Boolean>>
}