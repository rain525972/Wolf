package com.example.bus00;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginBox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_box);
    }

    public void succeedLogin_box(View view) {

            Intent intent = new Intent(this, succeedLoginPage_box.class);
            startActivity(intent);

    }
}