package com.example.android.sampleappcallbacks.view.main.listViewFragment

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.android.sampleappcallbacks.R
import java.util.*

class ListViewAdapter(items: ArrayList<String>, ctx: Context) :
    ArrayAdapter<String>(ctx, R.layout.list_item, items) {

    private class ItemViewHolder {

        internal var playerName: TextView? = null
    }

    override fun getView(i: Int, view: View?, viewGroup: ViewGroup): View {
        var view = view

        val viewHolder: ItemViewHolder

        if (view == null) {
            val inflater = LayoutInflater.from(context)
            view = inflater.inflate(R.layout.list_item, viewGroup, false)

            viewHolder = ItemViewHolder()
            viewHolder.playerName = view!!.findViewById<View>(R.id.playerName) as TextView

        } else {
            viewHolder = view.tag as ItemViewHolder
        }

        val player = getItem(i)
        viewHolder.playerName!!.text = player

        view.tag = viewHolder

        return view
    }
}