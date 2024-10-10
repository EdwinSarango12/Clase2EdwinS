package org.example;

public class Materia {
    String nombre;
    String creditos;
    String profesor;
    int semestre;

    public Materia(String nombre, String creditos, String profesor, int semestre) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesor = profesor;
        this.semestre = semestre;
    }

    public Materia() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}
