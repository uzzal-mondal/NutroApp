package com.example.nutroapp.profileeva;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.nutroapp.R;
import com.example.nutroapp.schedule.ScheduleActivity;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

import java.util.ArrayList;
import java.util.List;

public class ProfileEvaActivity extends AppCompatActivity {


    private RecyclerView recyclerViewPro;
    private List<ProfileItemModel> profileItemModelList;
    private TextView textViewEvaOlson;
    private ViewPager viewPager;
    private DotsIndicator indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_eva);

        // use for transparent ... #
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


        // this is for find all view ...
        textViewEvaOlson = findViewById(R.id.text_main_eva_olson_id);
        recyclerViewPro = findViewById(R.id.recyclerView_pro_eva_id);
        viewPager = findViewById(R.id.viewPagerRecent_id);
        indicator = findViewById(R.id.inidicator_recent_id);


       // paritcipants profileModel List add to ArrayList ...
        profileItemModelList = new ArrayList<>();
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_olson_1));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_olson_2));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_ollson_3));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_olson_2));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_olson_1));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_ollson_3));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_olson_2));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_olson_1));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_ollson_3));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_olson_1));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_olson_2));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_ollson_3));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_olson_2));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_olson_1));

        // recycler adapter set ...
        ProfileRecyclerAdapter adapter = new ProfileRecyclerAdapter(this,
                profileItemModelList);
        recyclerViewPro.setLayoutManager(new LinearLayoutManager(this,
                RecyclerView.HORIZONTAL,false));
        recyclerViewPro.setAdapter(adapter);


       // go to schedule activity ...
        textViewEvaOlson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(ProfileEvaActivity.this,
                        ScheduleActivity.class));
            }
        });









    }
}
