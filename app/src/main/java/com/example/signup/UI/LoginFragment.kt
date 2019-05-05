package com.example.signup.UI

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.signup.R
import com.example.signup.Util.LoginValidation
import com.example.signup.Util.SignUpHelper
import kotlinx.android.synthetic.main.login_layout.*

class LoginFragment:Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.login_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnLogin.setOnClickListener {
            Log.d(TAG, "btnLogin onClick name:${txtName.text} pwd:${txtPwd.text}")
            if (LoginValidation.validateLoginInfo(txtName.text.toString(), txtPwd.text.toString(), context)) {
                val act = this.activity as MainActivity
                act.changeFragment(MainContentFragment())
            } else {
                Toast.makeText(this.context, "INVALID LOGIN INFO", Toast.LENGTH_LONG).show()
            }
        }
        btnSignUp.setOnClickListener {
            Log.d(TAG, "btnSignUp onClick")
            if (SignUpHelper.SignUp(txtName.text.toString(), txtPwd.text.toString(), context)) {
                Toast.makeText(this.context, "SIGN IN INFO SAVED", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this.context, "INVALID SIGN IN INFO", Toast.LENGTH_LONG).show()
            }
        }
    }

    companion object {
        private const val TAG = "TestApp-LoginFragment"
    }
}