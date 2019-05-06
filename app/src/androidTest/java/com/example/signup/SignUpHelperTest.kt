package com.example.signup

import android.support.test.InstrumentationRegistry
import com.example.signup.Util.LoginValidation
import com.example.signup.Util.SignUpHelper
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class SignUpHelperTest {
    private val context = InstrumentationRegistry.getInstrumentation().targetContext
    @Before
    fun setup() {
        SignUpHelper.signUp("huyle","123456", context)
    }

    @Test
    fun signUpTestSuccess() {
        Assert.assertTrue(LoginValidation.validateLoginInfo("huyle","123456",context))
    }

    @Test
    fun signUpTestFail() {
        Assert.assertFalse(LoginValidation.validateLoginInfo("huy","12345",context))
        Assert.assertFalse(LoginValidation.validateLoginInfo("uy","12345",context))
    }
}