package com.example.eclectics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.eclectics.adapters.OffensesListAdapter
import com.example.eclectics.databinding.FragmentUnpaidOffencesBinding
import com.example.eclectics.utils.ListUtils

class UnpaidOffencesFragment : Fragment() {

    private lateinit var binding: FragmentUnpaidOffencesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUnpaidOffencesBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpUI()
    }

    private fun setUpUI() {

        binding.rvUnpaidoffences.apply {
            setHasFixedSize(true)
            val adpter = OffensesListAdapter()
            adpter.submitList(ListUtils.offenseList())
            layoutManager = LinearLayoutManager(context)
            adapter = adpter
        }
    }

}