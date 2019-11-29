package com.example.nutroapp.profileeva_social_04;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nutroapp.R;
import com.example.nutroapp.dietaryhardinge_social_05.DietaryHardingeActivity;
import com.example.nutroapp.freshforse_social_06.FreshForseActivity;
import com.example.nutroapp.schedule_activity_03.ScheduleActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

import java.util.ArrayList;
import java.util.List;

public class ProfileEvaActivity extends AppCompatActivity {


    private RecyclerView recyclerViewPro;
    private List<ProfileItemModel> profileItemModelList;
    private TextView textViewEvaOlson;
    private ViewPager viewPager;
    private DotsIndicator indicator;

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_eva);

        // Transparent action bar define .. ##
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow()
                    .getDecorView()
                    .setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setStatusBarColor(this,R.color.color_white);

       /* // use for transparent ... #
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);*/


        // this is for find all view ...##
        textViewEvaOlson = findViewById(R.id.text_main_eva_olson_id);
        recyclerViewPro = findViewById(R.id.recyclerView_pro_eva_id);
        viewPager = findViewById(R.id.viewPagerRecent_id);
        indicator = findViewById(R.id.inidicator_recent_id);
        bottomNavigationView = findViewById(R.id.bottom_menu_nav_id);


        // bottom navigation listener.. ##
        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem menuItem) {

                int id = menuItem.getItemId();

                switch (id){

                    case R.id.home_bottom_id:
                        startActivity(new Intent(ProfileEvaActivity.this,
                                ProfileEvaActivity.class));
                        break;

                    case R.id.search_bottom_id:
                        startActivity(new Intent(ProfileEvaActivity.this,
                                DietaryHardingeActivity.class));
                        break;


                    case R.id.calendar_bottom_id:
                       startActivity(new Intent(ProfileEvaActivity.this,
                               FreshForseActivity.class));
                        break;



                    case R.id.wish_bottom_id:
                        Toast.makeText(ProfileEvaActivity.this, "Wishlest",
                                Toast.LENGTH_SHORT).show();

                        break;

                }



            }


        });


        // go to schedule activity ...##
        textViewEvaOlson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(ProfileEvaActivity.this,
                        DietaryHardingeActivity.class));
            }
        });




        // paritcipants profileModel List add to ArrayList ...##
        profileItemModelList = new ArrayList<>();
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_olson_1));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_olson_2));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_ollson_3));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_olson_2));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_olson_1));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_ollson_3));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_olson_2));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_olson_1));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_ollson_3));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_olson_1));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_olson_2));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_ollson_3));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_olson_2));
        profileItemModelList.add(new ProfileItemModel(R.drawable.profile_eva_olson_1));

        // recycler adapter set ...
        ProfileRecyclerAdapter adapter = new ProfileRecyclerAdapter(this,
                profileItemModelList);
        recyclerViewPro.setLayoutManager(new LinearLayoutManager(this,
                RecyclerView.HORIZONTAL,false));
        recyclerViewPro.setAdapter(adapter);




    }

    public void setStatusBarColor(Activity activity, int colorResourceId){

        Window window = activity.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(activity,colorResourceId));

    }

}
