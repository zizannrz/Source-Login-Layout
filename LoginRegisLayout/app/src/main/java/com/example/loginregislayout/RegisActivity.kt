package com.example.loginregislayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginregislayout.databinding.ActivityRegisBinding

class RegisActivity : AppCompatActivity() {

    lateinit var binding: ActivityRegisBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_regis)

        binding.textToLogin.setOnClickListener {
            Intent(Intent(this, LoginActivity::class.java))
        }
    }
}