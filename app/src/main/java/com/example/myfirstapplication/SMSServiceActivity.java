package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SMSServiceActivity extends AppCompatActivity {
    EditText etPhoneNumber, etSMSText;
    Button btnSendSMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smsservice);

        etPhoneNumber=findViewById (R.id.et_phoneNumber);
        etSMSText=findViewById(R.id.et_SMSText);
        btnSendSMS=findViewById(R.id.btn_SendSMS);
        btnSendSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Retrieve phone number and SMS text from EditText fields
                String phoneNumber = etPhoneNumber.getText().toString();
                String text = etSMSText.getText().toString();

// Create an Intent with the ACTION_SENDTO action
                Intent smsIntent = new Intent(Intent.ACTION_SENDTO);

// Set the data URI to specify the recipient phone number
                smsIntent.setData(Uri.parse("smsto:" + phoneNumber));

// Include the SMS text as an extra with key "sms_body"
                smsIntent.putExtra("sms_body", text);
                startActivity(smsIntent);

            }
        });

    }
}