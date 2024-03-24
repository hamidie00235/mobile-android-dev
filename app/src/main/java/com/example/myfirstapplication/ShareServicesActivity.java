package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ShareServicesActivity extends AppCompatActivity {
    EditText etShare;
    Button btnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_services);
        etShare=findViewById(R.id.et_Share);
        btnShare=findViewById(R.id.btn_share);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=etShare.getText().toString();
                Intent shareIntent=new Intent(Intent.ACTION_SEND) ;
                shareIntent. setType("plain/text");
                shareIntent.putExtra (Intent. EXTRA_TEXT, text) ;
                startActivity(Intent.createChooser (shareIntent,"Select Platform"));

            }
        });
    }
}