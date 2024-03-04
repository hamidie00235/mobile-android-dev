package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
boolean isNewOper=true;
String op="+";
String oldNumber="";
EditText ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView (R.layout.activity_main);
        ed1=findViewById(R.id.editText);




    }

    public void numberEvent(View view) {
        if(isNewOper)
            ed1.setText("");
        else isNewOper=false;
        String number = ed1.getText().toString();
        int id = view.getId();

        if (id == R.id.bu1) {
            number += "1";
        } else if (id == R.id.bu2) {
            number += "2";
        } else if (id == R.id.bu3) {
            number += "3";
        } else if (id == R.id.bu4) {
            number += "4";
        } else if (id == R.id.bu5) {
            number += "5";
        } else if (id == R.id.bu6) {
            number += "6";
        } else if (id == R.id.bu7) {
            number += "7";
        } else if (id == R.id.bu8) {
            number += "8";
        } else if (id == R.id.bu9) {
            number += "9";
        } else if (id == R.id.bu0) {
            number += "0";
        } else if (id == R.id.buDot) {
            number += ".";
        } else if (id == R.id.buPlusMinus) {
            number += "-"+number;


        }

        ed1.setText(number);

    }

    public void operatorEvent(View view) {
        isNewOper = true;
        oldNumber = ed1.getText().toString();

        int id = view.getId();

        if (id == R.id.buDivide) {
            op = "/";
        } else if (id == R.id.buMultiply) {
            op = "*";
        } else if (id == R.id.buPlus) {
            op = "+";
        } else if (id == R.id.buMinus) {
            op = "-";


        }}

    public void equalEvent(View view) {
        String newNumber = ed1.getText().toString();
        double result = 0.0;

        if (op.equals("+")) {
            result = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber);
        } else if (op.equals("-")) {
            result = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber);
        } else if (op.equals("*")) {
            result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber);
        } else if (op.equals("/")) {
            result = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);
        }
        ed1.setText(result+"");
    }

    public void acEvent(View view) {
        ed1.setText("0");
        isNewOper=true;
    }

    public void percentEvent(View view) {
        double no = Double.parseDouble(ed1.getText ().toString ())/100;
        ed1.setText(no+"");
        isNewOper=true;


    }
}





