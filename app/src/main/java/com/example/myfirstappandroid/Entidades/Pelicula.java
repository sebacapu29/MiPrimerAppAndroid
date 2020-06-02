package com.example.myfirstappandroid.Entidades;

public class Pelicula {
    private String titulo;
    private String tipo;
    private String descripcion;
    private Integer anio;
    private Float puntaje;
    private String urlFoto;
    private String autor;

    public Pelicula(String titulo, String tipo, String descripcion, Integer anio, Float puntaje, String urlFoto, String autor) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.anio = anio;
        this.puntaje = puntaje;
        this.urlFoto = urlFoto;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Float getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Float puntaje) {
        this.puntaje = puntaje;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
