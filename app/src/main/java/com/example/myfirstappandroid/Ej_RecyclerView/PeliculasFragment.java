package com.example.myfirstappandroid.Ej_RecyclerView;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myfirstappandroid.Entidades.Pelicula;
import com.example.myfirstappandroid.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A fragment representing a list of Items.
 */
public class PeliculasFragment extends Fragment {

    RecyclerView recyclerView;
    MyPeliculasRecyclerViewAdapter recyclerAdapterView;
    List<Pelicula> listaPeliculas;

    private static final String ARG_COLUMN_COUNT = "column-count";

    private int mColumnCount = 1;

    private OnListFragmentInteraction mListener;

    public interface OnListFragmentInteraction {
        //public void onArticleSelected(int position);
    }
    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public PeliculasFragment() {
    }

    @SuppressWarnings("unused")
    public static PeliculasFragment newInstance(int columnCount) {
        PeliculasFragment fragment = new PeliculasFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            //Array Peliculas
            listaPeliculas = new ArrayList<Pelicula>();
            listaPeliculas.add(new Pelicula("Avengers: End Game","Ciencia Ficcion","El universo esta en peligro los Avengers protegen la tierra",2019,4.7f,"","Joe Russo"));
            listaPeliculas.add(new Pelicula("Avatar","Ciencia Ficcion","Militares intentan destruir habitat de una raza que tiene mucha conexion con la naturaleza",2009,4.6f,"","James Cameron"));
            listaPeliculas.add(new Pelicula("En busca de la felicidad","Drama","Un padre que lucha por mantenerse a flote luego de ser expulsado y viviendo sin ningun lugar con su hijo",2006,4.8f,"","Gabriele Muccino"));
            recyclerAdapterView = new MyPeliculasRecyclerViewAdapter(listaPeliculas);
            recyclerView.setAdapter(recyclerAdapterView);
        }
        return view;
    }
}