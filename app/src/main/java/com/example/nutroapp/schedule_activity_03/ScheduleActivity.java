package com.example.nutroapp.schedule_activity_03;

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
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.chivorn.smartmaterialspinner.SmartMaterialSpinner;
import com.example.nutroapp.R;
import com.example.nutroapp.evaolson_social_02.EvaOlsonActivity;
import com.example.nutroapp.exploreactivity_Activity_01.ProfileExploreActivity;
import com.example.nutroapp.exploresecondactivity_activity_02.ExploreChartActivity;
import com.example.nutroapp.profileeva_social_04.ProfileEvaActivity;
import com.example.nutroapp.profilelula_social_03.ProfileLulaActivity;
import com.example.nutroapp.recipes_activity_05.RecipesActivity;
import com.example.nutroapp.recipesweekly_activity_06.RecipesWeeklyActivity;
import com.example.nutroapp.schedulenutrition_activity_04.ScheduleNutrationActivity;
import com.example.nutroapp.todayspecial_social_01.TodayActivity;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ScheduleActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView recyclerViewSchedule;
    private List<ScheduleModel> scheduleModelList;
    private List<ScheduleSecondModel> scheduleSecondModelList;

    Spinner spinner;
    private SpinerAdapter spinerAdapter;
    AppCompatTextView scheduleText;

   /* String month[] = {"January-February","Mearch-April","May-June",
            "July-August","September-Otober",
            "November-December"};
*/

    private SmartMaterialSpinner spProvince;
    private SmartMaterialSpinner spEmptyItem;
    private List<String> provinceList;
    private AppCompatButton  buttonCalendar;

    //drawer component
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigationView;
    AppCompatImageView menuImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_schedule);


        // Transparent action bar define .. ##
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }

        setStatusColor(this,R.color.color_white);

        //find view
        recyclerView =  findViewById(R.id.recycler_participants_id);
        recyclerViewSchedule = (RecyclerView) findViewById(R.id.recyclerSecondSchedule_id);
        spinner = findViewById(R.id.spinner_id);
        buttonCalendar =  findViewById(R.id.calendarView_id);
        scheduleText =  findViewById(R.id.text_schedule_id);

        //menu id find
        navigationView = findViewById(R.id.nav_schedule_id);
        drawerLayout = findViewById(R.id.activityschedule_drawer_id);
        toggle = new ActionBarDrawerToggle(this,drawerLayout,
                R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        //menu image find
        menuImageView = findViewById(R.id.customschedule_menu_id);
        menuImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });


        //navigation listener
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                int id = menuItem.getItemId();

                switch (id){

                    case R.id.nutrition_nav_id:
                        startActivity(new Intent(ScheduleActivity.this,
                                TodayActivity.class));
                        break;

                    case R.id.caldendarid:
                        startActivity(new Intent(ScheduleActivity.this,
                                EvaOlsonActivity.class));
                        break;

                    case R.id.account_nav_id:
                        startActivity(new Intent(ScheduleActivity.this,
                                ProfileLulaActivity.class));
                        break;

                    case R.id.setting_nav_id:
                       startActivity(new Intent(ScheduleActivity.this,
                               ProfileEvaActivity.class));
                        break;

                    default:
                        return true;

                }
                drawerLayout.closeDrawers();
                return true;
            }
        });




        //go to another activity schedule to schedule Nutation ... ##
        scheduleText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScheduleActivity.this,
                        ScheduleNutrationActivity.class));
            }
        });


        //recycler adapter participants ... ##
        ScheduleRecyclerAdapter adapter = new ScheduleRecyclerAdapter(this,
                scheduleModelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,
                RecyclerView.HORIZONTAL, false));
        recyclerView.setAdapter(adapter);


        //recycler adapter  images ... ##
        ScheduleSecondAdapter secondAdapter = new ScheduleSecondAdapter(this,
                scheduleSecondModelList);
        recyclerViewSchedule.setLayoutManager(new LinearLayoutManager(this,
                RecyclerView.HORIZONTAL, false));
        recyclerViewSchedule.setAdapter(secondAdapter);


        // list add to participants data ... ##
        List<ScheduleModel> list = new ArrayList<>();
        list.add(new ScheduleModel(R.drawable.circle_image_eva_olson));
        list.add(new ScheduleModel(R.drawable.circle_image_eva_olson));
        list.add(new ScheduleModel(R.drawable.circle_image_eva_olson));
        list.add(new ScheduleModel(R.drawable.circle_image_eva_olson));
        list.add(new ScheduleModel(R.drawable.circle_image_eva_olson));
        list.add(new ScheduleModel(R.drawable.circle_image_eva_olson));
        list.add(new ScheduleModel(R.drawable.circle_image_eva_olson));
        list.add(new ScheduleModel(R.drawable.circle_image_eva_olson));
        list.add(new ScheduleModel(R.drawable.circle_image_eva_olson));
        list.add(new ScheduleModel(R.drawable.circle_image_eva_olson));

        // list add to participants data set adapter...... ##
        ScheduleRecyclerAdapter recyclerAdapter = new ScheduleRecyclerAdapter(this, list);
        recyclerView.setAdapter(recyclerAdapter);

        // list add to image data ... ##
        List<ScheduleSecondModel> secondModelList = new ArrayList<>();
        secondModelList.add(new ScheduleSecondModel(R.drawable.icon_plums_120));
        secondModelList.add(new ScheduleSecondModel(R.drawable.icon_donats_90));
        secondModelList.add(new ScheduleSecondModel(R.drawable.icon_plums_120));
        secondModelList.add(new ScheduleSecondModel(R.drawable.icon_donats_90));
        secondModelList.add(new ScheduleSecondModel(R.drawable.icon_plums_120));
        secondModelList.add(new ScheduleSecondModel(R.drawable.icon_donats_90));
        secondModelList.add(new ScheduleSecondModel(R.drawable.icon_plums_120));
        secondModelList.add(new ScheduleSecondModel(R.drawable.icon_donats_90));

        //list add to image adapter ... ##
        ScheduleSecondAdapter scheduleSecondAdapter = new ScheduleSecondAdapter(this,
                secondModelList);
        recyclerViewSchedule.setAdapter(scheduleSecondAdapter);






         // this is spinner part.. ##
        MonthModel[] monthModels = new MonthModel[6];

        monthModels[0] = new MonthModel();
        monthModels[0].setId(1);
        monthModels[0].setMonthName("January-February");

        monthModels[1] = new MonthModel();
        monthModels[1].setId(2);
        monthModels[1].setMonthName("March-April");

        monthModels[2] = new MonthModel();
        monthModels[2].setId(3);
        monthModels[2].setMonthName("May-June");

        monthModels[3] = new MonthModel();
        monthModels[3].setId(4);
        monthModels[3].setMonthName("July-August");

        monthModels[4] = new MonthModel();
        monthModels[4].setId(5);
        monthModels[4].setMonthName("September-October");

        monthModels[5] = new MonthModel();
        monthModels[5].setId(6);
        monthModels[5].setMonthName("November-December");

        //set a spinner adapter ... ##
        spinerAdapter = new SpinerAdapter(ScheduleActivity.this, android.R.layout.
                simple_spinner_dropdown_item, monthModels);
        spinner.setAdapter(spinerAdapter);

        //spinner set to listner ... ##
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView,
                                       View view, int position, long l) {

                MonthModel monthModel = spinerAdapter.getItem(position);
               /* Toast.makeText(ScheduleActivity.this,
                        "Id: " + monthModel.getId() + " \nname: " +
                        monthModel.getMonthName(), Toast.LENGTH_SHORT).show();*/
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
        buttonCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DatePickerDialog datePickerDialog = new DatePickerDialog
                        (ScheduleActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth)
                    {

                    }
                },year,month,day);

                datePickerDialog.show();

            }
        });


    }

    // this is method using to setStatus bar ... ##
    public void setStatusColor(Activity activity, int colorResourceId){
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,colorResourceId));
    }


}
