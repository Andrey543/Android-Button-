package com.example.pashaandrushenko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Activity_C extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        Button btActAfromC = findViewById(R.id.opActivity_A_fromC);
        btActAfromC.setOnClickListener(view -> {
            Intent intent = new Intent(Activity_C.this , Activity_A.class);
            startActivity(intent);

        });

        Button btActDfromC = findViewById(R.id.opActivity_D_fromC);
        btActAfromC.setOnClickListener(view -> {
            Intent intent = new Intent(Activity_C.this , Activity_D.class);
            finishAffinity();
            startActivity(intent);

        });


        Button btclActC = findViewById(R.id.clActivity_C);
        btclActC.setOnClickListener(view -> {
            Intent intent = new Intent(Activity_C.this , Activity_B.class);
            startActivity(intent);



        });

        Button btclstack = findViewById(R.id.close_stack);
        btclstack.setOnClickListener(view -> finishAffinity());
    }
}