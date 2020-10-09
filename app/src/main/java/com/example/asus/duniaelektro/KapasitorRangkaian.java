package com.example.asus.duniaelektro;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class KapasitorRangkaian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kapasitor_rangkaian);

        ActionBar menu = getSupportActionBar();
        menu.setDisplayShowHomeEnabled(true);
        menu.setDisplayHomeAsUpEnabled(true);

        TextView textView = (TextView) findViewById(R.id.linkk);
        textView.setText("https://www.youtube.com/watch?v=OVBpihsnzyc");
        Linkify.addLinks(textView, Linkify.WEB_URLS);

        textView.setText("Pelajari lebih lanjut tentang Kapasitor, klik link berikut https://www.youtube.com/watch?v=OVBpihsnzyc");
        Linkify.addLinks(textView, Linkify.ALL);
    }
}
