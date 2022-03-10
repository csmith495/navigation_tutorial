package com.example.navigationtutorial

import android.graphics.Typeface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.navigation.fragment.findNavController

class ChartFragment : Fragment() {

    private lateinit var chartTextView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view: View = inflater.inflate(R.layout.fragment_chart, container, false)

        chartTextView = view.findViewById(R.id.chartTextView)

        chartTextView.typeface = context?.let { ResourcesCompat.getFont(it, R.font.hello) }
        // Inflate the layout for this fragment
        return view
    }
}