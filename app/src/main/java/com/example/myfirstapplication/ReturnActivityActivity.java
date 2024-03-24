package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ReturnActivityActivity extends AppCompatActivity {
    TextView etName;
    Button btnSendBack;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_return_activity);
        etName =findViewById(R.id.et_Name);
        btnSendBack=findViewById(R.id.btn_SendBack);

        btnSendBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=etName.getText() .toString();
            Intent returnIntent=new Intent();
                returnIntent.putExtra (  "USERNAME", name) ;
                setResult(Activity.RESULT_OK, returnIntent);
                finish();
            }
        });
    }
}