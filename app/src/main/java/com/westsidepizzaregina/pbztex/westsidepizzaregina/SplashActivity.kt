package com.westsidepizzaregina.pbztex.westsidepizzaregina

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    private var TIME: Long = 500
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        //Initialize the Handler
        Handler().postDelayed({
            val intent: Intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, TIME)
    }
}
