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
import android.widget.TextView;

public class Frag_signup extends Fragment {


    @Override
    public View onCreateView(LayoutInflater l, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v2 = l.inflate(R.layout.activity_frag_signup, container, false);
        final EditText e1 = (EditText) v2.findViewById(R.id.e1);
        final EditText e2 = (EditText) v2.findViewById(R.id.e2);
        Button btn = (Button) v2.findViewById(R.id.btt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (e1.getText().toString().trim().length() != 10) {
                    e1.setError("Phone Number is invalid");
                    e1.requestFocus();
                } else if (e2.getText().toString().trim().length() < 6) {
                    e2.setError("Password must be atleast 6 characters");
                    e2.requestFocus();
                } else {
                    FragmentManager fm = getFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.replace(R.id.l2, new Frag_verification());
                  //  ft.addToBackStack(null);
                    ft.commit();

                }


            }
        });
     /*  TextView txt=(TextView)v2.findViewById(R.id.text);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                Frag_signup fl= (Frag_signup) fm.findFragmentByTag("B");
                ft.add(R.id.l2,new Frag_login(),"A");


            }


        });*/




        return v2;
    }
}