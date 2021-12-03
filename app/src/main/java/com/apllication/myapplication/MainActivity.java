package com.apllication.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button btn_pendapatan,btn_prediksi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_pendapatan = findViewById(R.id.btn_pendapatan_hari_ini);
        btn_prediksi = findViewById(R.id.btn_prediksi_pendapatan);

        btn_pendapatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,PendapatanHariIniActivity.class));
            }
        });
    }
}