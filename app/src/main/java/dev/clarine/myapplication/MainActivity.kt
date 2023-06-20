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
        setContentView(R.layout.activity_main)
        errorMessage()
    }
    fun errorMessage() {
        binding.etName.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.etName.error = null
            }

            override fun afterTextChanged(s: Editable?) {
                TODO("Not yet implemented")
            }
        })
        binding.etEmail.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilEmail.error = null
            }

            override fun afterTextChanged(s: Editable?) {
                TODO("Not yet implemented")
            }
        })
        binding.etphonenumber.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilPhoneNumber.error = null
            }

            override fun afterTextChanged(s: Editable?) {
                TODO("Not yet implemented")
            }
        })
        binding.etPassword.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilPassword.error = null
            }

            override fun afterTextChanged(s: Editable?) {
                TODO("Not yet implemented")
            }
        })

    }
    override fun onResume() {
        super.onResume()
//           binding .castviews()
        binding.btnLogIn.setOnClickListener {
            val intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }


        fun validateLogIn(){
            val firstName=binding.etName.text.toString()
            val lastName=binding.etEmail.text.toString()
            val email=binding.etPassword.text.toString()
            val password=binding.etPassword.text.toString()
            val passwordConfirmation=binding.etPassword.text.toString()
            var error=false
            if (firstName.isBlank()){
                binding.tilName.error=" Name is required"
            }
            if (lastName.isBlank()){
                binding.tilEmail.error="email Name is required"
                error=true
            }
            if (email.isBlank()){
                binding.tilPhoneNumber.error="phoneNumber is required"
                error=true
            }
            if (password.isBlank()){
                binding.tilPassword.error="password is required"
                error=true
            }


            if (!error){
                Toast.makeText(this,"$firstName $lastName $email",Toast.LENGTH_LONG)
                    .show()
            }
        }
    }



}










