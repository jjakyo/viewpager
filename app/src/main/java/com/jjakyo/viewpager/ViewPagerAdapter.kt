package com.jjakyo.viewpager

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(
    fragment: FragmentActivity,
    data: ArrayList<SampleData>
) : FragmentStateAdapter(fragment) {

    var dataSet: ArrayList<SampleData> = data

    override fun getItemCount(): Int = dataSet.size

    override fun createFragment(position: Int): Fragment {
        return SampleFragment.newInstance(dataSet[position])
    }
}