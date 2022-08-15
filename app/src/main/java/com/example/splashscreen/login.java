package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        btn=(Button)findViewById(R.id.btnnextlogin);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),home_screen.class);
                startActivity(intent);
            }
        });

    }

    public void signup(View view) {

        Intent intent = new Intent(getApplicationContext(),signup.class);
        startActivity(intent);
    }
}