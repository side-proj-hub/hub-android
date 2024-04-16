package com.sideprojhub.hub.android.ui.join

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.sideprojhub.hub.android.R
import com.sideprojhub.hub.android.databinding.FragmentSelectOrganizationBinding
import com.sideprojhub.hub.android.ui.BaseFragment

class SelectOrganizationFragment : BaseFragment<FragmentSelectOrganizationBinding>(R.layout.fragment_select_organization) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.companyName = "회사이름"

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_selectOrganizationFragment_to_profileFragment)
        }

        super.onViewCreated(view, savedInstanceState)
    }

}