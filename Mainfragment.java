package com.developers.droidteam.merisafety;


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
    FragmentManager fm = getFragmentManager();




    public Mainfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vw= inflater.inflate(R.layout.fragment_main, container, false);
        Button bbb =(Button)vw.findViewById(R.id.b1);
        Button bb1 =(Button)vw.findViewById(R.id.b2);
    /*    bbb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = fm.beginTransaction();
                ft.add(R.id.l2, new Frag_login());
                //  ft.addToBackStack(null);
                ft.commit();
            }
        });
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = fm.beginTransaction();
                ft.add(R.id.l2, new Frag_signup());
                //  ft.addToBackStack(null);
                ft.commit();
            }
        });*/
        return  vw;
    }

}
