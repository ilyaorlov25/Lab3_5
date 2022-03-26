package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3.databinding.SecondActivityBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = SecondActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bnToFirst.setOnClickListener {
            finish()
        }

        binding.bnToThird.setOnClickListener {
            onThird()
        }

        binding.bnToAbout.setOnClickListener {
            onAbout()
        }
    }

    private fun onThird() {
        val intent = Intent(this, ThirdActivity::class.java)
        startActivity(intent)
    }

    private fun onAbout() {
        val intent = Intent(this, AboutActivity::class.java)
        startActivity(intent)
    }
}