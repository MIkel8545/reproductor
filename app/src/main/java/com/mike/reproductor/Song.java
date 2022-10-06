package com.mike.reproductor;

public class Song {

    int Imagen;
    String Nombre;
    String Artista;

    public Song(int imagen, String nombre, String artista) {
        Imagen = imagen;
        Nombre = nombre;
        Artista = artista;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String artista) {
        Artista = artista;
    }
}
