package com.example.nutroapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.nutroapp.onboarding_01.OnBoardingAdapter;
import com.example.nutroapp.signup_01.NutroSignUpActivity;
import com.google.android.material.button.MaterialButton;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

public class MainActivity extends AppCompatActivity {

    // declare to pager
    private ViewPager viewPager;
    private ConstraintLayout layout;
    private DotsIndicator indicator;
    private MaterialButton buttonGetStarted;


  /*  // declare to text on boarding.
    private String[] headingsText;
    private String[] descText;


    // declare to image in on boarding.
    private int[] slideImage = {R.drawable.exploreimage, R.drawable.makecircle,
            R.drawable.sharecircle};
    private int[] subSlideImage = {R.drawable.exploreimage, R.drawable.makeimage,
            R.drawable.shareimage};*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         /*   // use for transparent ... ##
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);*/

        // Transparent action bar define .. ##
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow()
                    .getDecorView()
                    .setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }

        setStatusBarColor(this, R.color.white);




        // find view id ... ##
        indicator = (DotsIndicator) findViewById(R.id.indicator_id);
        viewPager = (ViewPager) findViewById(R.id.viewPager_id);
        layout = (ConstraintLayout) findViewById(R.id.constraint_layout_id);
        buttonGetStarted = findViewById(R.id.button_get_started);

        // this is adapter call ... ##
        OnBoardingAdapter adapter = new OnBoardingAdapter(this);
        //adapter set
        viewPager.setAdapter(adapter);
        indicator.setViewPager(viewPager);


        // this is click to button and go to another activity
        buttonGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,
                        NutroSignUpActivity.class));
            }
        });

    }

    // this is method using to setStatus bar ... ##
    public  void setStatusBarColor(Activity activity, int colorResourceID) {
        Window window = activity.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(activity,colorResourceID));
    }
}
