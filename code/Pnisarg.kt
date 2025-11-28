package com.example.a21bsit046_casestudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Pnisarg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pnisarg)
        val nback=findViewById<Button>(R.id.btnnback)
        val nconnect=findViewById<Button>(R.id.btnnconnect)

        nback.setOnClickListener {
            startActivity(Intent(this,HomeScreen::class.java))
            finish()
        }
        nconnect.setOnClickListener {
            Toast.makeText(this, "You are now Connected", Toast.LENGTH_SHORT).show()

        }
    }
}
