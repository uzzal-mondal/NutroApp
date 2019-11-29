package com.example.nutroapp.recipesweekly_activity_06;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
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

import com.example.nutroapp.R;
import com.example.nutroapp.evaolson_social_02.EvaOlsonActivity;
import com.example.nutroapp.todayspecial_social_01.TodayActivity;

import java.util.ArrayList;
import java.util.List;

public class RecipesWeeklyActivity extends AppCompatActivity {

   private RecyclerView recyclerView;
   private List<RecipesWeeklyModels> recipesWeeklyModelList;
   private AppCompatTextView textView;
   private AppCompatImageView backimageview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes_weekly);

        // Transparent action bar define .. ##
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setStatusBarColor(this,R.color.white);

        // find view id .. ##
        recyclerView = findViewById(R.id.recyclerweeklyid);
        textView = findViewById(R.id.recipes_text);
        backimageview = findViewById(R.id.menuback_id);


        // back button set... ##
        backimageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        // go to another acitivity ... ##
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RecipesWeeklyActivity.this,
                        TodayActivity.class));

            }
        });


       RecyclerRecipesWeeklyAdapter adapter = new RecyclerRecipesWeeklyAdapter(
               this,recipesWeeklyModelList);

       recyclerView.setLayoutManager(new LinearLayoutManager(this,
               RecyclerView.HORIZONTAL,false));
       recyclerView.setAdapter(adapter);

       List<RecipesWeeklyModels> list = new ArrayList<>();
        list.add(new RecipesWeeklyModels(90,"S"));
        list.add(new RecipesWeeklyModels(80,"M"));
        list.add(new RecipesWeeklyModels(70,"T"));
        list.add(new RecipesWeeklyModels(60,"W"));
        list.add(new RecipesWeeklyModels(50,"T"));
        list.add(new RecipesWeeklyModels(45,"F"));
        list.add(new RecipesWeeklyModels(90,"S"));


       RecyclerRecipesWeeklyAdapter weeklyAdapter = new
               RecyclerRecipesWeeklyAdapter(this,list);
        recyclerView.setAdapter(weeklyAdapter);




    }

    // this is method using to setStatus bar ... ##
    public void setStatusBarColor(Activity activity, int colorResourceId){
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,colorResourceId));

    }
}
