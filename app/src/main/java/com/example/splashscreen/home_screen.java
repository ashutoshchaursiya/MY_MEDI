package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }
    public void medicine_list(View view) {

        Intent intent = new Intent(getApplicationContext(),medicine_ListView.class);
        startActivity(intent);
    }
    public void doctor_list(View view) {

        Intent intent = new Intent(getApplicationContext(),doctor_ListView.class);
        startActivity(intent);
    }
}