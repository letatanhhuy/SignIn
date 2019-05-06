package com.example.signup

import com.example.signup.Util.LoginValidation
import org.junit.Assert
import org.junit.Before
import org.junit.Test


class LoginValidatuionTest {

    @Before
    fun setup() {

    }
    @Test
    fun testValidateName() {
        Assert.assertFalse(LoginValidation.validateName(""))
        Assert.assertTrue(LoginValidation.validateName("a"))
    }

    @Test
    fun testValidatePassword() {
        Assert.assertFalse(LoginValidation.validatePassword(""))
        Assert.assertFalse(LoginValidation.validatePassword("1"))
        Assert.assertFalse(LoginValidation.validatePassword("12"))
        Assert.assertFalse(LoginValidation.validatePassword("123"))
        Assert.assertFalse(LoginValidation.validatePassword("1234"))
        Assert.assertTrue(LoginValidation.validatePassword("12345"))
    }
}