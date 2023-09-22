package com.example.sazakyanapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sazakyanapp.databinding.FragmentHondaBinding

class HondaFragment : Fragment() {

    private lateinit var Binding : FragmentHondaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Binding = FragmentHondaBinding.inflate(inflater, container, false)


        Binding.hondaOnly2.setOnClickListener {

            findNavController().navigate(HondaFragmentDirections.actionHondaFragment2ToHondaToToyotaFragment())

        }

        Binding.hondaOnly2.setOnClickListener {

            findNavController().navigate(HondaFragmentDirections.actionHondaFragment2ToHondaToToyotaFragment())

        }


        return Binding.root

    }

}