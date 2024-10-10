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
    public String getNombre() {
        return nombre;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getSalida() {
        return salida;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setSalida(int salida) {
        this.salida = salida;
    }
}
