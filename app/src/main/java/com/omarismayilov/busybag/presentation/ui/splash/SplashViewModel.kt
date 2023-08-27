package com.omarismayilov.busybag.presentation.ui.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.omarismayilov.movaapp.common.utils.SharedPrefManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    val sp: SharedPrefManager
): ViewModel() {

    private val _authData = MutableLiveData(false)
    val authData: LiveData<Boolean> get() = _authData

    init {
        getAuth()
    }

    fun getAuth() {
        sp.getToken()?.let {
            _authData.postValue(true)
        }
    }


}