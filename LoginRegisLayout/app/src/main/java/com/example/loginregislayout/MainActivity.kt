package com.example.loginregislayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginregislayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        binding.login.setOnClickListener {
            Intent(Intent(this, LoginActivity::class.java))
        }

        binding.regis.setOnClickListener {
            Intent(Intent(this, RegisActivity::class.java))
        }
    }
}