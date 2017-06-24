package com.developers.creators.paras.aptronprojectsafetyapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.RequiresPermission;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomescreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
        Toast.makeText(this, "Click on Medical to see verification page", Toast.LENGTH_LONG).show();
    }

    public void fun(View v)
    {
        if(R.id.medical==v.getId()){
            
            MedicalHelp mh = new MedicalHelp(HomescreenActivity.this);
        }

    }
}

class MedicalHelp {

    public MedicalHelp(HomescreenActivity homescreenActivity) {

        Intent i = new Intent(homescreenActivity.getApplicationContext(),VerificationActivity.class);
        homescreenActivity.startActivity(i);
    }
}