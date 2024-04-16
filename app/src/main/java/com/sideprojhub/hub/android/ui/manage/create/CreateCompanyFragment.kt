package com.sideprojhub.hub.android.ui.manage.create

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.sideprojhub.hub.android.R
import com.sideprojhub.hub.android.databinding.FragmentCreateCompanyBinding
import com.sideprojhub.hub.android.ui.BaseFragment


class CreateCompanyFragment : BaseFragment<FragmentCreateCompanyBinding>(R.layout.fragment_create_company) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_createCompanyFragment_to_createTeamFragment)
        }

        super.onViewCreated(view, savedInstanceState)
    }

}