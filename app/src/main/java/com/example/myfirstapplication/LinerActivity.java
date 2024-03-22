package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LinerActivity extends AppCompatActivity {
    EditText etUserName,etPassword;
    Button btnLogin;
    String realUserName="hamidie";
    String realPassword="12345";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liner);
        etUserName = findViewById(R.id.et_UserName);
        etPassword = findViewById(R.id.et_Password);
        btnLogin = findViewById(R.id.btn_Login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = etUserName.getText().toString();
                String password = etPassword.getText().toString();
                if (userName.equals(realUserName) && password.equals(realPassword)) {
                    Toast.makeText(getApplicationContext(), "You have logined successfully", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Your userName or password is wrong ", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }}
