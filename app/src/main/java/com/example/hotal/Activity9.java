package com.example.hotal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;


public class Activity7 extends AppCompatActivity {

    EditText ed7_1,ed7_2,ed7_3,ed7_4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);
        ed7_1 = findViewById(R.id.ed7_1);





    }
}