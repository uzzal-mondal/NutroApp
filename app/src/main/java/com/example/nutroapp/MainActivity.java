package com.example.nutroapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.nutroapp.onboarding.OnBoardingAdapter;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

public class MainActivity extends AppCompatActivity {

    // declare to pager
    private ViewPager viewPager;
    private ConstraintLayout layout;
    private DotsIndicator indicator;


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
       /* Window g = getWindow();
        g.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION,
                WindowManager.LayoutParams.TYPE_STATUS_BAR);*/
        setContentView(R.layout.activity_main);

       /* // heading text..
        headingsText = getResources().getStringArray(R.array.headings);
        descText = getResources().getStringArray(R.array.desc);*/
        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){

            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }*/



        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

         // find view id
        indicator = (DotsIndicator) findViewById(R.id.indicator_id);
        viewPager = (ViewPager) findViewById(R.id.viewPager_id);
        layout = (ConstraintLayout) findViewById(R.id.constraint_layout_id);
        // this is adapter call
        OnBoardingAdapter adapter = new OnBoardingAdapter(this);
        //adapter set
        viewPager.setAdapter(adapter);
        indicator.setViewPager(viewPager);






    }
}
