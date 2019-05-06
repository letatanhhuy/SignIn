package com.example.signup.Util

import android.content.Context
import android.util.Log
import com.example.signup.SharePreferences.SharePreferencesEntity
import com.example.signup.SharePreferences.SharedPreferenceHelper

object SignUpHelper {
    fun signUp(name: String, pwd: String, context: Context?): Boolean {
        var retVal = false
        if (context != null && LoginValidation.validatePassword(pwd) && LoginValidation.validateName(name)) {
            Log.d(TAG, "sign up name:$name password:$pwd")
            SharedPreferenceHelper.saveSignUpInformation(context, SharePreferencesEntity(name, pwd))
            retVal = true
        }
        return retVal
    }
    private const val TAG = "TestApp-LoginValidation"
}