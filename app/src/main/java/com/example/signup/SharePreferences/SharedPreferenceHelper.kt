package com.example.signup.SharePreferences

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

object SharedPreferenceHelper {
    private const val SIGNED_IN = "signed_in"
    private const val USER_NAME = "user_name"
    private const val USER_PASSWORD = "user_password"

    private fun getSharedPreferences(context:Context):SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }

    fun saveLoginInformation(context: Context, isSignedIn: Boolean) {
        getSharedPreferences(context).edit().putBoolean(SIGNED_IN, isSignedIn)
    }

    fun saveSignUpInformation(context: Context, info:SharePreferencesEntity) {
        getSharedPreferences(context).edit().apply {
            putString(USER_NAME, info.name)
            putString(USER_PASSWORD, info.password)
        }.commit()
    }

    fun isLoggedIn(context: Context):Boolean {
        return getSharedPreferences(context).getBoolean(SIGNED_IN, false)
    }

    fun getSignedInInfo(context: Context):SharePreferencesEntity {
        val name = getSharedPreferences(context).getString(USER_NAME, "")
        val pwd = getSharedPreferences(context).getString(USER_PASSWORD, "")
        return SharePreferencesEntity(name, pwd)
    }
}