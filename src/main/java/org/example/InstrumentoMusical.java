package org.example;

public class InstrumentoMusical {
        String nombre;
        String Especialidad;
        String genero;

        public InstrumentoMusical(String nombre, String Especialidad, String genero) {
            this.nombre = nombre;
            this.Especialidad = Especialidad;
            this.genero = genero;
        }

    public InstrumentoMusical() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
