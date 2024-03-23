package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

Button btnSMSService,btnLinkService,btnMailService,btnShareServices,btnReturnActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView (R.layout.activity_main);
      btnSMSService=findViewById(R.id.btn_SMSService);
        btnLinkService=findViewById(R.id.btn_LinkService);
        btnMailService=findViewById(R.id.btn_MailService);
        btnReturnActivity=findViewById(R.id.btn_ReturnActivity);
        btnShareServices=findViewById(R.id.btn_ShareService);

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
        } else if (view.getId() == R.id.btn_MailService) {
            i = new Intent(MainActivity.this, MailServiceActivity.class);
        } else if (view.getId() == R.id.btn_LinkService) {
            i = new Intent(MainActivity.this, LinkServiceActivity.class);
        } else if (view.getId() == R.id.btn_ShareService) {
            i = new Intent(MainActivity.this, ShareServicesActivity.class);
        } else if (view.getId() == R.id.btn_ReturnActivity) {
            i = new Intent(MainActivity.this, ReturnActivityActivity.class);
        } else {
            // Handle other cases or default behavior
            return;
        }
        startActivity(i);
    }

}







