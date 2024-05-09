package com.sideprojhub.hub.android.ui.home.feed

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.sideprojhub.hub.android.R
import com.sideprojhub.hub.android.databinding.ItemImageSliderBinding
import javax.inject.Inject

class FeedViewPagerAdapter @Inject constructor(
    val glide: RequestManager,
    val data: List<String>
) : RecyclerView.Adapter<FeedViewPagerAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemImageSliderBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {

        }

        fun bind() {
            glide.load(data[adapterPosition]).error(R.drawable.ic_default_profile).into(binding.ivImage)

//            binding.ivImage.post {
//                val layoutParams = binding.root.layoutParams
//                layoutParams.height = binding.ivImage.height
//                binding.root.layoutParams = layoutParams
//            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        DataBindingUtil.inflate<ItemImageSliderBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_image_slider,
            parent,
            false
        ).let {
            ViewHolder(it)
        }

    override fun getItemCount(): Int =data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

}