package com.omarismayilov.movaapp.common.utils

import android.content.Context
import android.content.SharedPreferences
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import com.omarismayilov.busybag.common.Constants.APP_LANG
import com.omarismayilov.busybag.common.Constants.PHOTO_USER
import com.omarismayilov.busybag.common.Constants.SP_NAME
import com.omarismayilov.busybag.common.Constants.TOKEN_USER

class SharedPrefManager (private val context: Context) {

    private val masterKey: MasterKey by lazy {
        MasterKey.Builder(context).setKeyScheme(MasterKey.KeyScheme.AES256_GCM).build()
    }

    private val sharedPreferences: SharedPreferences by lazy {
        EncryptedSharedPreferences.create(
            context,
            SP_NAME,
            masterKey,
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
        )
    }


    fun saveToken(token: String?) {
        with(sharedPreferences.edit()) {
            putString(TOKEN_USER, token)
            apply()
        }
    }

    fun getToken() = sharedPreferences.getString(TOKEN_USER, null)


    fun saveLang(lang: String?) {
        with(sharedPreferences.edit()) {
            putString(APP_LANG, lang)
            apply()
        }
    }

    fun getLang() = sharedPreferences.getString(APP_LANG, "en")


    fun savePhoto(uri: String?) {
        with(sharedPreferences.edit()) {
            putString(PHOTO_USER, uri)
            apply()
        }
    }

    fun getPhoto() = sharedPreferences.getString(PHOTO_USER, null)



}