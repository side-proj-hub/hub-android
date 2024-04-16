package com.sideprojhub.hub.android.ui.join

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.sideprojhub.hub.android.R
import com.sideprojhub.hub.android.databinding.FragmentProfileBinding
import com.sideprojhub.hub.android.ui.BaseFragment
import com.sideprojhub.hub.android.ui.home.HomeActivity


class ProfileFragment : BaseFragment<FragmentProfileBinding>(R.layout.fragment_profile) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnNext.setOnClickListener {
            requireActivity().finish()

            val intent = Intent(requireActivity(), HomeActivity::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)
        }

        super.onViewCreated(view, savedInstanceState)
    }
}