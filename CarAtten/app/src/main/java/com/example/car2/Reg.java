package com.example.car2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class Reg extends AppCompatActivity {

    private FirebaseAuth auth;
    private EditText carno,Drivername,nic,phone;
    private Button save;
    private TextView loginRedirectText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reg);

        auth = FirebaseAuth.getInstance();
        carno = findViewById(R.id.carno);
        Drivername = findViewById(R.id.drivername);

    }
}