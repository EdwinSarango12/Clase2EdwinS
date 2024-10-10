package org.example;

public class Zapato {
    String marca;
    String material;
    String color;

    public Zapato(String marca, String material, String color) {
        this.marca = marca;
        this.material = material;
        this.color = color;
    }

    public Zapato() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
