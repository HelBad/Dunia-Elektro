package com.example.asus.duniaelektro;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private RelativeLayout menuR;
    private RelativeLayout menuK;
    private RelativeLayout menuT;
    private RelativeLayout menuI;
    private RelativeLayout menuC;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        // Inflate the layout for this fragment

        menuR = (RelativeLayout) rootView.findViewById(R.id.menuR);
        menuR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Resistor", Toast.LENGTH_SHORT).show();
                Intent goPindah = new Intent(getActivity(),Resistor.class);
                startActivity(goPindah);
            }
        });
        menuK = (RelativeLayout) rootView.findViewById(R.id.menuK);
        menuK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Kapasitor", Toast.LENGTH_SHORT).show();
                Intent goPindah = new Intent(getActivity(),Kapasitor.class);
                startActivity(goPindah);
            }
        });
        menuT = (RelativeLayout) rootView.findViewById(R.id.menuT);
        menuT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Transistor", Toast.LENGTH_SHORT).show();
                Intent goPindah = new Intent(getActivity(),Transistor.class);
                startActivity(goPindah);
            }
        });
        menuI = (RelativeLayout) rootView.findViewById(R.id.menuI);
        menuI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Induktor", Toast.LENGTH_SHORT).show();
                Intent goPindah = new Intent(getActivity(),Induktor.class);
                startActivity(goPindah);
            }
        });
        menuC = (RelativeLayout) rootView.findViewById(R.id.menuC);
        menuC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "All", Toast.LENGTH_SHORT).show();
                Intent goPindah = new Intent(getActivity(),Rangkaian.class);
                startActivity(goPindah);
            }
        });

        return rootView;
    }

}
