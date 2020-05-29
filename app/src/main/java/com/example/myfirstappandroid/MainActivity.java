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

        //Identificar el control de Android por el ID que se le setea en las propertis (R= Resourses, id property, eTxtMail = nombre del Id)
        txtMail =  findViewById(R.id.eTxtMail);
        txtClave =  findViewById(R.id.eTxtClave);
        btnIniciar = findViewById(R.id.btnIniciar);

        btnIniciar.setOnClickListener(this::onClick);//Listener para asignarle una funcion al evento del boton
    }

    @Override
    public void onClick(View v) {
        //Instancia el obj intent le pasa el context this (clase) y la clase donde va a dirigirse
        Intent intent = new Intent(this, HomeActivit.class);
        String email = this.txtMail.getText().toString();//Obtener los valores de los controles
        String clave = this.txtClave.getText().toString();
        Toast toast1;

        if(email.isEmpty()){
            toast1 = Toast.makeText(this,"Debe poner un email",Toast.LENGTH_LONG);
            toast1.show();
            return;
        }
        else if(clave.isEmpty()){
            toast1 = Toast.makeText(this,"Debe poner un contraseña",Toast.LENGTH_LONG);
            toast1.show();
            return;
        }
        else if(email.isEmpty()&& clave.isEmpty()){
            toast1 = Toast.makeText(this,"Debe completar los campos",Toast.LENGTH_LONG);
            toast1.show();
            return;
        }

        //Enviar parametros a la otra vista
        intent.putExtra("email", email);

        startActivity(intent);//Lanza el activity
    }
}
