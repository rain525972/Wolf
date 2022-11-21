package com.example.bus00;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginBus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_bus);
    }

    public void succeedLogin_bus(View view) {
        Intent intent = new Intent(this, succeedLoginPage_bus.class);
        startActivity(intent);
    }
}