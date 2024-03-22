package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

Button btnLiner,btnRelative,btnFrame,btnGrid,btnTable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView (R.layout.activity_main);
      btnLiner=findViewById(R.id.btn_Liner);
        btnFrame=findViewById(R.id.btn_Frame);
        btnRelative=findViewById(R.id.btn_Relative);
        btnGrid=findViewById(R.id.btn_Grid);
        btnTable=findViewById(R.id.btn_Table);

       btnFrame.setOnClickListener(this);
        btnRelative.setOnClickListener(this);
        btnGrid.setOnClickListener(this);
        btnTable.setOnClickListener(this);
        btnLiner.setOnClickListener(this);








    }


    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.btn_Liner) {
            i = new Intent(MainActivity.this, LinerActivity.class);
        } else if (view.getId() == R.id.btn_Relative) {
            i = new Intent(MainActivity.this, RelativeActivity.class);
        } else if (view.getId() == R.id.btn_Frame) {
            i = new Intent(MainActivity.this, FrameActivity.class);
        } else if (view.getId() == R.id.btn_Table) {
            i = new Intent(MainActivity.this, TableActivity.class);
        } else if (view.getId() == R.id.btn_Grid) {
            i = new Intent(MainActivity.this, GridActivity.class);
        } else {
            // Handle other cases or default behavior
            return;
        }
        startActivity(i);
    }

}







