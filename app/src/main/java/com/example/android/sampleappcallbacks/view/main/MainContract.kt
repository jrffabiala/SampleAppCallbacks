package com.example.android.sampleappcallbacks.view.main

import androidx.viewpager.widget.ViewPager
import com.example.android.sampleappcallbacks.view.BasePresenter

interface MainContract {
    interface View {
        fun showViewPager(adapter: MainViewPagerAdapter)
    }

    interface Presenter : BasePresenter {
        fun setupViewPager(adapter: MainViewPagerAdapter)
    }
}