package com.example.hotal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class Activity15 extends AppCompatActivity {

    ImageView img15,img15_1,img15_2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_15);

        img15 = findViewById(R.id.img15);
        img15_1 = findViewById(R.id.img15_1);
        img15_2 = findViewById(R.id.img15_2);

        img15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity15.this,Activity14.class);
                startActivity(intent);
            }
        });
        img15_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity15.this,Activity13.class);
                startActivity(intent);
            }
        });
        img15_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity15.this,Activity13.class);
                startActivity(intent);
            }
        });

    }
}