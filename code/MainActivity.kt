package com.example.a21bsit046_casestudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val signup=findViewById<Button>(R.id.btnlsingup)
        val lid=findViewById<EditText>(R.id.txtlid)
        val lpass=findViewById<EditText>(R.id.txtlpass)
        val login=findViewById<Button>(R.id.btnlogin)
        val db:MyDBHelper= MyDBHelper(applicationContext)
        login.setOnClickListener {
            if(!lid.text.isEmpty() && !lpass.text.isEmpty())
            {
                var check = db.login(lid.text.toString(),lpass.text.toString())
                if(check)
                {
                    Toast.makeText(this, "Login Successfull", Toast.LENGTH_SHORT).show()
//                    Toast.makeText(this, "Account Created", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this,HomeScreen::class.java))
                    finish()
                }
                else
                {
                    Toast.makeText(this, "Invalid Credentail", Toast.LENGTH_SHORT).show()
                }
            }
        }

        signup.setOnClickListener {
            startActivity(Intent(this,SignUp::class.java))
       }

    }
}
