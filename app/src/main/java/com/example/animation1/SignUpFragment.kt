package com.example.animation1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation

class SignUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sign_up, container, false)
        val signIn = view.findViewById<TextView>(R.id.signIn)

        signIn.setOnClickListener (  View.OnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_signUpFragment_to_signInFragment);
        }  )

        return view ;
    }
}