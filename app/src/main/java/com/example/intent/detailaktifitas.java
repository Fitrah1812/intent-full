package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class detailaktifitas extends AppCompatActivity {
    Button kembali,telpon, kirimpesan;
    EditText nama;
    EditText nohp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailaktifitas);
        kembali = (Button) findViewById(R.id.kembali);
        nama = (EditText) findViewById(R.id.nama);
        nohp = (EditText) findViewById(R.id.nohp);
        telpon = (Button) findViewById(R.id.telpon);
        kirimpesan = (Button) findViewById(R.id.kirimpesan);
        Intent intent = getIntent();
        String namakan = intent.getStringExtra("nama");
        String nohpkan = intent.getStringExtra("nohp");
        nama.setText(namakan);
        nohp.setText(nohpkan);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        telpon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData (Uri.parse("tel:" + nohpkan));
                startActivity(intent);
            }
        });

        kirimpesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", nohpkan, null)));
            }
        });
    }


}