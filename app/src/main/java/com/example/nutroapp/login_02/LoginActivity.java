package com.example.nutroapp.login_02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;


import com.example.nutroapp.R;
import com.example.nutroapp.exploreactivity_Activity_01.ProfileExploreActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView textPass;
    private Button buttonLogin;

    private AppCompatImageView toolbarimage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


           /* // use for transparent ... #
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);*/


        // Transparent action bar define .. ##
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow()
                    .getDecorView()
                    .setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setStatusBarcolor(this,R.color.color_login_bg);



        // view find
        textPass = (TextView) findViewById(R.id.textForgotPass_id);
        buttonLogin = (Button) findViewById(R.id.button_login_id) ;
        toolbarimage = findViewById(R.id.imagelogintoolbar_id);
        //setOnClick listner
        textPass.setOnClickListener(this);
        buttonLogin.setOnClickListener(this);


        //back toolbar codding.
        toolbarimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();
            }
        });



      //  Toolbar toolbar = findViewById(R.id.customToolbar_color_back_id);
       // toolbar.setNavigationIcon(R.drawable.back_arrow_page_white);

       // getActionBar().setDisplayShowHomeEnabled(true);
       // getActionBar().setDisplayHomeAsUpEnabled(true);



    }


    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.textForgotPass_id){
            startActivity(new Intent(LoginActivity.this,
                    VerifyPhoneActivity.class));
        }
        else if (view.getId() == R.id.button_login_id){
            startActivity(new Intent(LoginActivity.this,
                    ProfileExploreActivity.class));
        }



       /* // back button create ... ##
        if (getActionBar() != null){
            getActionBar().setDisplayHomeAsUpEnabled(true);
            getActionBar().setDisplayShowHomeEnabled(true);
        }*/




    }

    // this is method using to setStatus bar ... ##
    public void setStatusBarcolor(Activity activity, int colorResourceId){
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,colorResourceId));


    }


}
