package com.example.android.sampleappcallbacks.view.main

import androidx.viewpager.widget.ViewPager
import com.example.android.sampleappcallbacks.view.BasePresenter
import com.example.android.sampleappcallbacks.view.main.blankFragment.BlankFragment
import com.example.android.sampleappcallbacks.view.main.listViewFragment.ListViewFragment

class MainPresenter(val view: MainContract.View) : MainContract.Presenter {

    override fun start() {
    }

    override fun setupViewPager(adapter: MainViewPagerAdapter) {

        val listViewFragment: ListViewFragment = ListViewFragment()

        listViewFragment.init(object: ListViewFragment.Callbacks {
                    override fun add() {}

                })

        adapter.addFragment(BlankFragment(), "Blank Fragment")
        adapter.addFragment(listViewFragment, "List View Fragment")

        view.showViewPager(adapter)
    }
}