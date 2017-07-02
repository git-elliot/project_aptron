package com.example.sunnyparihar.project44;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_login extends Fragment {


    public Frag_login() {
        // Required empty public constructor
    }

Button b1,bwe;
    TextView t1;
    FragmentManager fm;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vv =  inflater.inflate(R.layout.fragment_frag_login, container, false);
    b1  = (Button)vv.findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),HomeScreenActivity.class);
                startActivity(i);
            }
        });
        fm = getFragmentManager();
        t1 = (TextView)vv.findViewById(R.id.tt4);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.layout,new Mainfragment());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        bwe  = (Button)vv.findViewById(R.id.bcall);
        bwe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:7042772660"));
                startActivity(i);
            }
        });
        return vv;

    }

}
