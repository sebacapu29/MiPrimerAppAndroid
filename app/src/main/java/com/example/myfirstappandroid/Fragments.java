package com.example.myfirstappandroid;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;


import android.view.View;

public class Fragments extends AppCompatActivity {

    boolean modoDia=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ///Cargar el fragment por defecto
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.contenedor,new ModoDiaFragment())
                .commit();

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Fragment f =null;

                if(modoDia){
                    f = new ModoNocheFragment();
                }
                else{
                    f = new ModoDiaFragment();
                }
                modoDia = !modoDia;

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contenedor,f)
                        .commit();

            }
        });
    }

}
