package com.vusile.myapplication.mountains

import android.content.ContentValues.TAG
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.vusile.myapplication.R

class MountainsRecyclerViewAdapter(private val mountainsList: List<Mountain>) :
        RecyclerView.Adapter<MountainsRecyclerViewAdapter.MountainsViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): MountainsViewHolder {
        Log.d(TAG, "onCreateMountainsViewHolder: ")
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.a_mountain, viewGroup, false)
        return MountainsViewHolder(view)
    }

    override fun onBindViewHolder(mountainsViewHolder: MountainsViewHolder, position: Int) {
        mountainsViewHolder.mountainName.text = mountainsList[position].name
        mountainsViewHolder.mountainImage.setImageResource(mountainsList[position].image!!)
        mountainsViewHolder.mountainDescription.text = mountainsList[position].description
    }

    override fun getItemCount() = mountainsList.size

    class MountainsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var mountainName: TextView = itemView.findViewById(R.id.mountain_title)
        internal var mountainImage: ImageView = itemView.findViewById(R.id.mountain_image)
        internal var mountainDescription: TextView = itemView.findViewById(R.id.mountain_description)
    }
}