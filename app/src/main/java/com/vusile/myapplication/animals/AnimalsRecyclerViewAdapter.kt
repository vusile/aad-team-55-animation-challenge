package com.vusile.myapplication.animals

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class AnimalsRecyclerViewAdapter(private val myDataset: List<Animal>) :
        RecyclerView.Adapter<AnimalsRecyclerViewAdapter.MyViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view)


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MyViewHolder {
        // create a new view
        /*val textView = LayoutInflater.from(parent.context)
                .inflate(R.layout.my_text_view, parent, false) as TextView*/

        val view = LayoutInflater.from(parent.context)
                .inflate(com.vusile.myapplication.R.layout.an_animal, parent, false) as View

//        val textView = LayoutInflater.from(parent.context)
//                .inflate(R.layout.my_text_view, parent, false) as TextView

        // set the view's size, margins, paddings and layout parameters
        return MyViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        //holder.textView.text = myDataset[position]

        //holder. = myDataset[position]


//        holder.itemView = myDataset[position]
//        holder.mImageView.setImageURI(mValues.get(position).uri)
//        holder.mDateView.setText(mValues.get(position).date)
//
//        holder.mView.setOnClickListener(View.OnClickListener {
//            if (null != mListener) {
//                // Notify the active callbacks interface (the activity, if the
//                // fragment is attached to one) that an item has been selected.
//                mListener.onListFragmentInteraction(holder.mItem)
//            }
//        })


    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = myDataset.size
}