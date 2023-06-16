package com.zaimus.survey.activity.splash

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zaimus.survey.R

class Splash : AppCompatActivity() {
    lateinit var context: Context
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        context = this
    }
}