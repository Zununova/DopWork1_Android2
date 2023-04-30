package com.example.dopwork1_android2.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.dopwork1_android2.R
import com.example.dopwork1_android2.databinding.FragmentHomeBinding
import com.example.dopwork1_android2.ui.setBackStackData

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpListener()
    }

    private fun setUpListener() {
        binding.buttonAddText.setOnClickListener {
            val inputText = binding.editTextInputText.text.toString()
            setBackStackData("key", inputText, true)
            findNavController().navigateUp()
        }
    }
}





