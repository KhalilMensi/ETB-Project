package com.example.animation1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_sign_up.*

class SignUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sign_up, container, false)
        val signIn = view.findViewById<TextView>(R.id.signIn)
        val signUp = view.findViewById<Button>(R.id.signUpBtn);
        signUp.setOnClickListener(View.OnClickListener {
            if(userName.text.isEmpty()){
                userName.error = "Invalid userName !";
                userName.isFocused
            } else if(userEmail.text.isEmpty()){
                userEmail.error = "Invalid Email";
                userEmail.isFocused
            } else if(userPassword.text.isEmpty() || !userPassword.text.isEmpty() && userRePassword.text != userPassword.text){
                userPassword.error = "Invalid Password"
                userPassword.isFocused
                userRePassword.error = "Invalid Password"
                userRePassword.isFocused
            }
        })
        signIn.setOnClickListener (  View.OnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_signUpFragment_to_signInFragment);
        }  )

        return view ;
    }
}