package com.vusile.myapplication.animals

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

import kotlinx.android.synthetic.main.activity_animals.*
import android.view.animation.AnimationUtils
import com.vusile.myapplication.R


class AnimalsActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    //private val myDataset = arrayOf("Lion", "Giraffe", "Elephant")

    private val animals = listOf(
            Animal("Lion", "Lion.jpg", "Simba, mfalme wa porini"),
            Animal("Elephant", "Elephant.jpg", "Tembo, mnyama mkubwa kuliko wote porini"),
            Animal("Giraffe", "Giraffe.jpg", "Twiga, mnyama mwenye shingo ndefu kuliko wote porini")
    )

            //Array<Animal>(3, Animal("lion", "Lion.jpg", "Simbaa"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.vusile.myapplication.R.layout.activity_animals)
        setSupportActionBar(toolbar)

        viewManager = LinearLayoutManager(this)
        viewAdapter = AnimalsRecyclerViewAdapter(animals)

        recyclerView = findViewById<RecyclerView>(R.id.animals_recycler_view).apply {
            // use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            setHasFixedSize(true)

            // use a linear layout manager
            layoutManager = viewManager

            // specify an viewAdapter (see also next example)
            adapter = viewAdapter

        }


        //viewManager = LinearLayoutManager(this)
        //viewAdapter = AnimalsRecyclerViewAdapter(myDataset)

        //val adapter = RecyclerViewAdapter()
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.adapter = viewAdapter
//
//        viewAdapter = AnimalsRecyclerViewAdapter(myDataset)

        //runLayoutAnimation(recyclerView)
    }

    private fun runLayoutAnimation(recyclerView: RecyclerView) {
        val context = recyclerView.context

        val layoutAnimationController = AnimationUtils.loadLayoutAnimation(context, com.vusile.myapplication.R.anim.animals_animation_layout_fall_down)

        recyclerView.layoutAnimation = layoutAnimationController
        recyclerView.adapter!!.notifyDataSetChanged()
        recyclerView.scheduleLayoutAnimation()
    }

}


