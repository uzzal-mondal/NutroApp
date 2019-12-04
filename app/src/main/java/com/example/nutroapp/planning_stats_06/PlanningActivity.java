package com.example.nutroapp.planning_stats_06;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.nutroapp.R;
import com.example.nutroapp.statasactivity_stats_01.StatasActivity;

public class PlanningActivity extends AppCompatActivity {

    private AppCompatImageView backImg;
    private AppCompatTextView plantext;
    private AppCompatImageView serchImgae;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planning);

        // Transparent action bar define .. ##
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }

        setStatusColor(this, R.color.color_white);


        plantext = findViewById(R.id.planningtex);
        plantext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PlanningActivity.this,
                        StatasActivity.class));
            }
        });


        backImg = findViewById(R.id.menubacktollbar_id);
        backImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }


    // this is method using to setStatus bar ... ##
    public void setStatusColor(Activity activity, int colorResourceId) {
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, colorResourceId));


    }
}
