package com.acadgild.siddharth.merisafety;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText e1 = (EditText)findViewById(R.id.e1);
        final EditText e2 = (EditText)findViewById(R.id.e2);
        Button b1  = (Button)findViewById(R.id.b1);
        TextView t1 = (TextView)findViewById(R.id.tv4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().trim().equals("")){
                    e1.setError("please enter your phone number.");
                }
                if(e2.getText().toString().trim().equals("")){
                    e2.setError("please enter your password.");
                }
                if((e1.getText().toString().equals(getIntent().getStringExtra("phone")))&&((e2.getText().toString().equals(getIntent().getStringExtra("password"))))){
                    Intent i = new Intent(Login.this,Main2Activity.class);
                    startActivity(i);
                }
                if(!(e1.getText().toString().equals(getIntent().getStringExtra("phone")))&&(!(e2.getText().toString().equals(getIntent().getStringExtra("password"))))){
                    Toast.makeText(Login.this, "please enter correct field", Toast.LENGTH_SHORT).show();
                }
                if(!(e1.getText().toString().equals(getIntent().getStringExtra("phone")))||(!(e2.getText().toString().equals(getIntent().getStringExtra("password"))))){
                    Toast.makeText(Login.this, "please enter correct field", Toast.LENGTH_SHORT).show();
                }
            }

        });


    }
    public void sign(View v){
        Intent i = new Intent(this,SignUp.class);
        startActivity(i);
    }
}
