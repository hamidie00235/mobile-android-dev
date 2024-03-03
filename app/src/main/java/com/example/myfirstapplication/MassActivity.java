package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MassActivity extends AppCompatActivity {
    EditText etHeight,etWeight;
    Button btnMassCalculator;
    TextView tvMass, tvMassInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);
        etHeight=findViewById(R.id.et_Height);
        etWeight=findViewById(R.id.et_Weight);
        btnMassCalculator=findViewById(R.id.btn_MassCalculator);
        tvMass=findViewById(R.id.tv_Mass);
       tvMassInfo=findViewById(R.id.tv_MassInfo);
       btnMassCalculator.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View v) {
               double height =Double.parseDouble(etHeight.getText().toString());
               double weight =Double.parseDouble(etWeight.getText().toString());
               double massIndex=weight/Math.pow(height,2);
               tvMass.setText(  "Your mass index is: "+massIndex);
               if(massIndex>25)
                   tvMassInfo.setText("Obez");
               else tvMassInfo.setText("Normal");
           }
       });

    }
}