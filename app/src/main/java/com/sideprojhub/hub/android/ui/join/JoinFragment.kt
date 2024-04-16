package com.sideprojhub.hub.android.ui.join

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.sideprojhub.hub.android.R
import com.sideprojhub.hub.android.databinding.FragmentJoinBinding
import com.sideprojhub.hub.android.ui.BaseFragment


class JoinFragment : BaseFragment<FragmentJoinBinding>(R.layout.fragment_join) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_joinFragment_to_selectOrganizationFragment)
        }

        super.onViewCreated(view, savedInstanceState)
    }

}