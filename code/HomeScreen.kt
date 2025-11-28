package com.example.a21bsit046_casestudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class HomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)
        val imgnisu=findViewById<ImageButton>(R.id.img1)
        val imgsahil=findViewById<ImageButton>(R.id.img2)
        val imgyash=findViewById<ImageButton>(R.id.img3)
        val imgdarshan=findViewById<ImageButton>(R.id.img4)

        imgnisu.setOnClickListener {
            startActivity(Intent(this,Pnisarg::class.java))
            finish()
        }

        imgsahil.setOnClickListener {
            startActivity(Intent(this,Psahil::class.java))
            finish()
        }

        imgyash.setOnClickListener {
            startActivity(Intent(this,Pyash::class.java))
            finish()
        }

        imgdarshan.setOnClickListener {
            startActivity(Intent(this,Pdarshan::class.java))
            finish()
        }
    }
}
