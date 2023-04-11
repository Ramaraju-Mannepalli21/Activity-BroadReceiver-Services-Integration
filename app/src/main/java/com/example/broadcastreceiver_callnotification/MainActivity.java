package com.example.broadcastreceiver_callnotification;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public class MainActivity extends AppCompatActivity {

    Button rollDiceBtn, broadCastBtn, ServicesBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollDiceBtn = findViewById(R.id.button);
        broadCastBtn = findViewById(R.id.button2);
        ServicesBtn = findViewById(R.id.button3);

        rollDiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAct();
            }
        });

        broadCastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAct2();
            }
        });

        ServicesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAct3();
            }
        });
    }

    public void openAct(){
        Intent intent = new Intent(this,RollDiceActivity.class);
        startActivity(intent);
    }

    public void openAct2() {
        setContentView(R.layout.activity_broadcast);
    }

    public void openAct3(){
        Intent intent = new Intent(this,ServicesActivity.class);
        startActivity(intent);
    }
}