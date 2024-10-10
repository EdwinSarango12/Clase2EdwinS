package org.example;

public class Videojuego {
    String nombre;
    String categoria;
    String descripcion;
    int salida;

    public Videojuego(String nombre, String categoria, String descripcion, int salida) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.salida= salida;
    }
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoria: " + categoria);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Salida: " + salida);
        System.out.println("**********************************");
    }

}
