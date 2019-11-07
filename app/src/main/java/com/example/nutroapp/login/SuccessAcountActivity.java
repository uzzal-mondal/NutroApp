package com.example.nutroapp.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

        // use for transparent ... #
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

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
}
