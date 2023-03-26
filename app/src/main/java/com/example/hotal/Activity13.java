package com.example.hotal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity13 extends AppCompatActivity {

    TextView txt13;
    ImageView img13,img13_1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_13);

        img13 = findViewById(R.id.img13);
        txt13 = findViewById(R.id.txt13);
        img13_1 = findViewById(R.id.img13_1);


        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity13.this,Activity14.class);
                startActivity(intent);
            }
        });
        txt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity13.this,Activity14.class);
                startActivity(intent);
            }
        });
        img13_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity13.this,Activity16.class);
                startActivity(intent);
            }
        });


    }
}