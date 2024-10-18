package org.example;

public class Pelicula {
    String tituloPelicula;
    String categoriaPelicula;

    public Pelicula(String titulo, String categoria) {
        this.tituloPelicula = titulo;
        this.categoriaPelicula = categoria;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String titulo) {
        this.tituloPelicula = titulo;
    }

    public String getCategoriaPelicula() {
        return categoriaPelicula;
    }

    public void setCategoriaPelicula(String categoria) {
        this.categoriaPelicula = categoria;
    }

    public void mostrarpelicula() {
        System.out.println("EL titulo es: " + tituloPelicula);
        System.out.println("EL categoria es: " + categoriaPelicula);

    }
}
