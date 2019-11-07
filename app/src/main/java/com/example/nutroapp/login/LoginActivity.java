package com.example.nutroapp.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.nutroapp.R;
import com.example.nutroapp.exploreactivity.ProfileExploreActivity;
import com.example.nutroapp.profilelula.ProfileLulaActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView textPass;
    private Button buttonLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // use for transparent ... #
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        // view find
        textPass = (TextView) findViewById(R.id.textForgotPass_id);
        buttonLogin = (Button) findViewById(R.id.button_login_id) ;
        //setOnClick listner
        textPass.setOnClickListener(this);
        buttonLogin.setOnClickListener(this);

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


    }
}
