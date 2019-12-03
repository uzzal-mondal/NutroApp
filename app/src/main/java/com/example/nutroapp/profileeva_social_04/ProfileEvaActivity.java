package com.example.nutroapp.profileeva_social_04;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.nutroapp.R;
import com.example.nutroapp.profileeva_social_04.fragmentcalendarhardiange.FragmentCalendarHardiange;
import com.example.nutroapp.profileeva_social_04.fragmenthomeeva.FragmentHomeEva;
import com.example.nutroapp.profileeva_social_04.fragmenthomeeva.ProfileItemModel;
import com.example.nutroapp.profileeva_social_04.fragmentsearchfresh.FragmentSearchFresh;
import com.example.nutroapp.profileeva_social_04.fragmenttodaywish.FragmentWishToday;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

import java.util.List;

public class ProfileEvaActivity extends AppCompatActivity {


    private RecyclerView recyclerViewPro;
    private List<ProfileItemModel> profileItemModelList;
    private TextView textViewEvaOlson;
    private ViewPager viewPager;
    private DotsIndicator indicator;
    private BottomNavigationView bottomNavigationView;
    private AppCompatImageView backtoomenuimage;



     FragmentManager fragmentManager;
     FragmentTransaction ft;



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

        setStatusBar(this,R.color.color_white);


       // fragment home declare... ##
        fragmentManager = getSupportFragmentManager();
        ft = fragmentManager.beginTransaction();
        FragmentHomeEva fragmentHomeEva = new FragmentHomeEva();
        ft.add(R.id.fragment_container, fragmentHomeEva);
        ft.addToBackStack(null);
        ft.commit();


        //fragment search .. ##
        fragmentManager = getSupportFragmentManager();
        ft = fragmentManager.beginTransaction();
        FragmentSearchFresh fragmentSearchFresh = new FragmentSearchFresh();
        ft.replace(R.id.fragment_container,fragmentSearchFresh);
        ft.addToBackStack(null);
        ft.commit();



        // fragment calendar hardiange .. ##
        fragmentManager = getSupportFragmentManager();
        ft = fragmentManager.beginTransaction();
        FragmentCalendarHardiange calendarHardiange = new FragmentCalendarHardiange();
        ft.replace(R.id.fragment_container,calendarHardiange);
        ft.addToBackStack(null);
        ft.commit();



        //fragment wish list ... ##
        fragmentManager = getSupportFragmentManager();
        ft = fragmentManager.beginTransaction();
        FragmentWishToday fragmentWishToday = new FragmentWishToday();
        ft.replace(R.id.fragment_container,fragmentWishToday);
        ft.addToBackStack(null);
        ft.commit();



        // bottom navigation fragment in android ... ##
        bottomNavigationView = findViewById(R.id.bottom_navigation_id);
        loadFragment(new FragmentHomeEva());

        // bottom navigation listener.. ##
       bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
               Fragment fragment;
               int id = menuItem.getItemId();

              switch (id){

                  case R.id.home_bottom_item:
                      fragment = new FragmentHomeEva();
                      loadFragment(fragment);
                      return true;


                  case R.id.search_bottom_item:
                      fragment = new FragmentSearchFresh();
                      loadFragment(fragment);
                      return  true;

                  case R.id.calendar_bottom_item:

                      fragment = new FragmentCalendarHardiange();
                      loadFragment(fragment);
                      return true;


                  case R.id.wish_bottom_item:
                      fragment = new FragmentWishToday();
                      loadFragment(fragment);
                      return true;

              }

               return false;
           }
       });




         /* toolbar = getSupportActionBar();
        // load the store fragment by default.
         loadFragment(new FragmentHomeEva());




        // Transparent action bar define .. ##
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow()
                    .getDecorView()
                    .setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setStatusBarColor(this, R.color.color_white);

       *//* // use for transparent ... #
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);*//*




        // this is for find all view ...##
        textViewEvaOlson = findViewById(R.id.text_main_eva_olson_id);
        recyclerViewPro = findViewById(R.id.recyclerView_pro_eva_id);
        viewPager = findViewById(R.id.viewPagerRecent_id);
        indicator = findViewById(R.id.inidicator_recent_id);

        backtoomenuimage = findViewById(R.id.menuback_id);
        backtoomenuimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        // fragment default to set a Home Activity.. ##

       *//* if (savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new FragmentHome())
                    .commit();

        }*//*


        // bottom navigation listener.. ##
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView
                .OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment;
                int id = menuItem.getItemId();


                switch (id) {
                    case R.id.home_bottom_item:
                        fragment = new FragmentHomeEva();
                        loadFragment(fragment);
                        return true;


                    case R.id.search_bottom_item:
                        fragment = new FragmentSearchFresh();
                        loadFragment(fragment);
                      return  true;

                    case R.id.calendar_bottom_item:

                        fragment = new FragmentCalendarHardiange();
                         loadFragment(fragment);
                        return true;


                    case R.id.wish_bottom_item:
                        fragment = new FragmentWishToday();
                        loadFragment(fragment);
                        return true;


                }

                return false;

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
                RecyclerView.HORIZONTAL, false));
        recyclerViewPro.setAdapter(adapter);


    }

    public void setStatusBarColor(Activity activity, int colorResourceId) {

        Window window = activity.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(activity, colorResourceId));

    }

    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }*/

    }

    // this is method using to setStatus bar ... ##
    public void setStatusBar(Activity activity, int colorResourceId){

        Window window = activity.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(activity,colorResourceId));
    }

    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}
