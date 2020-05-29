package com.example.myfirstappandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    private NfcAdapter mNfcAdapter;
    EditText txtMail;
    EditText txtClave;
    Button btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMail =  findViewById(R.id.eTxtMail);
        txtClave =  findViewById(R.id.eTxtClave);
        btnIniciar = findViewById(R.id.btnIniciar);

        btnIniciar.setOnClickListener(this::onClick);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, HomeActivit.class);
        String email = this.txtMail.getText().toString();
        String clave = this.txtClave.getText().toString();

        if(email.isEmpty()){
            Toast.makeText(this,"Debe poner un email",Toast.LENGTH_LONG);
        }
        else if(email.isEmpty()){
            Toast.makeText(this,"Debe poner un contraseña",Toast.LENGTH_LONG);
        }
        else{
            Toast.makeText(this,"Debe completar los campos",Toast.LENGTH_LONG);
        }
        intent.putExtra("email", email);

        startActivity(intent);
    }
}
