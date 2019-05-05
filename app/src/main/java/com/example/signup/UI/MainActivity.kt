package com.example.signup.UI

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.signup.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.mainFrame, LoginFragment()).commit()
    }

    fun changeFragment(fragment: Fragment) {
        val ts = supportFragmentManager.beginTransaction()
        ts.apply {
            replace(R.id.mainFrame, fragment)
            commit()
            addToBackStack(null)
        }
    }
}
