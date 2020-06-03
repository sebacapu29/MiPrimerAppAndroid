package com.example.myfirstappandroid.Ej_RecyclerView;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myfirstappandroid.Entidades.Pelicula;
import com.example.myfirstappandroid.R;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link Pelicula}.
 */
public class MyPeliculasRecyclerViewAdapter extends RecyclerView.Adapter<MyPeliculasRecyclerViewAdapter.ViewHolder> {

    private final List<Pelicula> mValues;
    private Context ctx;
    public MyPeliculasRecyclerViewAdapter(Context ctx, List<Pelicula> items) {
        ctx=ctx;
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        //Rescatamos la posicion del elemento en la posicion que ocupa
        holder.mItem = mValues.get(position);
        holder.textViewTitulo.setText(holder.mItem.getTitulo());
        holder.textViewAnio.setText(holder.mItem.getAnio());
        holder.textViewAutor.setText(holder.mItem.getAutor());
        holder.textViewDescripcion.setText(holder.mItem.getDescripcion());
          holder.ratingBarPelicula.setRating(holder.mItem.getPuntaje());
          Glide.with(ctx).load(holder.mItem.getUrlFoto()).centerCrop().into(holder.imgFoto);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView textViewTitulo;
        public final TextView textViewDescripcion;
        public final TextView textViewAutor;
        public final TextView textViewAnio;
        public final ImageView imgFoto;
        public final RatingBar ratingBarPelicula;
        public final TextView mContentView;
        public Pelicula mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            textViewTitulo = view.findViewById(R.id.textViewTitulo);
            textViewDescripcion = view.findViewById(R.id.textViewDescripcion);
            textViewAutor = view.findViewById(R.id.textViewAutor);
            textViewAnio = view.findViewById(R.id.textViewAnio);
            imgFoto = view.findViewById(R.id.imgFoto);
            ratingBarPelicula = view.findViewById(R.id.ratingBarPelicula);
           //mIdView = (TextView) view.findViewById(R.id.item_number);
            mContentView = (TextView) view.findViewById(R.id.content);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}