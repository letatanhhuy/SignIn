package com.example.signup.Util

object LoginValidation {
    fun validateLoginInfo(name: String, pwd: String):Boolean {
        return name == "Le Huy" && pwd == "@123456"
    }
    fun validateName(input:String):Boolean {
        return false
    }
    fun validatePassword(input:String):Boolean {
        return false
    }
}