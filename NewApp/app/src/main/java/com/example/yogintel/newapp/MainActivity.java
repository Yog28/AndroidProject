package com.example.yogintel.newapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View V){
        Toast t=Toast.makeText(getApplicationContext(),"Clicked on left Button", Toast.LENGTH_LONG);
        t.show();
    }

    public void onButtonRClick(View V){
        Toast t=Toast.makeText(getApplicationContext(),"Clicked on right Button", Toast.LENGTH_LONG);
        t.show();
    }

    public void onClick(View v){
        Intent i=new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(i);
    }
}


