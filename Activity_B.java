package com.example.pashaandrushenko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Activity_B extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Button buttonActC = findViewById(R.id.opActivity_C);

        buttonActC.setOnClickListener(view -> {
            Intent intent = new Intent(Activity_B.this , Activity_C.class);
            startActivity(intent);
        });
    }
    }
