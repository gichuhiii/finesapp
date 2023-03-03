package com.example.eclectics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.eclectics.adapters.OffensesListAdapter
import com.example.eclectics.databinding.FragmentPaidOffencesBinding
import com.example.eclectics.utils.ListUtils

//
//class PaidOffencesFragment : Fragment() {
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_paid_offences, container, false)
//    }
//
//}

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [UnpaidOffencesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PaidOffencesFragment : Fragment() {

    private lateinit var binding: FragmentPaidOffencesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPaidOffencesBinding.inflate(inflater, container, false)
       return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpUI()
    }

    private fun setUpUI() {

        binding.rvPaidoffences.apply {
            setHasFixedSize(true)
            val adpt = OffensesListAdapter()
            adpt.submitList(ListUtils.offenseList())
            layoutManager = LinearLayoutManager(context)
            adapter = adpt
        }

    }

}