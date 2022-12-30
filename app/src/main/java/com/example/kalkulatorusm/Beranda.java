package com.example.kalkulatorusm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Beranda extends AppCompatActivity {

    CardView cvKalkulator, cvBerat, cvSuhu, cvPanjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        Beranda();

    }

    void Beranda() {
        cvKalkulator = (CardView) findViewById(R.id.cvKalkulator);
        cvBerat = (CardView) findViewById(R.id.cvBerat);
        cvSuhu = (CardView) findViewById(R.id.cvSuhu);
        cvPanjang = (CardView) findViewById(R.id.cvPanjang);

        cvKalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Kalkulator
                Toast.makeText(getApplicationContext(), "Selamat Datang di Kalkulator", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Beranda.this, Kalkulator.class);
                Beranda.this.startActivity(intent);
                finish();
            }
        });

        cvBerat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Konversi Berat
                Toast.makeText(getApplicationContext(), "Selamat Datang di Konversi Berat", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Beranda.this, KonversiBerat.class);
                Beranda.this.startActivity(intent);
                finish();
            }
        });

        cvSuhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Konversi Suhu
                Toast.makeText(getApplicationContext(), "Selamat Datang di Konversi Suhu", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Beranda.this, KonversiSuhu.class);
                Beranda.this.startActivity(intent);
                finish();
            }
        });

        cvPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Konversi Mata Uang
                Toast.makeText(getApplicationContext(), "Selamat Datang di Konversi Mata Uang", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Beranda.this, KonversiMataUang.class);
                Beranda.this.startActivity(intent);
                finish();
            }
        });
    }
}