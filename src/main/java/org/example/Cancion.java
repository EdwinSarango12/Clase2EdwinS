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
    public void imprime(){
        System.out.println(nombre + " - " + artista + " - " + duracion);
        System.out.println("--------------------------------------");

    }

}
