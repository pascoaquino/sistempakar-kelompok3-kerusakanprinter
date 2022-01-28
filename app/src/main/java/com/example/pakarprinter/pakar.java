package com.example.pakarprinter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class pakar extends AppCompatActivity {
    ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pakar);

        back = findViewById(R.id.back);

        back.setOnClickListener(v -> {
            Intent intent = new Intent(pakar.this, tentangkami.class);
            finish();
            startActivity(intent);
        });

    }
}