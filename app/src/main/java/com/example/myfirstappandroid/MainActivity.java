package com.example.myfirstappandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myfirstappandroid.Ej_ListViews.HomeActivit;
import com.example.myfirstappandroid.Ej_RecyclerView.Peliculas;
import com.example.myfirstappandroid.Ej_Toast_SanckBar.Toast_SnackBar;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    private NfcAdapter mNfcAdapter;
    EditText txtMail;
    EditText txtClave;
    Button btnIniciar,btnToastSank;
    Button btnIrAFragments;
    Button btnRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Identificar el control de Android por el ID que se le setea en las propertis (R= Resourses, id property, eTxtMail = nombre del Id)

        btnIniciar = findViewById(R.id.btnIniciar);
        btnToastSank = findViewById(R.id.btnToastSnack);
        btnIrAFragments = findViewById(R.id.btnFragments);
        btnRecycler = findViewById(R.id.btnRecycler);

        btnIniciar.setOnClickListener(this::onClick);//Listener para asignarle una funcion al evento del boton
        btnIrAFragments.setOnClickListener(this::onClick2);
        btnToastSank.setOnClickListener(this::onClickToastSnak);
        btnRecycler.setOnClickListener(this::onClick);
    }

    @Override
    public void onClick(View v) {
        //Instancia el obj intent le pasa el context this (clase) y la clase donde va a dirigirse
        Intent intent = new Intent(this, HomeActivit.class);
        //String email = this.txtMail.getText().toString();//Obtener los valores de los controles
        String email = "Bienvenido";
        //String clave = this.txtClave.getText().toString();

        if(v.getId() == R.id.btnRecycler){
            intent = new Intent(this, Peliculas.class);
            startActivity(intent);
        }

        //Enviar parametros a la otra vista
        intent.putExtra("email", email);
        startActivity(intent);//Lanza el activity
    }
    public void onClick2(View v){
        Intent intent = new Intent(this, Fragments.class);
        startActivity(intent);
    }
    public void onClickToastSnak(View v){
        Intent intent = new Intent(this, Toast_SnackBar.class);
        startActivity(intent);
    }
}
