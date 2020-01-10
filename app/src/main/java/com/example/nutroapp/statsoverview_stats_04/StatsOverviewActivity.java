package com.example.nutroapp.statsoverview_stats_04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
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

import com.example.nutroapp.FreshSearchActivityPack.FreshSearchActivity;
import com.example.nutroapp.R;
import com.example.nutroapp.statsdays_activity_05.StatsDayActivity;

import java.util.ArrayList;
import java.util.List;

public class StatsOverviewActivity extends AppCompatActivity {

    TextView overText;
    RecyclerView recyclerOverView;
    private List<OverviewModel> overviewModelList;
    private AppCompatImageView backimage;
    private AppCompatImageView serchimgage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview_stats);

        // Transparent action bar define .. ##
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setStatusColor(this,R.color.white);

        // find id..
        overText = findViewById(R.id.overviewtext);
        recyclerOverView = findViewById(R.id.recycleroverview_id);
        backimage = findViewById(R.id.menuback_id);
        serchimgage = findViewById(R.id.search);

        serchimgage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StatsOverviewActivity.this,
                        FreshSearchActivity.class));
            }
        });

        backimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        // another to activity ... ##
        overText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(StatsOverviewActivity.this,
                        StatsDayActivity.class));
            }
        });


        // set adapter with layout manager with recycler ... ##
        OverViewRecyclerAdapter recyclerAdapter = new
                OverViewRecyclerAdapter(this,overviewModelList);
        recyclerOverView.setLayoutManager(new LinearLayoutManager(this,
                RecyclerView.HORIZONTAL,false));
        recyclerOverView.setAdapter(recyclerAdapter);


        List<OverviewModel> modelList = new ArrayList<>();
        modelList.add(new OverviewModel(90,"S"));
        modelList.add(new OverviewModel(70));
        modelList.add(new OverviewModel(50));
        modelList.add(new OverviewModel(100,"T"));
        modelList.add(new OverviewModel(60));
        modelList.add(new OverviewModel(85));
        modelList.add(new OverviewModel(95,"F"));

        OverViewRecyclerAdapter adapter = new OverViewRecyclerAdapter(this,modelList);
        recyclerOverView.setAdapter(adapter);












    }
    // this is method using to setStatus bar ... ##
    public void setStatusColor(Activity activity, int colorRsourceId){
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(activity,colorRsourceId));
    }
}
