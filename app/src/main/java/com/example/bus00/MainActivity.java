package com.example.bus00;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainActivity extends AppCompatActivity {

    //public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendBus(View view) {
        Intent intent = new Intent(this, LoginBus.class);
        startActivity(intent);
    }
    public void sendBox(View view) {
        Intent intent = new Intent(this, LoginBox.class);
        startActivity(intent);
    }
    public void sendDriver(View view) {
        Intent intent = new Intent(this, LoginDriver.class);
        startActivity(intent);
    }

    public void sendtest(View view) {
        Intent intent = new Intent(this, Test_load.class);
        startActivity(intent);
    }
}
//EditText editText = (EditText) findViewById(R.id.edit_message);不知道之後需不需要先放著
//String message = editText.getText().toString();
//intent.putExtra(EXTRA_MESSAGE, message);