package com.example.asus.duniaelektro;


import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import me.biubiubiu.justifytext.library.JustifyTextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InduktorFragment extends Fragment {


    public InduktorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_induktor, container, false);
        // Inflate the layout for this fragment

        TextView textView = (TextView) rootView.findViewById(R.id.texti);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Rangkaian Induktor", Toast.LENGTH_SHORT).show();
                Intent goPindah = new Intent(getActivity(),InduktorRangkaian.class);
                startActivity(goPindah);
            }
        });

        JustifyTextView justifyTextView = (JustifyTextView) rootView.findViewById(R.id.artikeli);
        textView.setPaintFlags(textView.getPaintFlags()|Paint.UNDERLINE_TEXT_FLAG);

        return rootView;

    }

}
