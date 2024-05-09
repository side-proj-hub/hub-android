package com.sideprojhub.hub.android.ui.home.feed

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.sideprojhub.hub.android.R
import com.sideprojhub.hub.android.databinding.ItemUserCardBinding
import com.sideprojhub.hub.android.dto.Feed
import javax.inject.Inject

class UserListAdapter @Inject constructor(
    val glide: RequestManager,
    val data: List<Feed.ReactedPerson>
) :
    RecyclerView.Adapter<UserListAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: ItemUserCardBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind() {
            val userInfo = data[adapterPosition]
            binding.data = userInfo
            glide.load(userInfo.profile).error(R.drawable.ic_default_profile).circleCrop()
                .into(binding.ivProfile)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        DataBindingUtil.inflate<ItemUserCardBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_user_card,
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