package com.alex.loginui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.alex.loginui.databinding.FragmentIntroBinding


class IntroFragment : Fragment() {

    private lateinit var binding: FragmentIntroBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_intro, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentIntroBinding.bind(view)

        binding.btnNextIntro.setOnClickListener {
            findNavController().navigate(R.id.action_introFragment_to_loginFragment)
        }

    }

}