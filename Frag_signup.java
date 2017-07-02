package com.example.sunnyparihar.project44;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_signup extends Fragment {


    public Frag_signup() {
        // Required empty public constructor
    }

Button b1;
    EditText e1,e2;
    CheckBox c1;
    FragmentManager fm;
    TextView t1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vv =  inflater.inflate(R.layout.fragment_frag_signup, container, false);
    b1 = (Button)vv.findViewById(R.id.btt);
         fm = getFragmentManager();
        e1 = (EditText)vv.findViewById(R.id.e2);
        e1 = (EditText)vv.findViewById(R.id.e2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.layout,new Frag_verification());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        TextView t1  =(TextView)vv.findViewById(R.id.text);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.layout,new Mainfragment());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        return vv;

    }

}
