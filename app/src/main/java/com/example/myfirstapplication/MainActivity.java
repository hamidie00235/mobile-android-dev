package com.example.myfirstapplication;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

Button btnSMSService,btnLinkService,btnMailService,btnShareServices,btnReturnActivity;
    final static int REQUEST_CODE=1200 ;
    TextView tvReturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView (R.layout.activity_main);
      btnSMSService=findViewById(R.id.btn_SMSService);
        btnLinkService=findViewById(R.id.btn_LinkService);
        btnMailService=findViewById(R.id.btn_MailService);
        btnReturnActivity=findViewById(R.id.btn_ReturnActivity);
        btnShareServices=findViewById(R.id.btn_ShareService);
        tvReturn=findViewById(R.id.tv_Return);

       btnSMSService.setOnClickListener(this);
        btnLinkService.setOnClickListener(this);
        btnMailService.setOnClickListener(this);
        btnReturnActivity.setOnClickListener(this);
        btnShareServices.setOnClickListener(this);








    }


    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.btn_SMSService) {
            i = new Intent(MainActivity.this, SMSServiceActivity.class);
            startActivity(i);
        } else if (view.getId() == R.id.btn_MailService) {
            i = new Intent(MainActivity.this, MailServiceActivity.class);
            startActivity(i);
        } else if (view.getId() == R.id.btn_LinkService) {
            i = new Intent(MainActivity.this, LinkServiceActivity.class);
            startActivity(i);
        } else if (view.getId() == R.id.btn_ShareService) {
            i = new Intent(MainActivity.this, ShareServicesActivity.class);
            startActivity(i);
        } else if (view.getId() == R.id.btn_ReturnActivity) {
            i = new Intent(MainActivity.this, ReturnActivityActivity.class);
            startActivityForResult(i, REQUEST_CODE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQUEST_CODE)
            if(resultCode== Activity.RESULT_OK) {
                String name = data.getStringExtra("USERNAME");
                tvReturn.setText(name);

            }
    }

// Handle other cases or default behavior
    }









