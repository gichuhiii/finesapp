package com.example.eclectics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val loginbutton = findViewById<Button>(R.id.loginbutton)
        loginbutton.setOnClickListener{
            val Intent = Intent(this, Dashboard::class.java)
            startActivity(Intent)
        }
    }
}