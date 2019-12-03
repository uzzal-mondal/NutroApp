package com.example.nutroapp.statasactivity_stats_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
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
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.nutroapp.R;
import com.example.nutroapp.overview_stats_02.OverviewActivity;

import java.util.Calendar;
import java.util.List;

public class StatasActivity extends AppCompatActivity {

    private Spinner spinner;
    private MonthSpinnerAdapter adapter;
    private TextView textView;
    private Button btnCalendar;
    private RecyclerView recyclerView;
    List<CountModel> countModelList;

    TextView tvActivity;
    AppCompatImageView backImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statas);

        // Transparent action bar define .. ##
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }

        setStatusColor(this, R.color.color_white);

        tvActivity = findViewById(R.id.textactivity);
        spinner =  findViewById(R.id.spinnerid);
        btnCalendar = findViewById(R.id.caldendarid);
        recyclerView = findViewById(R.id.recyclercount);
        backImage = findViewById(R.id.menubacktollbar_id);

        backImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        tvActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StatasActivity.this,
                        OverviewActivity.class));
            }
        });



        // this is spinner part.. ##
        MonthSpinnerModel[] monthModels = new MonthSpinnerModel[6];

        monthModels[0] = new MonthSpinnerModel();
        monthModels[0].setId(1);
        monthModels[0].setMonthName("January-February");

        monthModels[1] = new MonthSpinnerModel();
        monthModels[1].setId(2);
        monthModels[1].setMonthName("March-April");

        monthModels[2] = new MonthSpinnerModel();
        monthModels[2].setId(3);
        monthModels[2].setMonthName("May-June");

        monthModels[3] = new MonthSpinnerModel();
        monthModels[3].setId(4);
        monthModels[3].setMonthName("July-August");

        monthModels[4] = new MonthSpinnerModel();
        monthModels[4].setId(5);
        monthModels[4].setMonthName("September-October");

        monthModels[5] = new MonthSpinnerModel();
        monthModels[5].setId(6);
        monthModels[5].setMonthName("November-December");


        //set a spinner adapter ... ##
        final MonthSpinnerAdapter adapter = new MonthSpinnerAdapter(this,
                R.layout.support_simple_spinner_dropdown_item, monthModels);
        spinner.setAdapter(adapter);


        //spinner set to listner ... ##
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {


                MonthSpinnerModel model = adapter.getItem(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        // this is calendar part ... ##
        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get((Calendar.YEAR));
        final int month = calendar.get((Calendar.MONTH));
        final int day = calendar.get((Calendar.DAY_OF_MONTH));
        btnCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DatePickerDialog datePickerDialog = new DatePickerDialog
                        (StatasActivity.this, new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                            }
                        }, year, month, day);

                datePickerDialog.show();

            }
        });




        // working to recycler in count down..
        RecyclerAdaptercount adaptercount = new RecyclerAdaptercount(this,countModelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,
                RecyclerView.HORIZONTAL,false));
        recyclerView.setAdapter(adaptercount);




    }

    // this is method using to setStatus bar ... ##
    public void setStatusColor(Activity activity, int colorResourceId) {
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, colorResourceId));
    }
}
