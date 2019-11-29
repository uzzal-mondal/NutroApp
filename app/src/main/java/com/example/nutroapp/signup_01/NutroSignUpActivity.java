package com.example.nutroapp.signup_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.nutroapp.R;
import com.example.nutroapp.login_02.LoginActivity;
import com.example.nutroapp.login_02.LoginWithSignUpActivity;

public class NutroSignUpActivity extends AppCompatActivity implements View.OnClickListener {


    private Button buttonSignUp;
    private TextView textViewAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutro_sign_up);

        // Transparent action bar define .. ##
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow()
                    .getDecorView()
                    .setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }

        setStatusBarColor(this, R.color.white);

      /*  // use for transparent ... #
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);*/


        // find view
        buttonSignUp = (Button) findViewById(R.id.buttonSignUp_id);
        textViewAccount = (TextView) findViewById(R.id.textAccount_id);

        buttonSignUp.setOnClickListener(this);
        textViewAccount.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.buttonSignUp_id){
            startActivity(new Intent(NutroSignUpActivity.this,
                    LoginWithSignUpActivity.class));
        } else if (view.getId() == R.id.textAccount_id){
            startActivity(new Intent(NutroSignUpActivity.this, LoginActivity.class));
        }
    }
    // this is method using to setStatus bar ... ##
    public void setStatusBarColor(Activity activity, int colorResourceID) {
        Window window = activity.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

        window.setStatusBarColor(ContextCompat.getColor(activity,colorResourceID));
    }


}
