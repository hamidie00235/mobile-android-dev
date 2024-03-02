package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;




import android.os.Bundle;

import android.widget.Button;


public class MainActivity extends AppCompatActivity {
Button btnCalc,btnAge,btnMass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

btnCalc=findViewById(R.id.btn_Calc);
btnAge =findViewById(R.id.btn_Age);
btnMass=findViewById(R.id.btn_Mass);

    }}
