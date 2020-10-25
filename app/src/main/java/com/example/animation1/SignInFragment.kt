package com.example.animation1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_signin.*
import kotlinx.android.synthetic.main.fragment_signin.view.*

class SignInFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater . inflate (R.layout.fragment_signin, container, false)

        val signup = view.findViewById<TextView>(R.id.signup);
        signup.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_signInFragment_to_signUpFragment);
        })

        val forgotPass = view.findViewById<TextView>(R.id.forgotPass);
        forgotPass.setOnClickListener(View.OnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_signInFragment_to_forgotPassword);
        })
        return view;
    }

}