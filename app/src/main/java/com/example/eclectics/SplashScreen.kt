package com.example.eclectics

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SplashScreen: AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            supportActionBar?.hide()
            setContentView(R.layout.activity_splash)
            val splash = findViewById<android.widget.ImageView>(R.id.iv_splash)
            splash.alpha = 0f
            splash.animate().setDuration(2000).alpha(1f).withEndAction {
                val Intent = Intent(this, MainActivity::class.java)
                startActivity(Intent)
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
                finish()
            }

        }
}