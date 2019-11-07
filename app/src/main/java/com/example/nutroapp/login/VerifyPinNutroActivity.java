package com.example.nutroapp.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.nutroapp.R;

public class VerifyPinNutroActivity extends AppCompatActivity {

    private Button buttonPin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_pin_nutro);

        buttonPin = (Button) findViewById(R.id.button_continue_pin_id);


        buttonPin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VerifyPinNutroActivity.
                        this,SuccessAcountActivity.class));
            }
        });
    }
}
