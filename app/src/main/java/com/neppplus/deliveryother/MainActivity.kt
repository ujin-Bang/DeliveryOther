package com.neppplus.deliveryother

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.deliveryother.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mvpa : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setValues()
        setupEvents()
    }


    fun setupEvents() {

    }

    fun setValues() {

        mvpa = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mvpa

        mainTabLayout.setupWithViewPager(mainViewPager)

    }

}