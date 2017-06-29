package com.developers.droidteam.merisafety;

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

public class Frag_verification extends Fragment {

    public View onCreateView(LayoutInflater l, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v3 = l.inflate(R.layout.activity_frag_verification, container,false);
        Button b1 = (Button)v3.findViewById(R.id.proceed1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.l2, new Frag_guardian());
                ft.addToBackStack(null);
                ft.commit();
            }});

                return v3;
    }}