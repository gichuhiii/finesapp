package com.example.eclectics

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.eclectics.databinding.ActivityDashboardBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class Dashboard : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        setUpUI()
    }

    private fun setUpUI(){

        val adapter = OffencesPageAdapter(supportFragmentManager,lifecycle).apply {
            addFragment(PaidOffencesFragment())
            addFragment(UnpaidOffencesFragment())
        }

        binding.offencesviewpager.adapter = adapter

        TabLayoutMediator(binding.offencestablayout, binding.offencesviewpager) { tab, position ->    tab.text = adapter.getItemViewType(position).toString()
            if (position == 0) {
                tab.text = "Paid Offenses"
                tab.view.background =
                    resources.getDrawable(R.color.tabs)
            }
            if (position == 1) {
                tab.text =  " Unpaid Offenses"
                tab.view.setBackgroundColor(Color.TRANSPARENT)
            }
        }.attach()

        binding.offencestablayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            @SuppressLint("ResourceAsColor")
            override fun onTabSelected(tab: TabLayout.Tab) {
                tab.view.setBackgroundColor(R.color.tabs)
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {
                tab.view.setBackgroundColor(Color.TRANSPARENT)
            }

            override fun onTabReselected(tab: TabLayout.Tab) {}
        })

    }
}
