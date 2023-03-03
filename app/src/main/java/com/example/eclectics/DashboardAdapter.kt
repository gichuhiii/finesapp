package com.example.eclectics

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.eclectics.databinding.FragmentPaidOffencesBinding

class DashboardAdapter : ListAdapter <PaidOffencesFragment,DashboardAdapter.PaidOffenceViewHolder>(DiffCallBack()){
    //data

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaidOffenceViewHolder {
        val binding = FragmentPaidOffencesBinding.inflate(LayoutInflater.from(parent.context))
        return PaidOffenceViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PaidOffenceViewHolder, position: Int) {
    val paidOffence = getItem(position)
        holder.bind(paidOffence)
    }
    class PaidOffenceViewHolder(private val binding: FragmentPaidOffencesBinding ) : RecyclerView.ViewHolder(binding.root){

        fun bind(paidoffence: PaidOffencesFragment){
            binding.apply {
                rvPaidoffences
            }
        }
    }


    class DiffCallBack : DiffUtil.ItemCallback<PaidOffencesFragment>(){
        override fun areItemsTheSame(
            oldItem: PaidOffencesFragment,
            newItem: PaidOffencesFragment
        ) = oldItem.id == newItem.id

        override fun areContentsTheSame(
            oldItem: PaidOffencesFragment,
            newItem: PaidOffencesFragment
        ) = oldItem == newItem

    }
}