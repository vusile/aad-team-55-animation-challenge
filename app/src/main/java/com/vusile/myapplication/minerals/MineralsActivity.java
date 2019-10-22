package com.vusile.myapplication.minerals;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.vusile.myapplication.R;

import java.util.ArrayList;

public class MineralsActivity extends AppCompatActivity {

    private static final String TAG = "MineralsActivity";
    RecyclerView mMineralsRecylerView;
    MineralsAdapter mMineralsAdapter;
    LinearLayoutManager mLinearLayoutManager;

    private ArrayList<Mineral> minerals = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minerals);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        addMinerals();

        mLinearLayoutManager = new LinearLayoutManager(this);
        mMineralsAdapter = new MineralsAdapter();


        mMineralsRecylerView = findViewById(R.id.rv_minerals);
        mMineralsRecylerView.setHasFixedSize(true);
        mMineralsRecylerView.setLayoutManager(mLinearLayoutManager);
        mMineralsRecylerView.setAdapter(mMineralsAdapter);
    }

    private void addMinerals() {
        minerals.add(
            new Mineral(
                "Tanzanite",
                "Tanzanite is the blue and violet variety of the mineral zoisite. Tanzanite is only found in Tanzania, in a very small mining area near the Mirerani Hills. Tanzanite is noted for its remarkably strong trichroism, appearing alternately blue, violet and burgundy depending on crystal orientation.Tanzanite can also appear differently when viewed under different lighting conditions. The blues appear more evident when subjected to fluorescent light and the violet hues can be seen readily when viewed under incandescent illumination. The gemstone was given the name 'tanzanite' by Tiffany & Co. after Tanzania, the country in which it was discovered.",
                R.drawable.tanzanite
            )
        );

        minerals.add(
            new Mineral(
                "Gold",
                "The Lake Victoria Gold Fields in Tanzania is a highly prolific gold mining region hosting over 50 million ounces of gold including the world-class Bulyanhulu gold camp which has delivered more than 20 million of high grade resources and reserves in multiple gold-bearing quartz reefs.",
                R.drawable.gold
            )
        );

        minerals.add(
            new Mineral (
                "Diamond",
                "Diamonds in Tanzania are found mainly in the Williamson diamond mine, which is located south of the town Mwanza in northwest Tanzania. In 2015, Tanzania was the 10th largest diamond producer in Africa after Botswana (17.3m ca), Angola (7.1m ca), South Africa (6m ca), the Democratic Republic of Congo (3.15m ca), Namibia (1.92m ca), Sierra Leone (0.5m ca), Zimbabwe (0.5m ca), Lesotho (0.35m ca) and Ghana (0.24m ca)",
                R.drawable.diamonds
            )
        );
    }

    private class MineralsAdapter extends RecyclerView.Adapter<MineralsAdapter.MineralsViewHolder> {

        @NonNull
        @Override
        public MineralsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            Log.d(TAG, "onCreateViewHolder: ");
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_mineral, viewGroup, false);
            return new MineralsViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull MineralsViewHolder mineralsViewHolder, int i) {
            Mineral mineral = minerals.get(i);
            mineralsViewHolder.mineralName.setText(mineral.getName());
            mineralsViewHolder.mineralDescription.setText(mineral.getDescription());
            mineralsViewHolder.mineralImage.setImageResource(mineral.getImageName());
        }

        @Override
        public int getItemCount() {
            return minerals.size();
        }

        private class MineralsViewHolder extends RecyclerView.ViewHolder {
            TextView mineralName;
            ImageView mineralImage;
            TextView mineralDescription;
            public MineralsViewHolder(@NonNull View itemView) {
                super(itemView);
                mineralName = itemView.findViewById(R.id.tv_mineral_name);
                mineralDescription = itemView.findViewById(R.id.tv_description_mineral);
                mineralImage = itemView.findViewById(R.id.img_mineral);
            }
        }
    }
}
