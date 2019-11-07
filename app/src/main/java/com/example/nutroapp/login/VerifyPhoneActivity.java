package com.example.nutroapp.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.nutroapp.R;

public class VerifyPhoneActivity extends AppCompatActivity {

    private Button buttonPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_phone);

        // for use transparent
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        // find view ... #
        buttonPhone = (Button) findViewById(R.id.button_phone_id);
       // set onClcik ... #
        buttonPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(VerifyPhoneActivity.this,
                        VerifyPinNutroActivity.class ));

            }
        });
    }
}
