package com.example.myfirstappandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivit extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView lista;
    List<String> strLista= new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        //Conectar la variable lista con el componente visual ListView del Activity
        lista = findViewById(R.id.listViewJuegos);

        strLista.add("GTA V");
        strLista.add("LoL");
        strLista.add("Fifa 2020");
        strLista.add("PES 2020");
        strLista.add("COD Black Ops II");
        strLista.add("SW Battlefront II");
        strLista.add("Spyro");

        //Se asigna al Obj Bundle lo que recibimos en Intent (Es decir, lo que datos que pasamos desde el ActivityMain)
        Bundle extras = getIntent().getExtras();

        String email = extras.getString("email");

        //Setear el titulo del activity
        setTitle(email);

        //Adapter, convierte la lista de strings en elementos visualizables basandose en una plantilla o layout que va se va a realizar para definir como se mostraran los datos
        ArrayAdapter adaptadorListaJuegos = new ArrayAdapter(this,android.R.layout.simple_list_item_1,strLista);

        //Vincular el listview con el adaptador
        lista.setAdapter(adaptadorListaJuegos);

        //Gestion de evento click sobre los elementos de listview
        lista.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String seleccionado = strLista.get(position);
        Log.i("APP","Click en" + seleccionado);
    }
}
