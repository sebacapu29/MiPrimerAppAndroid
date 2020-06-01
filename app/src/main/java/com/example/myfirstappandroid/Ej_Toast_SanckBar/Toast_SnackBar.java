package com.example.myfirstappandroid.Ej_Toast_SanckBar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.myfirstappandroid.R;
import com.google.android.material.snackbar.Snackbar;

public class Toast_SnackBar extends AppCompatActivity implements View.OnClickListener {
    Button btnToast,btnSnackBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast__snack_bar);

        btnToast = findViewById(R.id.btnToast);
        btnSnackBar = findViewById(R.id.btnSnackBar);

        btnToast.setOnClickListener(this);
        btnSnackBar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnSnackBar){
            Snackbar.make(v,"Mostrando Snack Bar",Snackbar.LENGTH_LONG).show();
        }
        else if(v.getId() == R.id.btnToast){
            Toast.makeText(this, "Mostrando Toast", Toast.LENGTH_LONG).show();
        }
    }
}
