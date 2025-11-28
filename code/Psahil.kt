package com.example.a21bsit046_casestudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Psahil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_psahil)
        val sback=findViewById<Button>(R.id.btnsback)
        val sconnect=findViewById<Button>(R.id.btnsconnect)

        sback.setOnClickListener {
            startActivity(Intent(this,HomeScreen::class.java))
            finish()
        }
        sconnect.setOnClickListener {
            Toast.makeText(this, "You are now Connected", Toast.LENGTH_SHORT).show()

        }
    }
}
