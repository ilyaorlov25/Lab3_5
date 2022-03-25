package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3.databinding.ThirdActivityBinding

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ThirdActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bnToFirst.setOnClickListener {
            setResult(1)
            finish()
        }

        binding.bnToSecond.setOnClickListener {
            setResult(2)
            finish()
        }

        binding.bnToAbout.setOnClickListener {
            onAbout()
        }
    }

    private fun onAbout() {
        val intent = Intent(this, AboutActivity::class.java)
        startActivity(intent)
    }
}