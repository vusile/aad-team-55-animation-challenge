package com.vusile.myapplication.lakes;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.vusile.myapplication.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LakesActivity extends AppCompatActivity {

    private static final String TAG = "LakesActivity";
    RecyclerView mLakesRecylerView;
    LakesAdapter mLakesAdapter;
    LinearLayoutManager mLinearLayoutManager;

    private ArrayList<Lake> lakes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lakes);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        addLakes();

        mLinearLayoutManager = new LinearLayoutManager(this);
        mLakesAdapter = new LakesAdapter();


        mLakesRecylerView = findViewById(R.id.rv_lakes);
        mLakesRecylerView.setHasFixedSize(true);
        mLakesRecylerView.setLayoutManager(mLinearLayoutManager);
        mLakesRecylerView.setAdapter(mLakesAdapter);
    }

    private void addLakes() {
        lakes.add(
            new Lake(
                "Lake Victoria",
                "With a surface area of approximately 59,947 square kilometres (23,146 sq mi), Lake Victoria is Africa's largest lake by area, the world's largest tropical lake, and the world's second largest fresh water lake by surface area after Lake Superior in North America. In terms of volume, Lake Victoria is the world's ninth largest continental lake, containing about 2,424 cubic kilometres (1.965×109 acre⋅ft) of water. The lake's area is divided among three countries: Kenya (6 percent or 4,100 square kilometres or 1,600 square miles), Uganda (45 percent or 31,000 square kilometres or 12,000 square miles), and Tanzania (49 percent or 33,700 square kilometres or 13,000 square miles).",
                R.drawable.lake_victoria
            )
        );

        lakes.add(
            new Lake(
                "Lake Tanganyika",
                "Lake Tanganyika is an African Great Lake. It is the second-oldest freshwater lake in the world, the second-largest by volume, and the second-deepest, in all cases after Lake Baikal in Siberia. It is the world's longest freshwater lake. The lake is shared between four countries – Tanzania, the Democratic Republic of the Congo (DRC), Burundi, and Zambia, with Tanzania (46%) and DRC (40%) possessing the majority of the lake. It drains into the Congo River system and ultimately into the Atlantic Ocean.",
                R.drawable.lake_tangayika
            )
        );

        lakes.add(
            new Lake (
                "Lake Nyasa",
                "Lake Nyasa  is an African Great Lake and the southernmost lake in the East African Rift system, located between Malawi, Mozambique and Tanzania. It is the fourth largest fresh water lake in the world by volume, the ninth largest lake in the world by area—and the third largest and second deepest lake in Africa. It is home to more species of fish than any other lake, including at least 700 species of cichlids. Lake Nyasa is a meromictic lake, meaning that its water layers do not mix. The permanent stratification of Lake Malawi's water and the oxic-anoxic boundary (relating to oxygen in the water) are maintained by moderately small chemical and thermal gradients.",
                R.drawable.lake_nyasa
            )
        );
    }

    private class LakesAdapter extends RecyclerView.Adapter<LakesAdapter.LakesViewHolder> {

        @NonNull
        @Override
        public LakesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            Log.d(TAG, "onCreateViewHolder: ");
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_lake, viewGroup, false);
            return new LakesViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull LakesViewHolder lakesViewHolder, int i) {
            Lake lake = lakes.get(i);
            lakesViewHolder.lakeName.setText(lake.getName());
            lakesViewHolder.lakeDescription.setText(lake.getDescription());
            lakesViewHolder.lakeImage.setImageResource(lake.getImageName());
        }

        @Override
        public int getItemCount() {
            return lakes.size();
        }

        private class LakesViewHolder extends RecyclerView.ViewHolder {
            TextView lakeName;
            ImageView lakeImage;
            TextView lakeDescription;
            public LakesViewHolder(@NonNull View itemView) {
                super(itemView);
                lakeName = itemView.findViewById(R.id.tv_lake_name);
                lakeDescription = itemView.findViewById(R.id.tv_description_lake);
                lakeImage = itemView.findViewById(R.id.img_lake);
            }
        }
    }
}
