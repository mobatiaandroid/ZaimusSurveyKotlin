package com.zaimus.survey.activity.login

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zaimus.survey.R

class Login : AppCompatActivity() {
    lateinit var context: Context
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        context = this
    }
}