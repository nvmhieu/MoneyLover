package com.example.hieunguyen.moneylover;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Splashscreen extends AppCompatActivity {
    Button btnlandau, btndadung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        Anhxa();
        eventClick();
    }

    private void eventClick() {
        btnlandau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Splashscreen.this,DangkyActivity.class);
                startActivity(intent);
            }
        });
        btndadung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Splashscreen.this,DangnhapActivity.class);
                startActivity(intent);
            }
        });
    }

    private void Anhxa() {
        btnlandau = (Button)findViewById(R.id.btnlandau);
        btndadung = (Button)findViewById(R.id.btndadung);
    }
}
