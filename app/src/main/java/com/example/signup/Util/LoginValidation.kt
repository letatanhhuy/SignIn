package com.example.signup.Util

import android.content.Context
import android.util.Log
import com.example.signup.SharePreferences.SharedPreferenceHelper

object LoginValidation {
    fun validateLoginInfo(name: String, pwd: String, context: Context?):Boolean {
        var retVal = false
        if (context != null && validateName(name) && validatePassword(pwd)) {
            var getLogInInfo = SharedPreferenceHelper.getSignedInInfo(context)
            retVal = name == getLogInInfo.name && pwd == getLogInInfo.password
        }
        return retVal
    }
    fun validateName(input:String):Boolean {
        return input.isNotEmpty()
    }
    fun validatePassword(input:String):Boolean {
        return input.length > 4
    }
    private const val TAG = "TestApp-LoginValidation"
}