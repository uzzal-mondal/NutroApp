package com.example.nutroapp.dietaryhardinge_social_05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
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
import com.example.nutroapp.freshforse_social_06.FreshForseActivity;
import com.example.nutroapp.schedule_activity_03.MonthModel;
import com.example.nutroapp.schedule_activity_03.ScheduleActivity;
import com.example.nutroapp.schedule_activity_03.SpinerAdapter;

import java.util.ArrayList;
import java.util.List;

public class DietaryHardingeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<ItemImgModel> itemImgModelList;
    TextView textView;


    Spinner spinner;
    private SpinnerAdapter spinnerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietary_hardinge);

        // Transparent action bar define ... ##
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow()
                    .getDecorView()
                    .setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setStatusBarColor(this, R.color.white);

        // find id .. ##
        recyclerView = findViewById(R.id.recycler);
        textView = findViewById(R.id.hardinagetext);
        spinner = findViewById(R.id.spinner_id);

        // go to another acitivity... ##
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DietaryHardingeActivity.this,
                        FreshForseActivity.class));
            }
        });



        // Recycler adapter set ... ##
        RecyclerAdapter adapterimg = new RecyclerAdapter(this,itemImgModelList);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(adapterimg);

        List<ItemImgModel> list = new ArrayList<>();
        list.add(new ItemImgModel(R.drawable.profile_eva_olson_1));
        list.add(new ItemImgModel(R.drawable.profile_eva_olson_2));
        list.add(new ItemImgModel(R.drawable.profile_eva_ollson_3));
        list.add(new ItemImgModel(R.drawable.profile_eva_olson_2));
        list.add(new ItemImgModel(R.drawable.profile_eva_olson_1));
        list.add(new ItemImgModel(R.drawable.profile_eva_ollson_3));
        list.add(new ItemImgModel(R.drawable.profile_eva_olson_2));
        list.add(new ItemImgModel(R.drawable.profile_eva_olson_1));
        list.add(new ItemImgModel(R.drawable.profile_eva_ollson_3));

        RecyclerAdapter adapter = new RecyclerAdapter(this,list);
        recyclerView.setAdapter(adapter);




        // spinner details design in android..
        SpinnerModel[] models = new SpinnerModel[6];

        models[0] = new SpinnerModel();
        models[0].setId(1);
        models[0].setVegName("Vegetarian");

        models[1] = new SpinnerModel();
        models[1].setId(2);
        models[1].setVegName("Vegetarian");

        models[2] = new SpinnerModel();
        models[2].setId(3);
        models[2].setVegName("Vegetarian");

        models[3] = new SpinnerModel();
        models[3].setId(4);
        models[3].setVegName("Vegetarian");

        models[4] = new SpinnerModel();
        models[4].setId(5);
        models[4].setVegName("Vegetarian");

        models[5] = new SpinnerModel();
        models[5].setId(6);
        models[5].setVegName("Vegetarian");

        //set a spinner adapter ... ##
       spinnerAdapter = new SpinnerAdapter(DietaryHardingeActivity.this,
               R.layout.support_simple_spinner_dropdown_item,models);
        spinner.setAdapter(spinnerAdapter);

        //spinner set to listner ... ##
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView,
                                       View view, int position, long l) {

                SpinnerModel spinnerModel = spinnerAdapter.getItem(position);
               /* Toast.makeText(ScheduleActivity.this,
                        "Id: " + monthModel.getId() + " \nname: " +
                        monthModel.getMonthName(), Toast.LENGTH_SHORT).show();*/
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });





    }

    public void setStatusBarColor(Activity activity, int colorResourceId){

        Window window = activity.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

        window.setStatusBarColor(
                ContextCompat.getColor(activity,colorResourceId));


    }
}
