package com.example.a21bsit046_casestudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Pdarshan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdarshan)
        val dback=findViewById<Button>(R.id.btndback)
        val dconnect=findViewById<Button>(R.id.btndconnect)

        dback.setOnClickListener {
            startActivity(Intent(this,HomeScreen::class.java))
            finish()
        }
        dconnect.setOnClickListener {
            Toast.makeText(this, "You are now Connected", Toast.LENGTH_SHORT).show()

        }
    }
}
