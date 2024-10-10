package org.example;

public class Series {
    String name;
    String description;
    String genre;

    public Series(String name, String description, String genre) {
        this.name = name;
        this.description = description;
        this.genre = genre;
    }

    public Series() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void imprimir(){
        System.out.println(name + " " + description + " " + genre);
    }
}
