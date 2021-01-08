package com.example.android.sampleappcallbacks.view.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.viewpager.widget.ViewPager
import com.example.android.sampleappcallbacks.R
import com.example.android.sampleappcallbacks.view.BaseActivity
import com.example.android.sampleappcallbacks.view.main.blankFragment.BlankFragment
import com.example.android.sampleappcallbacks.view.main.listViewFragment.ListViewFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : BaseActivity(), MainContract.View {

    private val presenter: MainContract.Presenter = MainPresenter(this)
    private val adapter: MainViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
    private var viewPagerMain: ViewPager? = null
    private var tabLayoutMain: TabLayout? = null

    override val layoutId: Int
        get() = R.layout.activity_main

    override fun onCreateBaseActivity() {
        viewPagerMain = findViewById<ViewPager>(R.id.viewPagerMain)
        tabLayoutMain = findViewById<TabLayout>(R.id.tabLayoutMain)
        var toolbarMain = findViewById<Toolbar>(R.id.toolbarMain)

        presenter.setupViewPager(adapter)

    }

    override fun showViewPager(adapter: MainViewPagerAdapter) {
        viewPagerMain!!.adapter = adapter

        tabLayoutMain!!.setupWithViewPager(viewPagerMain)
    }

}