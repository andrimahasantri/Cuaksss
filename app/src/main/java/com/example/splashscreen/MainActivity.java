package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

        private int waktu_loading=4000;
//    4000=4 detik


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent activityhome = new Intent(MainActivity.this,activity_home.class);
                startActivity(activityhome);
                finish();
            }
        },waktu_loading);
    }
}