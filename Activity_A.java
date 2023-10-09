package com.example.pashaandrushenko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Activity_A extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Button buttonActB = findViewById(R.id.opActivity_B);

        buttonActB.setOnClickListener(view -> {
            Intent intent = new Intent(Activity_A.this , Activity_B.class);
            startActivity(intent);
        });
    }
}