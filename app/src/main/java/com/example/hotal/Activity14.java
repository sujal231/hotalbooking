package com.example.hotal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity14 extends AppCompatActivity {

    ImageView img14,img14_1,img14_2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_14);

        img14 = findViewById(R.id.img14);
        img14_1 = findViewById(R.id.img14_1);
        img14_2 = findViewById(R.id.img14_2);

        img14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity14.this,Activity15.class);
                startActivity(intent);
            }
        });
        img14_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity14.this,Activity13.class);
                startActivity(intent);
            }
        });
        img14_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity14.this,Activity13.class);
                startActivity(intent);
            }
        });
    }
}