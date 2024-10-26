package com.example.loginimc

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity: AppCompatActivity(){


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val emailInput = findViewById<EditText>(R.id.emailInput)
        val passInput = findViewById<EditText>(R.id.passInput)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val recordPass = findViewById<TextView>(R.id.recordpass)
// boton login
        btnLogin.setOnClickListener{

            val email = emailInput.text.toString().trim()
            val pass  = passInput.text.toString().trim()

            if ( email.isEmpty() || pass.isEmpty()){
                Toast.makeText( this,"Por favor ingrese email y password ", Toast.LENGTH_SHORT).show()
            } else {
                if ( email == "admin@gmail.com" && pass == "123") {
                    Toast.makeText( this," Bienvenido a IMC ", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,MainActivity::class.java) //direccionar
                    startActivity(intent)
                    finish()
            } else{
                Toast.makeText( this,"Email o password incorrecto ", Toast.LENGTH_SHORT).show()
                }
            }
        }
        recordPass.setOnClickListener{
            val intent = Intent(this,RecordarPass::class.java) //direccionar
            startActivity(intent)
        }

        }
    }


