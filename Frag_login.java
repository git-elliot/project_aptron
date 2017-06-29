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

public class Frag_login extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater l, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v1=  l.inflate(R.layout.activity_frag_login,container);
        final EditText e1 = (EditText)v1.findViewById(R.id.e1);
    final EditText e2 = (EditText)v1.findViewById(R.id.e2);
    Button b1 = (Button)v1.findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(e1.getText().toString().trim().length()!=10){
                e1.setError("Phone Number is invalid");
                e1.requestFocus();}


            else  if (e2.getText().toString().trim().length()<6){
                e2.setError("Password must be atleast 6 characters");
                e2.requestFocus();
            }
            else

            {   Intent itt = new Intent(getContext(), HomeScreenActivity.class);
                startActivity(itt);}


        }
    });
        TextView txt=(TextView)v1.findViewById(R.id.tt4);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    FragmentManager fm = getFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.l2,new Frag_signup());
                ft.addToBackStack(null);
                    ft.commit();

                }


        });


  return v1;
}}
