package com.example.nutroapp.evaolson_social_02;

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
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.nutroapp.R;
import com.example.nutroapp.dietaryhardinge_social_05_convertfragment.SpinnerAdapter;
import com.example.nutroapp.dietaryhardinge_social_05_convertfragment.SpinnerModel;
import com.example.nutroapp.profilelula_social_03.ProfileLulaActivity;

public class EvaOlsonActivity extends AppCompatActivity {

    TextView evaTv;
    Spinner spin;
    SpinnerAdapter spinnerAdapter;
    AppCompatImageView backmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eva_olson);

        // Transparent action bar define ... ##
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow()
                    .getDecorView()
                    .setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }

        setStatusBarColor(this, R.color.white);

        //find .. ##
        evaTv = findViewById(R.id.evatex);
        spin = findViewById(R.id.spinner);
        backmenu = findViewById(R.id.backmenu_id);

        backmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        //got to another activity .. ##
        evaTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EvaOlsonActivity.this,
                        ProfileLulaActivity.class));
            }
        });


        // spinner details design in android..
        SpinnerModel[] models = new SpinnerModel[6];

        models[0] = new SpinnerModel();
        models[0].setId(1);
        models[0].setVegName("Add");

        models[1] = new SpinnerModel();
        models[1].setId(2);
        models[1].setVegName("Add");

        models[2] = new SpinnerModel();
        models[2].setId(3);
        models[2].setVegName("Add");

        models[3] = new SpinnerModel();
        models[3].setId(4);
        models[3].setVegName("Add");

        models[4] = new SpinnerModel();
        models[4].setId(5);
        models[4].setVegName("Add");

        models[5] = new SpinnerModel();
        models[5].setId(6);
        models[5].setVegName("Add");

        //set a spinner adapter ... ##
        spinnerAdapter = new SpinnerAdapter(EvaOlsonActivity.this,
                R.layout.support_simple_spinner_dropdown_item,models);
        spin.setAdapter(spinnerAdapter);

        //spinner set to listner ... ##
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
