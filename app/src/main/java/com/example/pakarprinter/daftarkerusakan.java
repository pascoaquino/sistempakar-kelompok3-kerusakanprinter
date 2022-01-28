package com.example.pakarprinter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class daftarkerusakan extends AppCompatActivity {
    ImageView back;
    TextView penyakit1, penyakit2, penyakit3, penyakit4, penyakit5, penyakit6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarkerusakan);

        back = findViewById(R.id.back);
        penyakit1 = findViewById(R.id.penyakit1);
        penyakit2 = findViewById(R.id.penyakit2);
        penyakit3 = findViewById(R.id.penyakit3);
        penyakit4 = findViewById(R.id.penyakit4);
        penyakit5 = findViewById(R.id.penyakit5);
        penyakit6 = findViewById(R.id.penyakit6);

        back.setOnClickListener(v -> {
            Intent intent = new Intent(daftarkerusakan.this, MainActivity.class);
            finish();
            startActivity(intent);
        });
        penyakit1.setOnClickListener(v -> {
            Intent intent = new Intent(daftarkerusakan.this, penyakit1.class);
            finish();
            startActivity(intent);
        });
        penyakit2.setOnClickListener(v -> {
            Intent intent = new Intent(daftarkerusakan.this, penyakit2.class);
            finish();
            startActivity(intent);
        });
        penyakit3.setOnClickListener(v -> {
            Intent intent = new Intent(daftarkerusakan.this, penyakit3.class);
            finish();
            startActivity(intent);
        });
        penyakit4.setOnClickListener(v -> {
            Intent intent = new Intent(daftarkerusakan.this, penyakit4.class);
            finish();
            startActivity(intent);
        });
        penyakit5.setOnClickListener(v -> {
            Intent intent = new Intent(daftarkerusakan.this, penyakit5.class);
            finish();
            startActivity(intent);
        });
        penyakit6.setOnClickListener(v -> {
            Intent intent = new Intent(daftarkerusakan.this, penyakit6.class);
            finish();
            startActivity(intent);
        });
    }
}