package com.example.pakarprinter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class tentangkami extends AppCompatActivity {
    ImageView back;
    TextView pakar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentangkami);

        back = findViewById(R.id.back);
        pakar = findViewById(R.id.pakar);

        back.setOnClickListener(v -> {
            Intent intent = new Intent(tentangkami.this, MainActivity.class);
            finish();
            startActivity(intent);
        });

        pakar.setOnClickListener(v -> {
            Intent intent = new Intent(tentangkami.this, pakar.class);
            finish();
            startActivity(intent);
        });
    }
}