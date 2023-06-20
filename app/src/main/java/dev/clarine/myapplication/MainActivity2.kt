package dev.clarine.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dev.clarine.myapplication.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLogin.setOnClickListener {
            val usernameOrEmail=binding.etUserName.text.toString()
            val password=binding.etPasswords.text.toString()
//            validate   input fields
            if (usernameOrEmail.isEmpty()||password.isEmpty()){
                Toast.makeText(this,"Please fill in all fields",Toast.LENGTH_SHORT).show()
            }
            else {
                startActivity(Intent(this,MainActivity::class.java))
                finish()
            }
        }
    }
}