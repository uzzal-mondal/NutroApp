package com.example.nutroapp.profileeva_social_04;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
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

public class ProfileEvaActivity extends AppCompatActivity implements View.OnClickListener {
    private BottomNavigationView bottomNavigationView;
    private AppCompatImageView imageViewBack;


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

        setStatusBar(this, R.color.color_white);
        imageViewBack = findViewById(R.id.menuback_id);
        imageViewBack.setOnClickListener(this);

        loadFragment(new FragmentHomeEva());


        // bottom navigation fragment in android ... ##
        bottomNavigationView = findViewById(R.id.bottom_navigation_id);
        loadFragment(new FragmentHomeEva());

        // bottom navigation listener.. ##
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment;
                int id = menuItem.getItemId();

                switch (id) {

                    case R.id.home_bottom_item:
                        fragment = new FragmentHomeEva();
                        loadFragment(fragment);
                        break;

                    case R.id.search_bottom_item:
                        fragment = new FragmentSearchFresh();
                        loadFragment(fragment);
                        break;

                    case R.id.calendar_bottom_item:
                        fragment = new FragmentCalendarHardiange();
                        loadFragment(fragment);
                        break;


                    case R.id.wish_bottom_item:
                        fragment = new FragmentWishToday();
                        loadFragment(fragment);

                        break;

                }

                return true;
            }
        });


    }

    // this is method using to setStatus bar ... ##
    public void setStatusBar(Activity activity, int colorResourceId) {

        Window window = activity.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(activity, colorResourceId));
    }

    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        //transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.menuback_id:
                finish();
                break;
        }

    }
}
