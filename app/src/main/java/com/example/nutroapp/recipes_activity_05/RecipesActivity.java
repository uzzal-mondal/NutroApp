package com.example.nutroapp.recipes_activity_05;

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
import com.example.nutroapp.recipesweekly_activity_06.RecipesWeeklyActivity;

import java.util.ArrayList;
import java.util.List;

public class RecipesActivity extends AppCompatActivity {

    private  RecyclerView recyclerView;
    private List<RecipesModel> recipesModelList;
    private TextView recipText;

    private AppCompatImageView imageViewback;
    private AppCompatImageView searchimage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        // Transparent action bar define .. ##
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setStatusBarColor(this,R.color.white);


        // image back system .. ##

        imageViewback = findViewById(R.id.menuback_id);
        searchimage = findViewById(R.id.search);
        imageViewback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        searchimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RecipesActivity.this,
                        FreshSearchActivity.class));
            }
        });


        // going to another activity ..##
        recipText = findViewById(R.id.recipes_text_id);
        recipText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RecipesActivity.this,
                        RecipesWeeklyActivity.class));
            }
        });






         // Recycler with set and adapter .. ##
        recyclerView = findViewById(R.id.recycler_recipes_id);

        RecyclerRecipesAdapter adapter = new RecyclerRecipesAdapter(recipesModelList,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(adapter);



        List<RecipesModel> list = new ArrayList<>();

       list.add(new RecipesModel(R.drawable.recipes_1,R.drawable.recipes_plams_icon,
               "Good for Blueberry Muffins",R.drawable.like_icon,30,
               "likes","calories",30, "1 h"));


        list.add(new RecipesModel(R.drawable.recipes_2,R.drawable.recipes_pepe_icon,
                "Good for pie",R.drawable.like_icon, 60,"likes",
                "Calories",60, "1 h"));

        list.add(new RecipesModel(R.drawable.recipes_1,R.drawable.recipes_plams_icon,
                "Good for Blueberry Muffins",R.drawable.like_icon,40,
                "likes","calories",30, "1 h"));


        list.add(new RecipesModel(R.drawable.recipes_2,R.drawable.recipes_pepe_icon,
                "Good for pie",R.drawable.like_icon, 60,"likes",
                "Calories",60, "1 h"));

        list.add(new RecipesModel(R.drawable.recipes_1,R.drawable.recipes_plams_icon,
                "Good for Blueberry Muffins",R.drawable.like_icon,50,
                "likes","calories",30, "1 h"));


        list.add(new RecipesModel(R.drawable.recipes_2,R.drawable.recipes_pepe_icon,
                "Good for pie",R.drawable.like_icon, 60,"likes",
                "Calories",60, "1 h"));

        list.add(new RecipesModel(R.drawable.recipes_1,R.drawable.recipes_plams_icon,
                "Good for Blueberry Muffins",R.drawable.like_icon,90,
                "likes","calories",30, "1 h"));


        list.add(new RecipesModel(R.drawable.recipes_2,R.drawable.recipes_pepe_icon,
                "Good for pie",R.drawable.like_icon, 10,"likes",
                "Calories",60, "1 h"));






        RecyclerRecipesAdapter recipesAdapter = new RecyclerRecipesAdapter(list,this);
        recyclerView.setAdapter(recipesAdapter);




    }

    // this is method using to setStatus bar ... ##
    public void setStatusBarColor(Activity activity, int colorResourceId){
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,colorResourceId));

    }
}
