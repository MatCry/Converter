package com.example.theconverter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_weight).setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSpeedFragment()
            findNavController().navigate(action)
        }

        view.findViewById<Button>(R.id.button_temperature).setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToTemperatureFragment()
            findNavController().navigate(action)
        }


        view.findViewById<Button>(R.id.button_distance).setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToDistanceFragment()
            findNavController().navigate(action)
        }

    }

}
