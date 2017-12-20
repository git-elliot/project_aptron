package com.acadgild.siddharth.merisafety;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_new);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        FragHome obj = new FragHome();
        ft.add(R.id.newfraglayout,obj,"homepage");
        ft.commit();


        Button btn = (Button)findViewById(R.id.guar_details);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this,FragGuardian.class);
                startActivity(i);
            }
        });
        Button setting = (Button) findViewById(R.id.settings);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                FragSettings obj = new FragSettings();
                ft.replace(R.id.newfraglayout,obj,"setting");
                ft.commit();

            }
        });
        Button help = (Button) findViewById(R.id.nearby_help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                FragHelp obj = new FragHelp();
                ft.replace(R.id.newfraglayout,obj,"help");
                ft.commit();
            }
        });
        Button guardian = (Button)findViewById(R.id.guar_details);
        guardian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                FragGuardian obj = new FragGuardian();
                ft.replace(R.id.newfraglayout,obj,"guardian");
                ft.commit();
            }
        });
        Button feedback = (Button) findViewById(R.id.feedback);
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                FragFeedback obj = new FragFeedback();
                ft.replace(R.id.newfraglayout,obj,"feedback");
                ft.commit();
            }
        });


        Button home = (Button) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                FragHome obj = new FragHome();
                ft.replace(R.id.newfraglayout,obj,"homebutton");
                ft.commit();
            }
        });
    }

}
