package com.theinternational091.morphoflora

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.theinternational091.morphoflora.databinding.FragmentTitleBinding
import com.theinternational091.morphoflora.databinding.FragmentTumbuhanBinding

class tumbuhan : Fragment() {

    private  var _binding: FragmentTumbuhanBinding? = null
    private val binding get() = _binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = FragmentTumbuhanBinding.inflate(inflater, container, false)

        binding.Daun.setOnClickListener{
            it.findNavController()
                .navigate(R.id.action_tumbuhan_to_daun)
        }

        binding.Batang.setOnClickListener{
            it.findNavController()
                .navigate(R.id.action_tumbuhan_to_batang)
        }

        binding.Akar.setOnClickListener{
            it.findNavController()
                .navigate(R.id.action_tumbuhan_to_akar)
        }
    return binding.root
    }
}