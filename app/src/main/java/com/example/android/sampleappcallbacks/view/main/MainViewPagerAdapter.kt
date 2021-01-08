package com.example.android.sampleappcallbacks.view.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MainViewPagerAdapter : FragmentPagerAdapter {

    private final var fragmentList: ArrayList<Fragment> = ArrayList()
    private final var fragmentTitleList: ArrayList<String> = ArrayList()

    public constructor(supportFragmentManager: FragmentManager)
            :super(supportFragmentManager)

    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getItem(position: Int): Fragment {
        return fragmentList.get(position)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentTitleList.get(position)
    }

    fun addFragment(fragment: Fragment, title: String) {
        fragmentList.add(fragment)
        fragmentTitleList.add(title)
    }
}