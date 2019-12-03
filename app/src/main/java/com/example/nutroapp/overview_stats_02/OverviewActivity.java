package com.example.nutroapp.overview_stats_02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.nutroapp.R;
import com.example.nutroapp.statistic_stats_03.StatisticActivity;

import com.majorik.sparklinelibrary.SparkLineLayout;

import java.util.ArrayList;

public class OverviewActivity extends AppCompatActivity {

    private TextView tv;
    private SparkLineLayout sparkLineLayout;
    private AppCompatImageView backImage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);

        // Transparent action bar define .. ##
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        // method call to statusbar white.
        setStatusColor(this, R.color.color_white);

        //findview
        tv = findViewById(R.id.textoverview);
        backImage = findViewById(R.id.menubacktollbar_id);
        // mchart = findViewById(R.id.linecahrt);

        backImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OverviewActivity.this,
                        StatisticActivity.class));
            }
        });


         sparkLineLayout = findViewById(R.id.sparkline);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(50);
        list.add(80);
        list.add(20);
        list.add(130);
        list.add(100);
        list.add(60);
        list.add(30);
        list.add(20);


        sparkLineLayout.setData(list);




    }
    // this is method using to setStatus bar ... ##
    public void setStatusColor(Activity activity, int colorResourceId) {
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, colorResourceId));
    }
}
