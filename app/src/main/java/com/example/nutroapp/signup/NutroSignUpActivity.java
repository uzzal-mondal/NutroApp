package com.example.nutroapp.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.nutroapp.R;
import com.example.nutroapp.login.LoginActivity;
import com.example.nutroapp.login.LoginWithSignUpActivity;

public class NutroSignUpActivity extends AppCompatActivity implements View.OnClickListener {


    private Button buttonSignUp;
    private TextView textViewAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutro_sign_up);

        // use for transparent ... #
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


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
}
