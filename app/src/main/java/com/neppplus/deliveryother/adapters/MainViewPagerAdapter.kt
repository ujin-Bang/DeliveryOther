package com.neppplus.deliveryother.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.deliveryother.fragments.MyProfilFragment
import com.neppplus.deliveryother.fragments.PizzaStoreListFragment

class MainViewPagerAdapter( fm: FragmentManager ) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {

        return 2

    }

    override fun getItem(position: Int): Fragment {

        return when( position ) {
            0 -> PizzaStoreListFragment()
            else -> MyProfilFragment()
        }

    }

}