package com.theinternational091.morphoflora

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.theinternational091.morphoflora.databinding.FragmentTitleBinding

class titleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentTitleBinding.inflate(inflater, container, false)

        binding.btnTumbuhan.setOnClickListener{
            it.findNavController()
                .navigate(R.id.action_titleFragment_to_tumbuhan)
        }
        binding.btnBunga.setOnClickListener{
            it.findNavController()
                .navigate(R.id.action_titleFragment_to_bunga)
        }

        return binding.root
    }
}