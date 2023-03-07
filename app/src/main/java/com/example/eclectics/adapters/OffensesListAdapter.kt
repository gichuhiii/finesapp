package com.example.eclectics.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.eclectics.databinding.DashboardItemBinding
import com.example.eclectics.model.Offense

class OffensesListAdapter : ListAdapter<Offense, OffensesListAdapter.OffensesViewHolder>(offensesDiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OffensesViewHolder {
        val binding = DashboardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return OffensesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OffensesViewHolder, position: Int) {
        val offense = getItem(position)
        holder.bind(offense)
    }

    inner class OffensesViewHolder(private val binding: DashboardItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(offense: Offense) {
            binding.apply {
                tvName.text = offense.name
                tvCarReg.text = offense.carReg
                tvOffence.text = offense.offenseName
                tvStatus.text = offense.paymentStatus
            }
        }
    }
}
    private val offensesDiffCallback =
    object : DiffUtil.ItemCallback<Offense>() {
        override fun areItemsTheSame(oldItem: Offense, newItem: Offense): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Offense, newItem: Offense): Boolean {
            return oldItem == newItem
        }
    }

