package com.example.bus00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class succeedLoginPage_driver extends AppCompatActivity {
    Connection connect;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_succeed_login_page_driver);
        TextView tv_id = (TextView) findViewById(R.id.tv_id);
        TextView tv_name = (TextView) findViewById(R.id.tv_name);
        TextView tv_place = (TextView) findViewById(R.id.tv_place);
        TextView tv_s = (TextView) findViewById(R.id.tv_s);
        Button btnconnect=(Button) findViewById(R.id.button);

        btnconnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConnectionHelper connectionHelper = new ConnectionHelper();
                connect = connectionHelper.conclass();
                if(connectionHelper !=null){
                    try {
                        String query = "Select * from StudentInfo_Tab where StudentID = 1";
                        Statement statement = connect.createStatement();
                        ResultSet resultSet = statement.executeQuery(query);
                        while (resultSet.next()) {
                            tv_id.setText(resultSet.getString(1));
                            tv_name.setText(resultSet.getString(2));
                            tv_place.setText(resultSet.getString(3));
                            tv_s.setText(resultSet.getString(5));
                        }
                        connect.close();
                    }
                    catch (Exception e){
                        Log.e("Error: ",e.getMessage());
                    }
                }

            }
        });

    }

}