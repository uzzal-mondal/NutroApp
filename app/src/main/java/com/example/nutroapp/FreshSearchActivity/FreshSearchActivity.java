package com.example.nutroapp.FreshSearchActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.nutroapp.R;
import com.example.nutroapp.helper.OverlapDecoration;

import java.util.ArrayList;
import java.util.List;

public class FreshSearchActivity extends AppCompatActivity {

    ImageView imageView;
    private RecyclerView recyclerfresh;
    private List<FreshSearchModels> freshModelList;
    private AppCompatImageView backImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresh_search);


        // Transparent action bar define ... ##
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow()
                    .getDecorView()
                    .setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setStatusBarColor(this, R.color.white);

        // find id ... ##
        imageView = findViewById(R.id.waterImage);
        recyclerfresh = findViewById(R.id.recyclerfresh_id);
        backImage = findViewById(R.id.imagebackcreate_id);

        backImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        // image view onClickListner ... ##
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        List<FreshSearchModels> modelList = new ArrayList<>();
        modelList.add(new FreshSearchModels(R.drawable.profile_eva_olson_1));
        modelList.add(new FreshSearchModels(R.drawable.profile_eva_olson_2));
        modelList.add(new FreshSearchModels(R.drawable.profile_eva_ollson_3));
        FreshSearchRecyclerAdapter adapter = new FreshSearchRecyclerAdapter(this);
        recyclerfresh.setLayoutManager(new LinearLayoutManager(this));
        recyclerfresh.setAdapter(adapter);
        recyclerfresh.addItemDecoration(new OverlapDecoration());

    }

    public void setStatusBarColor(Activity activity, int colorResourceId){
        Window window = activity.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(
                ContextCompat.getColor(activity,colorResourceId));
    }



    }

