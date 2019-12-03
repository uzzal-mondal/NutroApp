package com.example.nutroapp.schedulenutrition_activity_04;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import com.example.nutroapp.R;
import com.example.nutroapp.overview_stats_02.OverviewActivity;
import com.example.nutroapp.recipes_activity_05.RecipesActivity;
import com.example.nutroapp.statasactivity_stats_01.StatasActivity;
import com.example.nutroapp.statistic_stats_03.StatisticActivity;
import com.example.nutroapp.statsdays_activity_05.StatsDayActivity;
import com.example.nutroapp.statsoverview_stats_04.StatsOverviewActivity;
import com.google.android.material.navigation.NavigationView;

import java.util.Calendar;
import java.util.List;

public class ScheduleNutrationActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    int year, month, day;
    private AppCompatButton buttonCalendar;
    private AppCompatTextView textSchdule;
    private List<ItemCountModel> itemCountModelList;

    private DrawerLayout drawerLayoutschedule;
    private NavigationView navigationViewschedule;
    private ActionBarDrawerToggle drawerToggle;
    private AppCompatImageView menuImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_nutration);

        // Transparent action bar define .. ##
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setStatusColor(this, R.color.white);


        //recycler view find ... ##
        recyclerView = findViewById(R.id.recycler_nutrition_id);
        buttonCalendar = findViewById(R.id.buttonCalendar_id);
        textSchdule = findViewById(R.id.textSchudle_id);


        //menu id find
        navigationViewschedule = findViewById(R.id.nav_schedule_nutrition_id);
        drawerLayoutschedule = findViewById(R.id.drawer_schedule_nutrition_id);
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayoutschedule,
                R.string.open, R.string.close);
        drawerLayoutschedule.addDrawerListener(drawerToggle);
        drawerToggle.syncState();


        //menu image find
        menuImg = findViewById(R.id.customschedule_menu_id);
        menuImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayoutschedule.openDrawer(GravityCompat.START);
            }
        });


        //navigation listener
        navigationViewschedule.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {


                    case R.id.schedulenutrition_nav_id:
                        startActivity(new Intent(ScheduleNutrationActivity.this,
                                StatasActivity.class));
                        break;


                    case R.id.scheduleactivity_nav_id:
                        startActivity(new Intent(ScheduleNutrationActivity.this,
                                OverviewActivity.class));
                        break;


                    case R.id.schedulecalendar_nav_id:
                        startActivity(new Intent(ScheduleNutrationActivity.this,
                                StatisticActivity.class));
                        break;


                    case R.id.scheduleaccount_nav_id:
                        startActivity(new Intent(ScheduleNutrationActivity.this,
                                StatsOverviewActivity.class));
                        break;


                    case R.id.schedulesetting_nav_id:
                        startActivity(new Intent(ScheduleNutrationActivity.this,
                                StatsDayActivity.class));

                        break;


                    default:
                        return true;

                }
                drawerLayoutschedule.closeDrawers();
                return true;
                
            }
        });


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
                RecyclerView.HORIZONTAL, false));
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
                        }, year, month, day);

                datePickerDialog.show();

            }
        });

    }

    // this is method using to setStatus bar ... ##
    public void setStatusColor(Activity activity, int colorRsourceId) {
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(activity, colorRsourceId));
    }
}
