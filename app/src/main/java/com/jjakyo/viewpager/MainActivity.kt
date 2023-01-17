package com.jjakyo.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.jjakyo.viewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var vpAdapter: FragmentStateAdapter
    lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        viewPager = binding.viewPager

        val fragmentData : ArrayList<SampleData> = arrayListOf<SampleData>(
            SampleData("타이틀1", "콘텐츠1"),
            SampleData("타이틀2", "콘텐츠2"),
            SampleData("타이틀3", "콘텐츠3")
        )

        // Adapter
        vpAdapter = ViewPagerAdapter(this, fragmentData)

        viewPager.adapter = vpAdapter

        // ViewPager setting
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        setContentView(binding.root)
    }
}