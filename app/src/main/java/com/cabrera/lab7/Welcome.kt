package com.cabrera.lab7

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.cabrera.lab7.databinding.FragmentWelcomeBinding
import com.cabrera.lab7.MyApplication.Companion.username

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Welcome : Fragment() {

    private var _binding: FragmentWelcomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textView2.text = "¡Hola $username, necesitamos que actualices tu perfil!"

        binding.ButtonToProfile.setOnClickListener {
            findNavController().navigate(R.id.action_welcome_to_my_Profile)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}