package com.example.asus.duniaelektro;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


/**
 * A simple {@link Fragment} subclass.
 */
public class RangkaianFragment extends Fragment {

    public EditText inputan1, inputan2, inputan3, inputan4;
    public Button tombol;
    public TextView hasil, hasil1;

    public RangkaianFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_rangkaian, container, false);
        super.onCreate(savedInstanceState);

        TextView textView = (TextView) rootView.findViewById(R.id.linkrang);
        textView.setText("https://www.youtube.com/watch?v=LMEEKGcJ1DY");
        Linkify.addLinks(textView, Linkify.WEB_URLS);

        textView.setText("Pelajari lebih lanjut, klik link berikut https://www.youtube.com/watch?v=LMEEKGcJ1DY");
        Linkify.addLinks(textView, Linkify.ALL);

        inputan1 = (EditText) rootView.findViewById(R.id.outresistor);
        inputan2 = (EditText) rootView.findViewById(R.id.outkapasitor);
        inputan3 = (EditText) rootView.findViewById(R.id.outinduktor);
        inputan4 = (EditText) rootView.findViewById(R.id.outarus);
        tombol = (Button) rootView.findViewById(R.id.btn_hitung);
        hasil = (TextView) rootView.findViewById(R.id.tv_hasil);
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
            }
        });
        return rootView;
    }

    private void hitungLuas(){
        int angka1 = Integer.parseInt(inputan1.getText().toString());
        int angka2 = Integer.parseInt(inputan2.getText().toString());
        int angka3 = Integer.parseInt(inputan3.getText().toString());
        int angka4 = Integer.parseInt(inputan4.getText().toString());
        double Z = sqrt(pow(angka1,2)+pow((angka3-angka2),2));
        double V = Z * angka4;
        hasil.setText("Tegangan Maks. (V) = " +V);
    }
}
