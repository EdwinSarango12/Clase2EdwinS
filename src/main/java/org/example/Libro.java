package org.example;

public class Libro {
    //Atributos
    String titulo;
    String autor;
    String editorial;
    int paginas;

    //metodos
        //constructor (siempre)
    public Libro(String titulo, String autor, String editorial, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.paginas = paginas;
        //puntero al objeto en si, hacia a mi mismo
    }

    public void imprimir(){
        System.out.println("Titulo del libro:"+this.titulo);
        System.out.println("Autor:"+this.autor);
        System.out.println("Editorial:"+this.editorial);
        System.out.println("Tiene "+this.paginas+" paginas");
        System.out.println("------------------------------------");
    }

    public int imprimirCubierta(){
        System.out.println("Total de páginas para la impresión:");
        return this.paginas+5;
    }
}
