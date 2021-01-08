package com.example.android.sampleappcallbacks.view.main.listViewFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.fragment.app.ListFragment
import com.example.android.sampleappcallbacks.R
import com.google.android.material.tabs.TabLayout

class ListViewFragment: Fragment() {

    private var callbacks: Callbacks? = null
    private var players: List<String>? = null

    interface Callbacks {
        fun add()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var listView: ListView? = null

        val players = arrayListOf<String>("LBJ", "Paul George", "Kawhi")

        val rootView = inflater.inflate(R.layout.fragment_list_view, null)

        val adapter = ListViewAdapter(players, activity!!)

        listView = rootView.findViewById<ListView>(R.id.players_list_view)

        listView.adapter = adapter

        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

    fun init(callbacks: Callbacks?) {
        this.callbacks = callbacks
        this.players = players


    }

}