package com.example.nutroapp.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nutroapp.R;
import com.example.nutroapp.signup.CreateAcountActivity;

public class LoginWithSignUpActivity extends AppCompatActivity {

    private TextView textCreateAccount ;
    ImageView imageAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_with_sign_up);

        // use for transparent ... #
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        // view find ...
        //imageAccount = (ImageView) findViewById(R.id.profile_image);
        textCreateAccount = (TextView) findViewById(R.id.textCreateAccount);

        // go to Create account profile ...
        textCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(LoginWithSignUpActivity.this,
                        CreateAcountActivity.class));
            }
        });






    }
}
