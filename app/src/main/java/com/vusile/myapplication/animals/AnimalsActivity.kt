package com.vusile.myapplication.animals

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.vusile.myapplication.R
import kotlinx.android.synthetic.main.activity_animals.*


class AnimalsActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    // Adding Animals to be displayed
    private val animals = listOf(
            Animal("Lion", R.drawable.lion, "Simba, mfalme wa porini"),
            Animal("Elephant", R.drawable.elephant, "Tembo, mnyama mkubwa kuliko wote porini"),
            Animal("Giraffe", R.drawable.giraffe, "Twiga, mnyama mwenye shingo ndefu kuliko wote porini")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animals)
        setSupportActionBar(toolbar)

        viewManager = LinearLayoutManager(this)
        viewAdapter = AnimalsRecyclerViewAdapter(animals)

        recyclerView = findViewById(R.id.animals_recycler_view)
        //recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = viewManager
        recyclerView.adapter = viewAdapter

    }
}


