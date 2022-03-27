package com.example.lab3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lab3.databinding.Fragment3Binding

class Fragment3 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = Fragment3Binding.inflate(layoutInflater)
        val navController = findNavController()
        binding.bnToFirst.setOnClickListener {
            navController.navigate(R.id.action_fragment32_to_fragment12)
        }
        binding.bnToSecond.setOnClickListener {
            navController.navigate(R.id.action_fragment32_to_fragment22)
        }
        return binding.root
    }
}