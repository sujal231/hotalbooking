
package com.example.hotal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class Activity10 extends AppCompatActivity {

    TextView txt10;
    TextView txtdialog;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);

        txt10 = findViewById(R.id.txt10);
        txtdialog = findViewById(R.id.txtdialog);

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
                },3000);

            }
        });



    }
}