package com.example.sunnyparihar.project44;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_guardian extends Fragment {


    public Frag_guardian() {
        // Required empty public constructor
    }

Button b1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vv =  inflater.inflate(R.layout.fragment_frag_guardian, container, false);

        b1 = (Button)vv.findViewById(R.id.b2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(),HomeScreenActivity.class);
                startActivity(i);
            }
        });
        return vv;
    }

}
