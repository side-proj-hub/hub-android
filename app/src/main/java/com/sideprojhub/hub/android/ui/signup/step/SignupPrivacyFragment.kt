package com.sideprojhub.hub.android.ui.signup.step

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.sideprojhub.hub.android.R
import com.sideprojhub.hub.android.databinding.FragmentSignupPrivacyBinding
import com.sideprojhub.hub.android.ui.BaseFragment


class SignupPrivacyFragment :
    BaseFragment<FragmentSignupPrivacyBinding>(R.layout.fragment_signup_privacy) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val btAgreeDialog = BTSheetAgreeDialogFragment()


        // 버튼 클릭 이벤트를 설정합니다.
        binding.btnNext.setOnClickListener {
            btAgreeDialog.setBottomSheetListener(object : BTSheetAgreeDialogFragment.BottomSheetListener {
                override fun onButtonClicked() {
                    Toast.makeText(requireContext(), "동의 완료!", Toast.LENGTH_SHORT).show()
                    findNavController().navigate(R.id.action_signupPrivacyFragment_to_signupSuccessFragment)
                }

            })
            btAgreeDialog.show(
                requireActivity().supportFragmentManager,
                BTSheetAgreeDialogFragment.TAG
            )
        }

        super.onViewCreated(view, savedInstanceState)
//            findNavController().navigate(R.id.action_signupPrivacyFragment_to_signupSuccessFragment)
    }

}