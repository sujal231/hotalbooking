
package com.example.hotal;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity10 extends AppCompatActivity {

    TextView txt10;
    TextView txtdialog;

    ImageView img10;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);

        txt10 = findViewById(R.id.txt10);
        txtdialog = findViewById(R.id.txtdialog);
        img10 = findViewById(R.id.img10);

        txt10.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(Activity10.this);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.R.color.transparent));
                dialog.setContentView(R.layout.activity_d1);
                dialog.show();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(Activity10.this, Activity11.class));
                        finish();
                    }
                }, 1000);

            }
        });
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity10.this, Activity9.class);
                startActivity(intent);
            }
        });


    }
}