package com.example.broadcastreceiver_callnotification;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServicesActivity extends AppCompatActivity {

    Button b1,b2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        b1 = findViewById(R.id.butn3);//starting the service
        b2 = findViewById(R.id.butn4);// Stopping the Service

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Logic for Starting Service

                Intent i1 = new Intent(ServicesActivity.this,MusicPlayer_Service.class);

                startService(i1);//Service will be started
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(ServicesActivity.this,MusicPlayer_Service.class);
                stopService(i2);   //Stopping the Service
            }
        });
    }
}