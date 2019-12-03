package com.example.nutroapp.exploresecondactivity_activity_02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.nutroapp.R;
import com.example.nutroapp.exploreactivity_Activity_01.ProfileExploreActivity;
import com.example.nutroapp.recipes_activity_05.RecipesActivity;
import com.example.nutroapp.schedule_activity_03.ScheduleActivity;

import java.util.ArrayList;
import java.util.List;

public class ExploreChartActivity extends AppCompatActivity {

    private TextView scheduleText;
    private AppCompatImageView backImageView;

    private RecyclerView recyclermonth,recyclerday, recyclerstkoe;
    private List<MonthModel> modelList;
    //stroke... ##
    List<StrokeTimeModel> strokeTimeModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_chart);

        // Transparent action bar define ... ##
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow()
                    .getDecorView()
                    .setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }

        setStatusBarColor(this, R.color.color_tanesparent);


        //find id ... ##
        recyclermonth = findViewById(R.id.recycclermonth_id);
        recyclerday = findViewById(R.id.recyclerday_id);
        recyclerstkoe = findViewById(R.id.recyclerstokes_id);
        scheduleText = findViewById(R.id.scheduletext);


        // menu back image find with listner.. ##
        backImageView = findViewById(R.id.back_id);
        backImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });







        // go to schedule activity ..##
        scheduleText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ExploreChartActivity.this,
                        RecipesActivity.class));
            }
        });



       // use to recycler and month adapter ... ##
        RecyclerMonthNameAdapter nameAdapter = new
                RecyclerMonthNameAdapter(this,modelList);

        recyclermonth.setLayoutManager(new LinearLayoutManager(this,
                RecyclerView.HORIZONTAL, false));
        recyclermonth.setAdapter(nameAdapter);



        // list and adapter set.. ##
        List<MonthModel> list = new ArrayList<>();
        list.add(new MonthModel("January"));
        list.add(new MonthModel("February"));
        list.add(new MonthModel("March"));
        list.add(new MonthModel("April"));
        list.add(new MonthModel("May"));
        list.add(new MonthModel("June"));
        list.add(new MonthModel("July"));
        list.add(new MonthModel("August"));
        list.add(new MonthModel("September"));
        list.add(new MonthModel("October"));
        list.add(new MonthModel("November"));
        list.add(new MonthModel("December"));

        RecyclerMonthNameAdapter adapter = new RecyclerMonthNameAdapter(this,list);
        recyclermonth.setAdapter(adapter);





         // second step recycler day.... ##
        RecyclerDayCountAdapter countAdapter = new RecyclerDayCountAdapter(this);
        recyclerday.setLayoutManager(new LinearLayoutManager(this,
                RecyclerView.HORIZONTAL, false));
        recyclerday.setAdapter(countAdapter);



        // recycler strokes
        RecyclerStrokeAdapter strokeAdapter = new
                RecyclerStrokeAdapter(this,strokeTimeModelList);
        recyclerstkoe.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,
                false));
        recyclerstkoe.setAdapter(strokeAdapter);

        List<StrokeTimeModel> strokeTimeModels = new ArrayList<>();
        strokeTimeModels.add(new StrokeTimeModel("9.00",R.drawable.bg_stroke_line));
        strokeTimeModels.add(new StrokeTimeModel("10.00",R.drawable.bg_stroke_line));
        strokeTimeModels.add(new StrokeTimeModel("11.00",R.drawable.bg_stroke_line));
        strokeTimeModels.add(new StrokeTimeModel("12.00",R.drawable.bg_stroke_line));
        strokeTimeModels.add(new StrokeTimeModel("13.00",R.drawable.bg_stroke_line));



        RecyclerStrokeAdapter recyclerStrokeAdapter = new
                RecyclerStrokeAdapter(this,strokeTimeModels);
        recyclerstkoe.setAdapter(recyclerStrokeAdapter);



    }


    public void setStatusBarColor(Activity activity, int colorResourceId){

        Window window = activity.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

        window.setStatusBarColor(
                ContextCompat.getColor(activity,colorResourceId));


    }
}
