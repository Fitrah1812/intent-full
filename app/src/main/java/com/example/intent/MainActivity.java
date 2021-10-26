package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buka_kontak =  findViewById(R.id.buka_kontak);
        Button buka_browser =  findViewById(R.id.buka_browser);
        Button try_maps = findViewById(R.id.buka_maps);
        Button buka_maps2 = findViewById(R.id.buka_maps_2);
        Button buka_maps3 = findViewById(R.id.buka_maps_3);

        EditText mEdit = (EditText) findViewById(R.id.mEdit);
        mEdit.setEnabled(false);

        buka_kontak.setOnClickListener(operasi);
        buka_browser.setOnClickListener(operasi);
        try_maps.setOnClickListener(operasi);
        buka_maps2.setOnClickListener(operasi);
        buka_maps3.setOnClickListener(operasi);


    }

    @SuppressLint("NonConstantResourceId")
    View.OnClickListener operasi = v -> {
        switch (v.getId()) {
            case R.id.buka_kontak:bukaKontak();break;
            case R.id.buka_browser:bukaBrowser();break;
            case R.id.buka_maps:bukaMaps();break;
            case R.id.buka_maps_2:bukaMaps2();break;
            case R.id.buka_maps_3:bukaMaps3();break;
        }
    };

    private void bukaKontak() {
        Intent intentku = new Intent(getBaseContext(), Kontak.class);
        startActivityForResult(intentku, 0);
    }

    private void bukaBrowser() {
        Intent intentku = new Intent(getBaseContext(), Browser.class);
        startActivityForResult(intentku, 0);
    }

    private void bukaMaps() {
        Intent intentku = new Intent(getBaseContext(), Maps.class);
        startActivityForResult(intentku, 0);
    }

    private void bukaMaps2() {
        Intent intentku = new Intent(getBaseContext(), Maps2.class);
        startActivityForResult(intentku, 0);
    }

    private void bukaMaps3() {
        Intent intentku = new Intent(getBaseContext(), Maps3.class);
        startActivityForResult(intentku, 0);
    }

}