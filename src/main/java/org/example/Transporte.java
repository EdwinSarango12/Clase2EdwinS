package org.example;

public class Transporte {
    String nombre;
    String cooperativa;
    String Llegada;
    String salida;

    public Transporte(String nombre, String cooperativa, String llegada, String salida) {
        this.nombre = nombre;
        this.cooperativa = cooperativa;
        Llegada = llegada;
        this.salida = salida;
    }

    public Transporte() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCooperativa() {
        return cooperativa;
    }

    public void setCooperativa(String cooperativa) {
        this.cooperativa = cooperativa;
    }

    public String getLlegada() {
        return Llegada;
    }

    public void setLlegada(String llegada) {
        Llegada = llegada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }
}
