package com.example.kalkulatorusm;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class KonversiSuhu extends AppCompatActivity {

    Button btnBack1;
    ActionBar back1;

    String[] satuansuhu = {"Rankine (R)", "Celcius (C)", "Reaumur (Re)", "Fahrenheit (F)", "Kelvin (K)" };

    AutoCompleteTextView autoCompleteText4;
    AutoCompleteTextView autoCompleteText5;

    ArrayAdapter<String> adapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konversi_suhu);

        autoCompleteText4 = findViewById(R.id.autoCompleteTextView4) ;
        autoCompleteText5 = findViewById(R.id.autoCompleteTextView);

        adapter1 = new ArrayAdapter<String>(this, R.layout.dropdown_item_suhu, satuansuhu);
        autoCompleteText4.setAdapter(adapter1);
        autoCompleteText4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
        autoCompleteText5.setAdapter(adapter1);
        autoCompleteText5.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        back1 = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        }

        @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();
    }
    }

