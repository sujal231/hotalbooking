package com.example.hotal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class d1 extends AppCompatActivity {

   TextView txtdialog;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d1);

        txtdialog = findViewById(R.id.txtdialog);

        txtdialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(d1.this,Activity11.class);
                startActivity(i);
            }
        });

    }
}