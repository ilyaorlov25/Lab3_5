package com.example.lab3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.lab3.databinding.FirstActivityBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = FirstActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = (supportFragmentManager.findFragmentById(R.id.nav_host_fragment)
                as NavHostFragment).navController

        binding.drawerNavView.setupWithNavController(navController)

        binding.bnToAbout.setOnClickListener {
            navController.navigate(R.id.action_global_aboutActivity)
        }
    }
}