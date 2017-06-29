package com.developers.droidteam.merisafety;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Frag_guardian extends Fragment {
    @Override
    public View onCreateView(LayoutInflater l, @Nullable ViewGroup container, @ Nullable Bundle savedInstanceState){
        View v4=  l.inflate(R.layout.activity_frag_guardian,container,false);
        Button b1 = (Button)v4.findViewById(R.id.b2);
        final EditText et1 = (EditText)v4. findViewById(R.id.et1);
        final EditText et2 = (EditText)v4. findViewById(R.id.et2);
        final EditText et3 = (EditText) v4.findViewById(R.id.et3);
        final String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        Button btt = (Button)v4.findViewById(R.id.b3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String email = et3.getText().toString().trim();
                if (et1.getText().toString().length() == 0)
                    et1.setError("Enter guardian name");

               else if (et2.getText().toString().length() != 10) {
                    et2.setError("Enter a valid phone number");

                }
               else if (!(email.matches(emailPattern)))
                    et3.setError("Invalid Email Address");
                else{
                    Intent it3=new Intent(getContext(),HomeScreenActivity.class);
                    startActivity(it3);
                }}
        });
      /*  btt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.remove(Frag_guardian);
                ft.add(R.id.l2,new Frag_login());
                ft.addToBackStack(null);
                ft.commit();

            }


        });*/
        return v4;
}}
