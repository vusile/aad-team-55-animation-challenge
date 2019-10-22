package com.vusile.myapplication.mountains

import android.animation.AnimatorInflater
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.vusile.myapplication.R
import com.vusile.myapplication.animals.Animal
import com.vusile.myapplication.animals.AnimalsRecyclerViewAdapter
import kotlinx.android.synthetic.main.a_mountain.*

import kotlinx.android.synthetic.main.activity_mountains.*

class MountainsActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    // Adding Animals to be displayed
    private val mountain = listOf(
            Mountain("Kilimanjaro", R.drawable.mount_kilimanjaro, "At 5896m Mt Kilimanjaro, Africa's highest mountain and one of the continent's magnificent sights, It has three main volcanic peaks, Kibo, Mawenzi, and Shira. The name itself 'Kilimanjaro' is a mystery wreathed in clouds. It might mean Mountain of Light, Mountain of Greatness or Mountain of Caravans."),

            Mountain("Meru", R.drawable.mount_meru, "With its 4566m, Mount Meru is the fifth highest mountain on the African continent and the second highest in Tanzania. About 250,000 years ago, a massive volcanic explosion swept away the entire eastern side of the mountain and left it with the distinctive and distinctive appearance it has today. Last eruption: 1910."),

            Mountain("Usambara", R.drawable.usambara_mountains, "The Usambara's are a part of the ancient Eastern Arc chain which mountains stretch in a broken crescent from the Taita hills in southern Kenya down to Morogoro and the southern highlands. They are estimated to be at least 100 million years old and the rocks forming them may be as much as 600 million years old. The mountains are home to an exceptional assortment of plants and animals and represent one of the highest degrees of biodiversity on the continent.")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mountains)
        setSupportActionBar(toolbar)

        viewManager = LinearLayoutManager(this)
        viewAdapter = MountainsRecyclerViewAdapter(mountain)

        recyclerView = findViewById(R.id.mountains_recycler_view)
        recyclerView.layoutManager = viewManager
        recyclerView.adapter = viewAdapter

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Mountains activity...", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()

            fadeAnimation()
        }
    }

    private fun fadeAnimation() {
        val fadeAnimator = AnimatorInflater.loadAnimator(this, R.animator.alpha)
        /*fadeAnimator.setTarget(mountain_image)
        fadeAnimator.start()*/

        fadeAnimator.apply {
            setTarget(mountain_image)
            start()
        }
    }

}
