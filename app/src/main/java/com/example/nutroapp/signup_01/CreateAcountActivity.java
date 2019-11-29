package com.example.nutroapp.signup_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import com.example.nutroapp.R;
import com.example.nutroapp.login_02.LoginActivity;

public class CreateAcountActivity extends AppCompatActivity {

    private Button buttonCreateAccount;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_acount);

        // Transparent action bar define .. ##
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setStatusBarcolor(this,R.color.color_white);


       /* toolbar = findViewById(R.id.customToolbar_back_id);
        setSupportActionBar(toolbar);*/


        buttonCreateAccount =  findViewById(R.id.button_get_id);
        buttonCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CreateAcountActivity.this,
                        LoginActivity.class));
            }
        });

    }
    // this is method using to setStatus bar ... ##
    public void setStatusBarcolor(Activity activity, int colorResourceId){
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,colorResourceId));


    }


}
