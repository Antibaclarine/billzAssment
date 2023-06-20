package dev.clarine.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import dev.clarine.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//validation of the form
 binding.btnRegister.setOnClickListener {
     val username=binding.etName.text.toString()
     val  phonenumber=binding.etPassword.text.toString()
     val email=binding.etEmail.text.toString()
     val password=binding.etPassword.text.toString()
//     validate input fields
     if (username.isEmpty()|| phonenumber.isEmpty()||email.isEmpty()){
         Toast.makeText(this,"please fill in all the fields",Toast.LENGTH_SHORT).show()
     }
     else{
//         navigating to MainActivity2
         startActivity(Intent(this,MainActivity2::class.java))
         finish()
     }
 }

    }
        }















