package com.developers.droidteam.merisafety;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_sendbugreport extends Fragment {

    String arr_sev[]={"High","Medium","Low"};
    String arr_pri[]={"High", "Medium", "Low"};
    Spinner spin_pri,spin_sev;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vv = inflater.inflate(R.layout.fragment_frag_sendbugreport, container, false);
        ArrayAdapter<String>adapter_sev = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_dropdown_item,arr_sev);
        ArrayAdapter<String>adapter_pri = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_spinner_dropdown_item,arr_pri);
        spin_pri =(Spinner)vv.findViewById(R.id.spin_pri);
        spin_sev =(Spinner)vv.findViewById(R.id.spin_sev);
        spin_pri.setAdapter(adapter_pri);
        spin_sev.setAdapter(adapter_sev);
        return vv;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        spin_sev.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spin_pri.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}
