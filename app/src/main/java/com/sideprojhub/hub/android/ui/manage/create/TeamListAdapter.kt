package com.sideprojhub.hub.android.ui.manage.create

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.sideprojhub.hub.android.R
import com.sideprojhub.hub.android.databinding.ItemAddTeamBinding
import com.sideprojhub.hub.android.dto.Team

class TeamListAdapter : RecyclerView.Adapter<TeamListAdapter.ViewHolder>() {

    private val teamList = mutableListOf<Team.AddItem>()

    private lateinit var onItemCountListener: OnItemCountListener

    interface OnItemCountListener {
        fun onItemCountListener(count: Int)
    }

    fun setOnItemCountListener(listener: OnItemCountListener) {
        onItemCountListener = listener
    }


    inner class ViewHolder(private val binding: ItemAddTeamBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.btnDelete.setOnClickListener {
                val removedPosition = adapterPosition
                if (removedPosition == RecyclerView.NO_POSITION) return@setOnClickListener

                teamList.removeAt(removedPosition)
                notifyItemRemoved(removedPosition)
                onItemCountListener.onItemCountListener(itemCount)
            }
        }

        fun bind(teamName: String) {
            binding.team = teamName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        DataBindingUtil.inflate<ItemAddTeamBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_add_team,
            parent,
            false
        ).let {
            ViewHolder(it)
        }

    override fun getItemCount(): Int = teamList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(teamList[position].name)
    }

    fun addItem(teamName: String) {
        teamList.add(Team.AddItem(name = teamName))
        notifyItemInserted(itemCount - 1)
        onItemCountListener.onItemCountListener(itemCount)
    }

}