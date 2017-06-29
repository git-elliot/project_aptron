package com.developers.droidteam.merisafety;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.RequiresPermission;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Toast.makeText(this, "Click on Medical to see verification page", Toast.LENGTH_LONG).show();
    }

   /* public void fun(View v)
    {
        if(R.id.medical==v.getId()){

            MedicalHelp mh = new MedicalHelp(HomeScreenActivity.this);
        }

    }*/
}
//tools:context="com.priya.cs.aptronproject.aptron_project_signup">
/*
class MedicalHelp {

    public MedicalHelp(HomeScreenActivity homescreenActivity) {

        Intent i = new Intent(homescreenActivity.getApplicationContext(),VerificationActivity.class);
        homescreenActivity.startActivity(i);
    }
}*/