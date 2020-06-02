package com.example.myfirstappandroid.Ej_RecyclerView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myfirstappandroid.R;

public class Peliculas extends AppCompatActivity implements PeliculasFragment.OnListFragmentInteraction{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peliculas);
    }
}