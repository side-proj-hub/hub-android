package com.sideprojhub.hub.android.ui.signup.step

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.sideprojhub.hub.android.R
import com.sideprojhub.hub.android.databinding.FragmentSignupAccountBinding
import com.sideprojhub.hub.android.databinding.FragmentSignupPrivacyBinding
import com.sideprojhub.hub.android.ui.BaseFragment


class SignupAccountFragment :
    BaseFragment<FragmentSignupAccountBinding>(R.layout.fragment_signup_account) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_signupAccountFragment_to_signupPrivacyFragment)
        }

        super.onViewCreated(view, savedInstanceState)
    }

}