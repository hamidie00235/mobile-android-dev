package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MailServiceActivity extends AppCompatActivity {
EditText etMail,etSubject,etMailText;
Button btnSendMail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_service);
        etMail=findViewById(R.id.et_Email);
        etSubject=findViewById(R.id.et_Subject);
        etMailText=findViewById(R.id.et_MailText);
        btnSendMail=findViewById(R.id.btn_SendMail);

        btnSendMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=etMail.getText().toString();
                String subject=etSubject.getText().toString();
                String text=etMailText.getText().toString();



                Intent mailIntent=new Intent(Intent. ACTION_SEND);
                mailIntent. setType("message/rfc822");
                mailIntent. putExtra(Intent. EXTRA_EMAIL,new String[]{email});
                mailIntent. putExtra(Intent.EXTRA_SUBJECT, subject);
                mailIntent. putExtra(Intent.EXTRA_TEXT,text);
                startActivity(mailIntent);
            }
        });
    }
}