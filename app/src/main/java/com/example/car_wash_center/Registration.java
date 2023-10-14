package com.example.car_wash_center;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        EditText carNo = (EditText) findViewById(R.id.carno);
        EditText driverName = (EditText) findViewById(R.id.Driverno);
        EditText driverNIC = (EditText) findViewById(R.id.Drivernic);
        EditText phoneNo = (EditText) findViewById(R.id.tp);
        EditText email = (EditText) findViewById(R.id.email);

        Button saveBtn = (Button) findViewById(R.id.save);

        saveBtn.setOnClickListener(v -> {

        });

    }
}