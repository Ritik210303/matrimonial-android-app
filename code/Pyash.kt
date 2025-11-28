package com.example.a21bsit046_casestudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Pyash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pyash)
        val yback=findViewById<Button>(R.id.btnyback)
        val yconnect=findViewById<Button>(R.id.btnyconnect)

        yback.setOnClickListener {
            startActivity(Intent(this,HomeScreen::class.java))
            finish()
        }
        yconnect.setOnClickListener {
            Toast.makeText(this, "You are now Connected", Toast.LENGTH_SHORT).show()

        }
    }
}
