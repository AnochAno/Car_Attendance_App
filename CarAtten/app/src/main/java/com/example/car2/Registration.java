package com.example.car2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.google.firebase.auth.FirebaseAuth;


public class Registration extends AppCompatActivity {

    private FirebaseAuth auth;
    private EditText carno,Drivername,nic,phone;
    private Button save;
    private TextView loginRedirectText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        auth = FirebaseAuth.getInstance();
        carno = findViewById(R.id.carno);
        Drivername = findViewById(R.id.Drivername);
        nic = findViewById(R.id.nic);
        phone = findViewById(R.id.phone);
        save = findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String carno = carno.getText().toString().trim();
                String Drivername = Drivername.getText().toString().trim();
                String nic = nic.getText().toString().trim();
                String phone = phone.getText().toString().trim();

                if (carno.isEmpty() || Drivername.isEmpty() || nic.isEmpty() || phone.isEmpty()) {
                    Toast.makeText(Registration.this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
                } else {
                    auth.createUserWithEmailAndPassword(carno, Drivername, nic, phone).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(Registration.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(Registration.this, Login.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(Registration.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
              });
    }
}

