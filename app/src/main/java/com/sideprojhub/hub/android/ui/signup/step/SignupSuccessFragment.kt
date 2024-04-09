package com.sideprojhub.hub.android.ui.signup.step

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.sideprojhub.hub.android.R
import com.sideprojhub.hub.android.databinding.FragmentSignupSuccessBinding
import com.sideprojhub.hub.android.ui.BaseFragment

class SignupSuccessFragment : BaseFragment<FragmentSignupSuccessBinding>(R.layout.fragment_signup_success) {

    private val viewmodel : SignupSuccessViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.vm = viewmodel
        super.onViewCreated(view, savedInstanceState)
    }

}