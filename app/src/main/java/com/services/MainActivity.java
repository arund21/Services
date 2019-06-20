package com.services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import service.MyService;

public class MainActivity extends AppCompatActivity {
    private Button startService, stopService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startService = findViewById(R.id.startService);
        stopService = findViewById(R.id.stopService);

        startService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startMyservice();
            }
        });
        stopService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopMyService();
            }
        });
    }
    private void startMyservice(){
        startService(new Intent(this, MyService.class));
    }
    private void stopMyService(){
        stopService(new Intent(this, MyService.class));
    }
}
