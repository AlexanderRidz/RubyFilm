package com.ridzdev.rubyfilm.ui.favourite

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FavouriteRecyclerViewAdapter:
    RecyclerView.Adapter<FavouriteRecyclerViewAdapter.FavouriteViewHolder>() {

    inner class FavouriteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavouriteViewHolder {
        val view = TextView(parent.context)
        return FavouriteViewHolder(view)
    }

    override fun onBindViewHolder(holder: FavouriteViewHolder, position: Int) {
        (holder.itemView as TextView).text = "${position + 1}"
    }

    override fun getItemCount(): Int {
        return 100
    }
}