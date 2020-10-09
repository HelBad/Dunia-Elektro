package com.example.asus.duniaelektro;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class ResistorRangkaian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resistor_rangkaian);

        ActionBar menu = getSupportActionBar();
        menu.setDisplayShowHomeEnabled(true);
        menu.setDisplayHomeAsUpEnabled(true);

        TextView textView = (TextView) findViewById(R.id.linkr);
        textView.setText("https://www.youtube.com/watch?v=x7VmW5xmQMM");
        Linkify.addLinks(textView, Linkify.WEB_URLS);

        textView.setText("Pelajari lebih lanjut tentang Resistor, klik link berikut https://www.youtube.com/watch?v=x7VmW5xmQMM");
        Linkify.addLinks(textView, Linkify.ALL);
    }
}
