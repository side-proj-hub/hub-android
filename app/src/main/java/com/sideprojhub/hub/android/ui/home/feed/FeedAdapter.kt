package com.sideprojhub.hub.android.ui.home.feed

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.sideprojhub.hub.android.R
import com.sideprojhub.hub.android.databinding.ItemFeedBinding

class FeedAdapter(val data: List<String>) : RecyclerView.Adapter<FeedAdapter.ViewHolder>() {



    inner class ViewHolder(val binding: ItemFeedBinding) : RecyclerView.ViewHolder(binding.root) {

        init {}

        fun bind() {

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        DataBindingUtil.inflate<ItemFeedBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_feed,
            parent,
            false
        ).let {
            ViewHolder(it)
        }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }
}