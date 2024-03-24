package com.example.myfirstapplication;

import static android.app.ProgressDialog.show;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;


import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText etPhoneNumber;
    ImageButton ibCall;
    final static int CALL_REQUEST = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPhoneNumber = findViewById(R.id.et_PhoneNumber);
        ibCall = findViewById(R.id.ib_Call);

        ibCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Vérifier si la permission CALL_PHONE a été accordée
                if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    Call();
                } else {
                    // Si la permission n'a pas été accordée, demander à l'utilisateur de l'accorder
                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, CALL_REQUEST);
                }
            }
        });
    }

    // Méthode pour effectuer l'appel
    private void Call() {
        String phoneNumber = etPhoneNumber.getText().toString();
        Intent CallIntent = new Intent(Intent.ACTION_CALL);
        CallIntent.setData(Uri.parse("tel:" + phoneNumber));
        startActivity(CallIntent);
    }

    // Gérer la réponse de la demande de permission
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == CALL_REQUEST) {
            // Vérifier si la permission CALL_PHONE a été accordée
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Call(); // Appeler si la permission est accordée
            } else {
                // Afficher un message si la permission est refusée
                Toast.makeText(getApplicationContext(), "You have denied the call permission", Toast.LENGTH_SHORT).show();
            }
        }
    }
}












