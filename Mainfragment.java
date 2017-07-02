package com.example.sunnyparihar.project44;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Mainfragment extends Fragment {

Button b1,b2;
    public Mainfragment() {
        // Required empty public constructor
    }

FragmentManager fm ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vv =  inflater.inflate(R.layout.fragment_mainfragment, container, false);
    fm= getFragmentManager();
        b1 = (Button)vv.findViewById(R.id.b1);
        b2 = (Button)vv.findViewById(R.id.b2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.layout,new Frag_login());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.layout,new Frag_signup());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        return vv;

    }

}
