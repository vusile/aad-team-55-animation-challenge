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
            Animal("Lion", R.drawable.lion, "Tanzania contains by far the largest number of lions remaining in Africa, distributed amongst 9 lions areas: The Selous lion area is estimated to contain 7,644 lions in 138,035km2. The Ruaha-Rungwa lion area is estimated to contain 3,779 lions in 195,993km2. The Serengeti-Mara lion area, shared with Kenya, is estimated to contain 3,673 lions in 35,852km2."),

            Animal("Elephant", R.drawable.elephant, "Tanzania harbours one of Africa’s most significant remaining elephant populations, the only larger population being found in Botswana. In 1976, numbers in Tanzania stood at 316,000, but major declines in the late 1980’s and especially since 2009, driven by an upsurge in the illegal trade in ivory, have decimated the population which today stands at roughly 45,000."),

            Animal("Giraffe", R.drawable.giraffe, "Tanzania proudly shelters the largest population of giraffes in the world. One of the national symbols of this country, this animal enjoys a special place in the wildlife of Tanzania. Herds of majestic giraffes roam the plains of Serengeti, towering among other animals and magnetizing the visitors with their royal grandeur.")
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


