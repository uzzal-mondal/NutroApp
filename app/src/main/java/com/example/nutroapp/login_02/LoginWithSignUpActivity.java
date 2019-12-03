package com.example.nutroapp.login_02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nutroapp.R;
import com.example.nutroapp.signup_01.CreateAcountActivity;

public class LoginWithSignUpActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textLogin ;
    private AppCompatTextView textcreateacc;
    private ImageView profileImage;
    private AppCompatImageView backImage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_with_sign_up);

        // Transparent action bar define .. ##
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow()
                    .getDecorView()
                    .setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }

        setStatusBarColor(this, R.color.color_white);

        // find id ... ##
        profileImage = findViewById(R.id.profile_image_id);
        textLogin = findViewById(R.id.textLogin_id);
        textcreateacc = findViewById(R.id.textCreateAccount);
        backImage = findViewById(R.id.imagebackcreate_id);
        backImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             onBackPressed();
            }
        });



        //listner ... ##
        profileImage.setOnClickListener(this);
        textLogin.setOnClickListener(this);
        textcreateacc.setOnClickListener(this);

    }
    // set status color ... ##
    public void setStatusBarColor(Activity activity ,  int colorResourceId){

        Window window = activity.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(
                ContextCompat.getColor(activity,colorResourceId)
        );
    }

    // go to another activity to use onClick ... ##
    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.textLogin_id){
            startActivity(new Intent(LoginWithSignUpActivity.this,
                    LoginActivity.class));
        }else if(view.getId() == R.id.textCreateAccount){
            startActivity(new Intent(LoginWithSignUpActivity.this,
                    CreateAcountActivity.class));
        }






    }
}
