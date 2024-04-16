package com.sideprojhub.hub.android.ui.manage.create

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.sideprojhub.hub.android.R
import com.sideprojhub.hub.android.databinding.FragmentCreateTeamBinding
import com.sideprojhub.hub.android.ui.BaseFragment
import com.sideprojhub.hub.android.ui.home.HomeActivity

class CreateTeamFragment : BaseFragment<FragmentCreateTeamBinding>(R.layout.fragment_create_team) {

    private val teamListAdapter = TeamListAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.rv.adapter = teamListAdapter
        binding.rv.layoutManager = LinearLayoutManager(requireContext())
        binding.tvAdd = resources.getString(R.string.create_company_btn_next_team)

        binding.btnAdd.setOnClickListener {
            binding.etTeam.text?.let {
                if (it.isEmpty()) {
                    return@let
                }
                teamListAdapter.addItem(it.toString())
                it.clear()
            }
        }

        teamListAdapter.setOnItemCountListener(object : TeamListAdapter.OnItemCountListener {
            override fun onItemCountListener(count: Int) {
                binding.tvAdd = resources.getString(R.string.create_company_btn_next_team_n, count.toString())
            }
        })

        binding.btnNext.setOnClickListener {
            requireActivity().finish()

            val intent = Intent(requireActivity(), HomeActivity::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)
        }

        super.onViewCreated(view, savedInstanceState)
    }

}