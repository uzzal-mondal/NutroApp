package com.example.nutroapp.login_02;

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

public class SuccessAcountActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonContinue;
    TextView textSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_acount);


        // Transparent action bar define .. ##
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow()
                    .getDecorView()
                    .setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }

        setStatusBarColor(this,R.color.color_account);

        // find view ... ##
        buttonContinue = findViewById(R.id.buttonContinue_id);
        textSignIn = findViewById(R.id.text_signin_id);

        textSignIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.buttonContinue_id){
            startActivity(new Intent(SuccessAcountActivity.this,LoginActivity.class));
        }

       else if (view.getId() == R.id.text_signin_id ){
            startActivity(new Intent(SuccessAcountActivity.this,LoginActivity.class));
        }

    }

    public void setStatusBarColor(Activity activity, int colorResourceId){

        Window window = activity.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(activity,colorResourceId));
    }
}
