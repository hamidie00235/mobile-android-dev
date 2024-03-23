package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LinkServiceActivity extends AppCompatActivity {

    TextView tvLink;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link_service);
      tvLink= findViewById(R.id.tv_Link);
      tvLink.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent linkIntent=new Intent (Intent.ACTION_VIEW);
              linkIntent. setData (Uri.parse("https://www.karabuk.edu.tr"));
              startActivity(linkIntent);
          }
      });


    }
}