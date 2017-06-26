package com.priya.cs.aptronproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AptronProjectGuardian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptron_project_guardian);
        Button b1 = (Button) findViewById(R.id.b2);
        final EditText et2 = (EditText) findViewById(R.id.et2);
        final EditText et3 = (EditText) findViewById(R.id.et3);
        final String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String email = et3.getText().toString().trim();
                if (et2.getText().toString().length() != 10) {
                    et2.setError("Enter a valid phone number");

                }
                if (!(email.matches(emailPattern)))
                    et3.setError("Invalid Email Address");
            }
        });
    }}
