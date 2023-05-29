package com.theinternational091.morphoflora

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.theinternational091.morphoflora.databinding.FragmentBungaBinding
import com.theinternational091.morphoflora.databinding.FragmentTumbuhanBinding

class bunga : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentBungaBinding.inflate(inflater, container, false)

        binding.btnKelopak.setOnClickListener{
            it.findNavController()
                .navigate(R.id.action_bunga_to_kelopak)
        }

        binding.btnPutik.setOnClickListener{
            it.findNavController()
                .navigate(R.id.action_bunga_to_putik)
        }

        binding.btnTangkai.setOnClickListener{
            it.findNavController()
                .navigate(R.id.action_bunga_to_tangkai)
        }
        return binding.root
    }
}