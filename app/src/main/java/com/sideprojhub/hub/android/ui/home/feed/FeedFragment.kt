package com.sideprojhub.hub.android.ui.home.feed

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.RequestManager
import com.sideprojhub.hub.android.R
import com.sideprojhub.hub.android.databinding.FragmentFeedBinding
import com.sideprojhub.hub.android.dto.Feed
import com.sideprojhub.hub.android.dto.feed
import com.sideprojhub.hub.android.ui.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class FeedFragment : BaseFragment<FragmentFeedBinding>(R.layout.fragment_feed) {

    @Inject
    lateinit var glide: RequestManager
    lateinit var feedAdapter: FeedListAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.rvFeed.adapter = FeedListAdapter(glide, feed, requireContext())
        binding.rvFeed.layoutManager = LinearLayoutManager(requireContext())
        binding.rvFeed.setEmptyView(binding.rvEmpty.root)

        feedAdapter = binding.rvFeed.adapter as FeedListAdapter

        feedAdapter.setOnClickListener(object : FeedListAdapter.OnClickListener {
            override fun setCommentingClickListener() {
                toast("댓글 달기 클릭")
            }

            override fun setMoreCommentClickListener() {
                toast("댓글 더보기 클릭")
            }

            override fun setMoreTagClickListener(data: List<Feed.ReactedPerson>) {
                val modalBottomSheet = FeedModalBottomSheet(glide, FeedModalBottomSheet.Companion.Type.Tagged, data)
                modalBottomSheet.show(parentFragmentManager, FeedModalBottomSheet.TAG)
            }

            override fun setMoreFavoriteClickListener(data: List<Feed.ReactedPerson>) {
                toast("좋아요 누른 사람 보기")

                val modalBottomSheet = FeedModalBottomSheet(glide, FeedModalBottomSheet.Companion.Type.Favorites, data)
                modalBottomSheet.show(parentFragmentManager, FeedModalBottomSheet.TAG)
            }

            override fun setAddFavoriteClickListener() {
                toast("좋아요 클릭")
            }

        })


        super.onViewCreated(view, savedInstanceState)
    }


}