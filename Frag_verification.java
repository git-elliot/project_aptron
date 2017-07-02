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
public class Frag_verification extends Fragment {


    public Frag_verification() {
        // Required empty public constructor
    }

Button b1;
    FragmentManager fm;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vv = inflater.inflate(R.layout.fragment_frag_verification, container, false);
    b1 = (Button)vv.findViewById(R.id.proceed1);
        fm = getFragmentManager();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.layout,new Frag_guardian());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        return vv;

    }

}
