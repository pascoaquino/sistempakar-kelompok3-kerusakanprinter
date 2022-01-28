package com.example.pakarprinter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView diagnosa, daftar, tentang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        diagnosa = findViewById(R.id.diagnosa);
        daftar = findViewById(R.id.daftar);
        tentang = findViewById(R.id.tentang);

        diagnosa.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, diagnosa.class);
            intent.putExtra("id","G001");
            startActivity(intent);
            finish();
        });

        daftar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, daftarkerusakan.class);
            finish();
            startActivity(intent);
        });

        tentang.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, tentangkami.class);
            finish();
            startActivity(intent);
        });
    }
}