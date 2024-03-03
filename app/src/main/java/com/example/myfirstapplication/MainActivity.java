package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button btnCalc,btnAge,btnMass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

btnCalc=findViewById(R.id.btn_Calc);
btnAge =findViewById(R.id.btn_Age);
btnMass=findViewById(R.id.btn_Mass);


btnMass.setOnClickListener(this);
btnCalc.setOnClickListener(this);
btnAge.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent i;

        if (id == R.id.btn_Calc) {
            i = new Intent(MainActivity.this, CalculatorActivity.class);
            startActivity(i);
        } else if (id == R.id.btn_Mass) {
            i = new Intent(MainActivity.this, MassActivity.class);
            startActivity(i);
        } else if (id == R.id.btn_Age) {
            i = new Intent(MainActivity.this, AgeActivity.class);
            startActivity(i);
        }

    }



    }


