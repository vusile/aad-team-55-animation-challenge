package com.vusile.myapplication.animals

import android.content.ContentValues.TAG
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.vusile.myapplication.R

class AnimalsRecyclerViewAdapter(private val myDataset: List<Animal>) :
        RecyclerView.Adapter<AnimalsRecyclerViewAdapter.AnimalsViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): AnimalsViewHolder {
        Log.d(TAG, "onCreateAnimalsViewHolder: ")
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.an_animal, viewGroup, false)
        return AnimalsViewHolder(view)
    }

    override fun onBindViewHolder(animalsViewHolder: AnimalsViewHolder, position: Int) {
        animalsViewHolder.animalName.text = myDataset[position].name
        animalsViewHolder.animalImage.setImageResource(myDataset[position].imageName!!)
        animalsViewHolder.animalDescription.text = myDataset[position].description
    }

    override fun getItemCount() = myDataset.size

    class AnimalsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var animalName: TextView = itemView.findViewById(R.id.animal_title)
        internal var animalImage: ImageView = itemView.findViewById(R.id.animal_image)
        internal var animalDescription: TextView = itemView.findViewById(R.id.animal_description)
    }
}