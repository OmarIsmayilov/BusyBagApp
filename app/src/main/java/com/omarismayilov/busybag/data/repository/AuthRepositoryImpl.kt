package com.omarismayilov.busybag.data.repository

import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.firestore.FirebaseFirestore
import com.omarismayilov.busybag.common.Resource
import com.omarismayilov.busybag.domain.model.UserUiModel
import com.omarismayilov.busybag.domain.repository.AuthRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val firebaseAuth: FirebaseAuth,
    private val firestore: FirebaseFirestore,
) : AuthRepository {

    override fun loginUser(email: String, password: String): Flow<Resource<AuthResult>> = flow {
        emit(Resource.Loading)
        val auth = firebaseAuth.signInWithEmailAndPassword(email, password).await()
        emit(Resource.Success(auth))
    }.catch {
        emit(Resource.Error(it.localizedMessage ?: "Error 404"))
    }

    override fun registerUser(email: String, password: String): Flow<Resource<AuthResult>> = flow {
        emit(Resource.Loading)
        val auth = firebaseAuth.createUserWithEmailAndPassword(email, password).await()
        emit(Resource.Success(auth))
    }.catch {
        emit(Resource.Error(it.localizedMessage ?: "Error 404"))
    }

    override fun getUserData(): Flow<Resource<FirebaseUser>> = flow {
        emit(Resource.Loading)
        val user = firebaseAuth.currentUser
        emit(Resource.Success(user))
    }.catch {
        emit(Resource.Error(it.localizedMessage ?: "Error 404"))
    }

    override fun logOutUser(): Flow<Resource<Boolean>> = flow {
        emit(Resource.Loading)
        firebaseAuth.signOut()
        emit(Resource.Success(true))
    }.catch {
        emit(Resource.Error(it.localizedMessage ?: "Error 404"))
    }

    override fun addUser(userUiModel: UserUiModel): Flow<Resource<Boolean>> = flow {
        emit(Resource.Loading)
        val uid = firebaseAuth.currentUser?.uid ?: ""
        userUiModel.uid = uid
        firestore.collection("users").document(uid).set(userUiModel).await()
        emit(Resource.Success(true))
    }.catch {
        emit(Resource.Error(it.localizedMessage ?: "Error 404"))
    }

}