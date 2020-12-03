package com.example.orderingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Registor extends AppCompatActivity {

    EditText firstName, lastName, nEmail, nPassword;
    FirebaseAuth fAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registor);
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        nEmail = findViewById(R.id.nEmail);
        nPassword = findViewById(R.id.nPassword);
        fAuth = FirebaseAuth.getInstance();

    }

        public void createAccount (View view){
            String email = nEmail.getText().toString().trim();
            String password = nPassword.getText().toString().trim();

            if (TextUtils.isEmpty(email)) {
                nEmail.setError("Invaild email");
                return;
            }
            if (TextUtils.isEmpty(password)) {
                nEmail.setError("Invaild password");
                return;


            }
            if (password.length() < 5) {
                nEmail.setError("Password must be at least 5 character long");

            } else if (password.length() > 100) {
                nEmail.setError("Password can not be more than character long");
            }

            fAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(Registor.this, "User account Created.", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    } else {
                        Toast.makeText(Registor.this, "Error \n" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }