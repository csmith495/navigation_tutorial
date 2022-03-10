package com.example.navigationtutorial

import android.content.Context
import android.graphics.Typeface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat

class HomeFragment : Fragment() {

    private lateinit var homeTextView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        homeTextView = view.findViewById(R.id.homeTextView)

        homeTextView.typeface = context?.let { ResourcesCompat.getFont(it, R.font.cream_cake) }
        // Inflate the layout for this fragment
        return view
    }
}