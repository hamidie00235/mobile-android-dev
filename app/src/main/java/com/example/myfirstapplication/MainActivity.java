package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;




import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;

import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
 EditText etFirstNumber,etSecondNumber;
 Button btnAdd,btnSubtract,btnMultiply,btnDivision;
 TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        etFirstNumber = findViewById(R.id.et_FirstNumber);
        etSecondNumber = findViewById(R.id.et_SecondNumber);
        btnAdd = findViewById(R.id.btn_Add);
        btnSubtract = findViewById(R.id.btn_Subtract);
        btnMultiply = findViewById(R.id.btn_Multiply);
        btnDivision = findViewById(R.id.btn_Division);
        tvResult = findViewById(R.id.tv_Result);

    }
    public void ButtonClick(View v) {
        int ID = v.getId();
        int firstNumber = Integer.parseInt(etFirstNumber.getText().toString());
        int secondNumber = Integer.parseInt(etSecondNumber.getText().toString());
        int result = 0;

        if (ID == R.id.btn_Add) {
            result = firstNumber + secondNumber;
        } else if (ID == R.id.btn_Subtract) {
            result = firstNumber - secondNumber;
        } else if (ID == R.id.btn_Multiply) {
            result = firstNumber * secondNumber;
        } else if (ID == R.id.btn_Division) {
            if (secondNumber != 0) {
                result = firstNumber / secondNumber;
            }

         tvResult.setText("Soncuç=" +result);
        }

    }}
