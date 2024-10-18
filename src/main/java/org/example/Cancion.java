package org.example;

public class Cancion {
    String nombre;
    String artista;
    String duracion;

    public Cancion(String nombre, String artista, String duracion) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getArtista() {
        return artista;
    }
    public String getDuracion() {
        return duracion;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    public void mostrarCancion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Artista: " + artista);
        System.out.println("Duracion: " + duracion);

    }

}
