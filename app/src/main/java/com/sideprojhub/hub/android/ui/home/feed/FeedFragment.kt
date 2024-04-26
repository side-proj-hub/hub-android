package com.sideprojhub.hub.android.ui.home.feed

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.sideprojhub.hub.android.R
import com.sideprojhub.hub.android.databinding.FragmentFeedBinding
import com.sideprojhub.hub.android.ui.BaseFragment

class FeedFragment : BaseFragment<FragmentFeedBinding>(R.layout.fragment_feed) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.rvFeed.adapter = FeedAdapter(listOf())
        binding.rvFeed.layoutManager = LinearLayoutManager(requireContext())
        binding.rvFeed.setEmptyView(binding.rvEmpty.root)

        super.onViewCreated(view, savedInstanceState)
    }


}