package com.example.nutroapp.schedulenutrition_activity_04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import com.example.nutroapp.R;
import com.example.nutroapp.recipes_activity_05.RecipesActivity;

import java.util.Calendar;
import java.util.List;

public class ScheduleNutrationActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    int year, month, day;
    private Button buttonCalendar;
    private TextView textSchdule;
    private List<ItemCountModel> itemCountModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_nutration);

        // Transparent action bar define .. ##
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setStatusColor(this,R.color.white);


        //recycler view find ... ##
        recyclerView = (RecyclerView) findViewById(R.id.recycler_nutrition_id);
        buttonCalendar = (Button) findViewById(R.id.buttonCalendar_id);
        textSchdule = (TextView) findViewById(R.id.textSchudle_id);


        // show the Recipes activity
        textSchdule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScheduleNutrationActivity.this,
                        RecipesActivity.class));
            }
        });

        // adapter to initialize to count ... ##
        RecyclerAdapter adapter = new RecyclerAdapter(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,
                RecyclerView.HORIZONTAL,false));
        //set an recycler view adapter ... ##
        recyclerView.setAdapter(adapter);


        // This is Calendar using code ... ##
        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);

        // clickable to button Calendar ... ##
        buttonCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        ScheduleNutrationActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(
                                    DatePicker datePicker, int year, int month, int dayOfMoth) {

                            }
                        },year,month,day);

                datePickerDialog.show();

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
