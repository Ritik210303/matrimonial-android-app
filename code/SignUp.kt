package com.example.a21bsit046_casestudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val ssingup=findViewById<Button>(R.id.btnlsingup2)
        val name=findViewById<EditText>(R.id.txtid)
        val upass=findViewById<EditText>(R.id.txtpass)
        val db:MyDBHelper= MyDBHelper(applicationContext)

        val fname=findViewById<EditText>(R.id.txtfname)
        val add=findViewById<EditText>(R.id.txtaddress)
        val dob=findViewById<EditText>(R.id.txtdob)
        val male=findViewById<RadioButton>(R.id.rmale)
        val female=findViewById<RadioButton>(R.id.rfemale)

        ssingup.setOnClickListener {
            if(!name.text.isEmpty() && !upass.text.isEmpty())
            {
                val res= db.insert(name.text.toString(),upass.text.toString())
                if(res==-1.toLong())
                {
                    Toast.makeText(this, "Cannot Create Account", Toast.LENGTH_SHORT).show()
                }
                else
                {
                    var gender:String
                    if(male.isChecked)
                    {
                        gender="male"
                    }
                    else
                    {
                        gender="female"
                    }
                    var details:String="Fname: "+fname.text.toString() +" Address: "+add.text.toString()+" DOB: "+dob.text.toString()+" Gender: "+gender
                    Toast.makeText(this, "Account Created Successfully"+details, Toast.LENGTH_LONG).show()
                    startActivity(Intent(this,MainActivity::class.java))
                    finish()
                }

            }
            else
            {
                Toast.makeText(this, "Cannot insert null data", Toast.LENGTH_SHORT).show()
            }

        }
    }
}
