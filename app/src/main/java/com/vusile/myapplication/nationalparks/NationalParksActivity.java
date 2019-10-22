package com.vusile.myapplication.nationalparks;

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
import android.widget.TextView;

import com.vusile.myapplication.R;

import java.util.ArrayList;

public class NationalParksActivity extends AppCompatActivity {

    private static final String TAG = "NationalParksActivity";
    RecyclerView mNationalParksRecylerView;
    NationalParksActivity.NationalParksAdapter mMineralsAdapter;
    LinearLayoutManager mLinearLayoutManager;

    private ArrayList<NationalPark> nationalParks= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national_parks);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        addNationalParks();

        mLinearLayoutManager = new LinearLayoutManager(this);
        mMineralsAdapter = new NationalParksActivity.NationalParksAdapter();


        mNationalParksRecylerView = findViewById(R.id.rv_national_parks);
        mNationalParksRecylerView.setHasFixedSize(true);
        mNationalParksRecylerView.setLayoutManager(mLinearLayoutManager);
        mNationalParksRecylerView.setAdapter(mMineralsAdapter);
    }

    private void addNationalParks() {
        nationalParks.add(
                new NationalPark(
                        "Serengeti",
                        "The Serengeti National Park in Tanzania was established in 1952. It is home to the greatest wildlife spectacle on earth - the great migration of wildebeest and zebra. The resident population of lion, cheetah, elephant, giraffe, and birds is also impressive. There’s a wide variety of accommodation available, from luxury lodges to mobile camps. The park covers 5,700 sq miles, (14,763 sq km), it’s larger than Connecticut, with at most a couple hundred vehicles driving around.",
                        R.drawable.serengeti
                )
        );

        nationalParks.add(
                new NationalPark(
                        "Ngorongoro",
                        "he Ngorongoro Conservation Area covers 8,292 square kilometers. It is one of the three divisions that comprise Ngorongoro District in Arusha Region of Tanzania. The jewel in Ngorongoro's crown is a deep, volcanic crater, the largest un flooded and unbroken caldera in the world. About 20kms across, 600 meters deep and 300 sq kms in area, the Ngorongoro Crater is a breathtaking natural wonder.",
                        R.drawable.ngorongoro
                )
        );

        nationalParks.add(
                new NationalPark (
                        "Mikumi",
                        "The Mikumi National Park near Morogoro, Tanzania, was established in 1964. It covers an area of 3,230 km² is the fourth largest in the country. The park is crossed by Tanzania's A-7 highway. The landscape of Mikumi is often compared to that of the Serengeti. The road that crosses the park divides it into two areas with partially distinct environments. The area north-west is characterized by the alluvial plain of the river basin Mkata. The vegetation of this area consists of savannah dotted with acacia, baobab, tamarinds, and some rare palm. In this area, at the furthest from the road, there are spectacular rock formations of the mountains Rubeho and Uluguru. The southeast part of the park is less rich in wildlife, and not very accessible.",
                        R.drawable.mikumi
                )
        );
    }

    private class NationalParksAdapter extends RecyclerView.Adapter<NationalParksActivity.NationalParksAdapter.NationalParksViewHolder> {

        @NonNull
        @Override
        public NationalParksActivity.NationalParksAdapter.NationalParksViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            Log.d(TAG, "onCreateViewHolder: ");
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_national_park, viewGroup, false);
            return new NationalParksActivity.NationalParksAdapter.NationalParksViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull NationalParksActivity.NationalParksAdapter.NationalParksViewHolder nationalParksViewHolder, int i) {
            NationalPark nationalPark = nationalParks.get(i);
            nationalParksViewHolder.nationalParkName.setText(nationalPark.getName());
            nationalParksViewHolder.nationalParkDescription.setText(nationalPark.getDescription());
            nationalParksViewHolder.nationalParklImage.setImageResource(nationalPark.getImageName());
        }

        @Override
        public int getItemCount() {
            return nationalParks.size();
        }

        private class NationalParksViewHolder extends RecyclerView.ViewHolder {
            TextView nationalParkName;
            ImageView nationalParklImage;
            TextView nationalParkDescription;
            public NationalParksViewHolder(@NonNull View itemView) {
                super(itemView);
                nationalParkName = itemView.findViewById(R.id.tv_park_name);
                nationalParkDescription = itemView.findViewById(R.id.tv_description_park);
                nationalParklImage = itemView.findViewById(R.id.img_park);
            }
        }
    }

}
