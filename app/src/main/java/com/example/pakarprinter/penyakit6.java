package com.example.pakarprinter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class penyakit6 extends AppCompatActivity {
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyakit6);

        back = findViewById(R.id.back);

        back.setOnClickListener(v -> {
            Intent intent = new Intent(penyakit6.this, daftarkerusakan.class);
            finish();
            startActivity(intent);
        });
    }
}