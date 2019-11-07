package com.example.nutroapp.splashscreen;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nutroapp.MainActivity;
import com.example.nutroapp.R;
import com.example.nutroapp.signup.NutroSignUpActivity;

public class SplashScreenActivity extends AppCompatActivity {


    private TextView textSplash,textNutro;
    private ImageView imageSplash;
    ConstraintLayout constraintLayout;

    Thread splashThread;
   // private static int SPLASH_COUNT = 2000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        ActionBar myActionBar = getSupportActionBar();
        //find view
        textSplash = (TextView) findViewById(R.id.textNutro_id);
        textNutro = (TextView) findViewById(R.id.textNutro_sub_id);
        imageSplash = (ImageView) findViewById(R.id.imageNutro_id);
        constraintLayout = findViewById(R.id.constraint_layout_id);

       // animation create.
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        imageSplash.startAnimation(animation);
        textSplash.startAnimation(animation);
        textNutro.startAnimation(animation);
/*
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.push_down);
        imageSplash.startAnimation(animation);
*/
       /* Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.push_right);
        textSplash.startAnimation(animation1);
        textNutro.startAnimation(animation1);*/


        final Intent i = new Intent(this, MainActivity.class);

        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();


       /* imageSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (view.getId()){

                    case R.id.imageNutro_id:
                        imageSplash.startAnimation(AnimationUtils
                                .loadAnimation(getApplicationContext()
                                ,R.anim.fade_in));
                }
            }
        });

        Thread myThread = new Thread(){


            @Override
            public void run() {

                try {

                    sleep(1000);
                    startActivity(new Intent(SplashScreenActivity.this,
                            MainActivity.class));
                    SplashScreenActivity.this.finish();

                }catch (Exception e){

                    e.printStackTrace();

                }

                SplashScreenActivity.this.finish();
            }
        };

        myThread.start();*/








    }
}
