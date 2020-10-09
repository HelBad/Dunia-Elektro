package com.example.asus.duniaelektro;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class TransistorRangkaian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transistor_rangkaian);

        ActionBar menu = getSupportActionBar();
        menu.setDisplayShowHomeEnabled(true);
        menu.setDisplayHomeAsUpEnabled(true);

        TextView textView = (TextView) findViewById(R.id.linkt);
        textView.setText("https://www.youtube.com/watch?v=DMOFdHT-iRs");
        Linkify.addLinks(textView, Linkify.WEB_URLS);

        textView.setText("Pelajari lebih lanjut tentang Transistor, klik link berikut https://www.youtube.com/watch?v=DMOFdHT-iRs");
        Linkify.addLinks(textView, Linkify.ALL);
    }
}
