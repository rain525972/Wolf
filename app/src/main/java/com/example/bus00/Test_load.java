package com.example.bus00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.List;
import java.util.Map;

public class Test_load extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_load);
    }
    SimpleAdapter ad;

    public  void GetData(View v)
    {
        ListView Istview=(ListView) findViewById(R.id.listview1);

        List<Map<String, String>> MyDataList=null;
        ListItem MyData = new ListItem();
        MyDataList = MyData.getlist();

        String[] Fromw= {"StudentID","StudentName","Address","Age"};
        int[] Tow={R.id.StudentID,R.id.StudentName,R.id.Address,R.id.Age};
        ad= new SimpleAdapter(Test_load.this,MyDataList,R.layout.listlayout,Fromw,Tow);
        Istview.setAdapter(ad);

    }
}