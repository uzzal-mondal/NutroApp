package com.example.nutroapp.todayspecial_social_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.nutroapp.R;
import com.example.nutroapp.evaolson_social_02.EvaOlsonActivity;

import java.util.ArrayList;
import java.util.List;

public class TodayActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView recyclerViewPlace;
    private List<TodayModel> todayModelList;
    private List<SecondTodayModel> secondTodayModelList;

    TextView todayText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today);

        // Transparent action bar define ... ##
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow()
                    .getDecorView()
                    .setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setStatusBarColor(this, R.color.white);


        recyclerView = findViewById(R.id.recyclertoday);
        recyclerViewPlace = findViewById(R.id.recyclerplaceid);
        todayText = findViewById(R.id.todaytext);

        // go to another actiivty
        todayText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TodayActivity.this, EvaOlsonActivity.class));
            }
        });


        RecyclerTodayAdapter todayAdapter = new RecyclerTodayAdapter(this, todayModelList);


        //  GridLayoutManager layoutManager = new GridLayoutManager(this,4);
        GridLayoutManager layoutManager =
                new GridLayoutManager(this, 2,
                        RecyclerView.HORIZONTAL, false);
        layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return position == 0 ? 2 : 1;
            }
        });

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(todayAdapter);


        List<TodayModel> list = new ArrayList<>();
        list.add(new TodayModel(R.drawable.item_recipes_long_1,
                "10 min"));

        list.add(new TodayModel(R.drawable.item_recipes_long_3,
                "30 min"));

        list.add(new TodayModel(R.drawable.item_recipes_long_4,
                "40 min"));


        list.add(new TodayModel(R.drawable.item_recipes_long_3,
                "30 min"));



        RecyclerTodayAdapter adapter = new RecyclerTodayAdapter(this, list);
        recyclerView.setAdapter(adapter);



     /*       second     -----------------------------------------------   */


        // next places recycler and adapter .. ##

        SecondTodayRecyclerAdapter adapter1 = new
                SecondTodayRecyclerAdapter(this,secondTodayModelList);
        recyclerViewPlace.setLayoutManager(new LinearLayoutManager
                (this,RecyclerView.VERTICAL,false));
        recyclerViewPlace.setAdapter(adapter1);


        List<SecondTodayModel> modelList = new ArrayList<>();
        modelList.add(new SecondTodayModel(R.drawable.profile_eva_olson_1));
        modelList.add(new SecondTodayModel(R.drawable.profile_eva_olson_2));
        modelList.add(new SecondTodayModel(R.drawable.profile_eva_olson_3));
        modelList.add(new SecondTodayModel(R.drawable.profile_eva_olson_1));

        SecondTodayRecyclerAdapter todayRecyclerAdapter = new
                SecondTodayRecyclerAdapter(this,modelList);
        recyclerViewPlace.setAdapter(todayRecyclerAdapter);



    }

    public void setStatusBarColor(Activity activity, int colorResourceId) {

        Window window = activity.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(
                ContextCompat.getColor(activity, colorResourceId));
    }
}
