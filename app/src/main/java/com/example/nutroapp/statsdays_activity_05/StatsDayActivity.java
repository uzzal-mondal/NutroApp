package com.example.nutroapp.statsdays_activity_05;

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
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.nutroapp.R;
import com.example.nutroapp.planning_stats_06.PlanningActivity;

import java.util.ArrayList;
import java.util.List;

public class StatsDayActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<StatsModel> statsModelList;
    private Spinner spinner,spinndershowDay;
    TextView textSeven;

    private AppCompatImageView backImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_day);

        // Transparent action bar define .. ##
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setStatusColor(this,R.color.color_days);




        // find by id ... ##
        recyclerView = findViewById(R.id.recyclerslide);
        spinner = findViewById(R.id.spinershowid);
        spinndershowDay = findViewById(R.id.spinershowdayid);
        textSeven = findViewById(R.id.sevenday);

        backImg = findViewById(R.id.bakimage_day_id);
        backImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        // go to another activity.
        textSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StatsDayActivity.this,
                        PlanningActivity.class));
            }
        });


        // recycler set adapter ... ##
       StatsRecyclerAdapter recyclerAdapter = new
               StatsRecyclerAdapter(this,statsModelList);

       // recycler layout manager ... ##
        recyclerView.setLayoutManager(new LinearLayoutManager(this,
                RecyclerView.HORIZONTAL,false));
        recyclerView.setAdapter(recyclerAdapter);

        // array List with set an adater ... ##
        List<StatsModel> list = new ArrayList<>();
        list.add(new StatsModel(10,100));
        list.add(new StatsModel(5,200));
        list.add(new StatsModel(4,300));
        list.add(new StatsModel(6,400));
        list.add(new StatsModel(8,500));
        list.add(new StatsModel(9,600));
        list.add(new StatsModel(2,700));


        StatsRecyclerAdapter adapter = new StatsRecyclerAdapter(this,list);
        recyclerView.setAdapter(adapter);





        // spinner item adding... ##
        // this is spinner part.. ##
        SpinnerStatsModel[] models = new SpinnerStatsModel[6];

        models[0] = new SpinnerStatsModel();
        models[0].setId(1);
        models[0].setStatsmonthName("January-February");

        models[1] = new SpinnerStatsModel();
        models[1].setId(2);
        models[1].setStatsmonthName("March-April");

        models[2] = new SpinnerStatsModel();
        models[2].setId(3);
        models[2].setStatsmonthName("May-June");

        models[3] = new SpinnerStatsModel();
        models[3].setId(4);
        models[3].setStatsmonthName("July-August");

        models[4] = new SpinnerStatsModel();
        models[4].setId(5);
        models[4].setStatsmonthName("September-October");

        models[5] = new SpinnerStatsModel();
        models[5].setId(6);
        models[5].setStatsmonthName("November-December");


        //set a spinner adapter ... ##
        final SpinnerStatsAdapter spinnerStatsAdapter = new SpinnerStatsAdapter(this,
                R.layout.support_simple_spinner_dropdown_item,models);
        spinner.setAdapter(spinnerStatsAdapter);


        //spinner set to listner ... ##
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {


                SpinnerStatsModel spinnerStatsModel = spinnerStatsAdapter.getItem(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        //.................  second spinner part in weekly  .....................###


        DaySpinnerModel[] daySpinnerModels = new DaySpinnerModel[4];

        daySpinnerModels[0] = new DaySpinnerModel();
        daySpinnerModels[0].setId(1);
        daySpinnerModels[0].setStatDayName("1 Days to 7 Days");

        daySpinnerModels[1] = new DaySpinnerModel();
        daySpinnerModels[1].setId(2);
        daySpinnerModels[1].setStatDayName("8 Days to 14 Days");

        daySpinnerModels[2] = new DaySpinnerModel();
        daySpinnerModels[2].setId(3);
        daySpinnerModels[2].setStatDayName("15 Days to 22 Days");

        daySpinnerModels[3] = new DaySpinnerModel();
        daySpinnerModels[3].setId(4);
        daySpinnerModels[3].setStatDayName("22 Days to 30 Days");

       /* daySpinnerModels[4] = new DaySpinnerModel();
        daySpinnerModels[4].setId(5);
        daySpinnerModels[4].setStatDayName("September to October");

        daySpinnerModels[5] = new DaySpinnerModel();
        daySpinnerModels[5].setId(6);
        daySpinnerModels[5].setStatDayName("November-December");*/


        //set a spinner adapter ... ##
        DaySpinnerAdapter daySpinnerAdapter = new DaySpinnerAdapter(this,
                R.layout.support_simple_spinner_dropdown_item,daySpinnerModels);
        spinndershowDay.setAdapter(daySpinnerAdapter);


        //spinner set to listner ... ##
        spinndershowDay.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {


               // SpinnerStatsModel spinnerStatsModel = spinnerStatsAdapter.getItem(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    // this is method using to setStatus bar ... ##
    public void setStatusColor(Activity activity, int colorRsourceId){
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(activity,colorRsourceId));
    }
}
