package com.developers.droidteam.merisafety;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeScreenActivity extends AppCompatActivity {
    TabLayout tabLayout;

    private static final int REQUEST_PHONE =1889 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_new);
        Toast.makeText(this, "Click on the Security fragment to check the mail functionality", Toast.LENGTH_SHORT).show();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        FragHome obj = new FragHome();
        ft.add(R.id.newfraglayout, obj, "homepage");
        ft.commit();
        tabLayout = (TabLayout) findViewById(R.id.tab);
        TabLayout.Tab firsttab = tabLayout.newTab();
        firsttab.setText("Home");
        firsttab.setIcon(R.drawable.homebl);
        tabLayout.addTab(firsttab);
        TabLayout.Tab Secondtab = tabLayout.newTab();

        Secondtab.setText("Settings");
        Secondtab.setIcon(R.drawable.settings_revamped);
        tabLayout.addTab(Secondtab);
        TabLayout.Tab Thirdtab = tabLayout.newTab();
        Thirdtab.setText("Help");
        Thirdtab.setIcon(R.drawable.nearby_icon);
        tabLayout.addTab(Thirdtab);
        TabLayout.Tab Fourthtab = tabLayout.newTab();
        Fourthtab.setText("Guardian");
        Fourthtab.setIcon(R.drawable.acc);
        tabLayout.addTab(Fourthtab);
        TabLayout.Tab Five = tabLayout.newTab();
        Five.setText("Feedback");
        Five.setIcon(R.drawable.feedback_icon);
        tabLayout.addTab(Five);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment fragment = null;
                Fragment f=new FragHome();
                String s ="";
                s= f.getTag();
                String l=" ";
                switch (tab.getPosition()) {

                    case 0: {
                        fragment = new FragHome();
                        l="a";
                        break;
                    }
                    case 1:
                        fragment = new FragSetting();


                        break;
                    case 2:
                        fragment = new FragHelp();

                        break;
                    case 3:
                        fragment = new Frag_guardian();

                        break;
                    case 4:
                        fragment = new FragFeedback();
                        break;
                }

                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.newfraglayout, fragment, s);
                ft.disallowAddToBackStack();
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {



            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)== PackageManager.PERMISSION_GRANTED){

        }
        else{
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                if(shouldShowRequestPermissionRationale(Manifest.permission.CALL_PHONE)){
                    Toast.makeText(this, "you need to check permission", Toast.LENGTH_SHORT).show();
                }
            }
        }
        requestPermissions(new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE);
        Button setting = (Button) findViewById(R.id.settings);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                FragSetting obj = new FragSetting();
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

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode==REQUEST_PHONE){
            if(grantResults[0]==PackageManager.PERMISSION_GRANTED){
            }else {
                Toast.makeText(this, "permission was not granted", Toast.LENGTH_SHORT).show();
            }
        }else{
            super.onRequestPermissionsResult(requestCode,permissions,grantResults);
        }


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi= getMenuInflater();
        mi.inflate(R.menu.myoptionmenu,menu);

        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        String data=item.getTitle().toString();
        if(data.equals("ABOUT APP")){
        FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.newfraglayout,new Frag_aboutapp());
            ft.addToBackStack("homepage");
            ft.commit();}
        if(item.getItemId()==R.id.team){
            FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.newfraglayout,new Frag_team());
            ft.addToBackStack("homepage");
        ft.commit();}
        if(item.getItemId()==R.id.bug){
            FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.newfraglayout,new Frag_sendbugreport());
            ft.addToBackStack("homepage");
            ft.commit();}
        if(item.getItemId()==R.id.signout){
          /* FragmentManager fm=getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.newfraglayout,new Frag_login());
            ft.commit();}*/
          Intent i=new Intent(this,MainActivity.class);
            startActivity(i);}



        return super.onOptionsItemSelected(item);
        //return true;
    }


      /*  Button btn = (Button)findViewById(R.id.guar_details);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeScreenActivity.this,FragGuardian.class);
                startActivity(i);
            }
        });*/




    public void fun(View v)
    {
        if(R.id.medical==v.getId()){

            Intent i = new Intent(this,SavemeActivity.class);
            i.putExtra("key",v.getId());
            startActivity(i);

        }
        if(R.id.save_me==v.getId())
        {
            Intent i = new Intent(this,SavemeActivity.class);
            i.putExtra("key",v.getId());
            startActivity(i);
        }
        if(R.id.security==v.getId())
        {
            Intent i = new Intent(this,SavemeActivity.class);
            i.putExtra("key",v.getId());
            startActivity(i);
        }
        if(R.id.travel==v.getId())
        {
            Intent i = new Intent(this,SavemeActivity.class);
            i.putExtra("key",v.getId());
            startActivity(i);
        }
        if(R.id.self_defence==v.getId())
        {
           Intent i = new Intent(this,SavemeActivity.class);
            i.putExtra("key",v.getId());
            startActivity(i);
        }

    }}
