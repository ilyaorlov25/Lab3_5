package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3.databinding.FirstActivityBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = FirstActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bnToSecond.setOnClickListener{
            onSecond()
        }

        binding.bnToAbout.setOnClickListener {
            onAbout()
        }
    }

    private fun onSecond() {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    private fun onAbout() {
        val intent = Intent(this, AboutActivity::class.java)
        startActivity(intent)
    }
}