package com.example.hw_7_month_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_7_month_3.databinding.FragmentInfoCharacterBinding

class InfoCharacterFragment : Fragment() {

    private lateinit var binding: FragmentInfoCharacterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInfoCharacterBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val result: Character = arguments?.getSerializable("key") as Character
        binding.tvNameCharacter.text =result.name
        binding.ivInfoCharacter.setImageResource(result.image)
        binding.tvStatusCharacter.text = result.status
    }
}