package com.sideprojhub.hub.android.ui.home.feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.StringRes
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.RequestManager
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.sideprojhub.hub.android.R
import com.sideprojhub.hub.android.databinding.FragmentBtsheetUserListBinding
import com.sideprojhub.hub.android.dto.Feed
import javax.inject.Inject

class FeedModalBottomSheet @Inject constructor (
    val glide: RequestManager,
    val type: Type, val data: List<Feed.ReactedPerson>) :
    BottomSheetDialogFragment() {
    private lateinit var binding: FragmentBtsheetUserListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_btsheet_user_list, container, false)

        binding.title = resources.getString(type.title)
        binding.tvContents.text = resources.getString(type.contents, data.size)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = UserListAdapter(glide, data)
        binding.rvList.layoutManager = LinearLayoutManager(requireContext())
        binding.rvList.adapter = adapter
    }

    companion object {
        const val TAG = "FeedModalBottomSheet"

        enum class Type(@StringRes val title: Int, @StringRes val contents: Int) {
            Tagged(R.string.feed_item_tagged_title, R.string.feed_item_tagged_count),
            Favorites(R.string.feed_item_favorite_title, R.string.feed_item_favorite_count)
        }
    }

}