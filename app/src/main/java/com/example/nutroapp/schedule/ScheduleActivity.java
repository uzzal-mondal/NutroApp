package com.example.nutroapp.schedule;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.chivorn.smartmaterialspinner.SmartMaterialSpinner;
import com.example.nutroapp.MainActivity;
import com.example.nutroapp.R;
import com.jaredrummler.materialspinner.MaterialSpinner;

import java.util.ArrayList;
import java.util.List;

public class ScheduleActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView recyclerViewSchedule;
    private List<ScheduleModel> scheduleModelList;
    private List<ScheduleSecondModel> scheduleSecondModelList;

    Spinner spinner;
    private SpinerAdapter spinerAdapter;

   /* String month[] = {"January-February","Mearch-April","May-June",
            "July-August","September-Otober",
            "November-December"};
*/

    private SmartMaterialSpinner spProvince;
    private SmartMaterialSpinner spEmptyItem;
    private List<String> provinceList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);


        // use for transparent ... #
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        //find view
        recyclerView = (RecyclerView) findViewById(R.id.recycler_participants_id);
        recyclerViewSchedule = (RecyclerView) findViewById(R.id.recyclerSecondSchedule_id);
        spinner =  findViewById(R.id.spinner_id);

        //recycler adapter participants ...#
        ScheduleRecyclerAdapter adapter = new ScheduleRecyclerAdapter(this,
                scheduleModelList);
         recyclerView.setLayoutManager(new LinearLayoutManager(this,
                RecyclerView.HORIZONTAL,false));
         recyclerView.setAdapter(adapter);


        //recycler adapter  images ...#
        ScheduleSecondAdapter secondAdapter = new ScheduleSecondAdapter(this,
                scheduleSecondModelList);
        recyclerViewSchedule.setLayoutManager(new LinearLayoutManager(this,
                RecyclerView.HORIZONTAL,false));
        recyclerViewSchedule.setAdapter(secondAdapter);


        // list add to participants data ...#
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

        // list add to participants data set adapter  ...#
        ScheduleRecyclerAdapter recyclerAdapter = new ScheduleRecyclerAdapter(this,list);
        recyclerView.setAdapter(recyclerAdapter);


        // list add to image data ...#
        List<ScheduleSecondModel> secondModelList = new ArrayList<>();
        secondModelList.add(new ScheduleSecondModel(R.drawable.icon_plums_120));
        secondModelList.add(new ScheduleSecondModel(R.drawable.icon_donats_90));
        secondModelList.add(new ScheduleSecondModel(R.drawable.icon_plums_120));
        secondModelList.add(new ScheduleSecondModel(R.drawable.icon_donats_90));
        secondModelList.add(new ScheduleSecondModel(R.drawable.icon_plums_120));
        secondModelList.add(new ScheduleSecondModel(R.drawable.icon_donats_90));
        secondModelList.add(new ScheduleSecondModel(R.drawable.icon_plums_120));
        secondModelList.add(new ScheduleSecondModel(R.drawable.icon_donats_90));

        //list add to image adapter ...#
        ScheduleSecondAdapter scheduleSecondAdapter = new ScheduleSecondAdapter(this,
                secondModelList);
        recyclerViewSchedule.setAdapter(scheduleSecondAdapter);



/*
        SpinerAdapter spinerAdapter = new SpinerAdapter(this,month);
        spinner.setAdapter(spinerAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(ScheduleActivity.this, ""
                        +month[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });*/


      Month[] months = new Month[6];

       /* months[0] = new Month();
        months[0].setId(1);
        months[0].setMonth("January - February");

        months[1] = new Month();
        months[1].setId(2);
        months[1].setMonth("Mearch - April");*/


      months[0].setMonth("January-February");
      months[1].setMonth("March-April");
      months[2].setMonth("May-June");
      months[3].setMonth("July-August");
      months[4].setMonth("September-October");
      months[5].setMonth("November-December");


      spinerAdapter = new SpinerAdapter(ScheduleActivity.this, android.R.layout.
              simple_spinner_item,months);

      spinner = findViewById(R.id.spinner_id);
      spinner.setAdapter(spinerAdapter);

      spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
          @Override
          public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

              Month month = spinerAdapter.getItem(position);
             Toast.makeText(ScheduleActivity.this,"Id: "+month.getId()+" \nname: "+
                     month.getMonth(),  Toast.LENGTH_SHORT).show();
          }

          @Override
          public void onNothingSelected(AdapterView<?> adapterView) {

          }
      });




    }



}
