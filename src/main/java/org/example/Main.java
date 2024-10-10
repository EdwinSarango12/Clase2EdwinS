package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Los libros de la biblioteca son: "); // display output
        //para declarar el objeto
        //para instanciar una clase
        //crear un objeto de la clase
        Libro libro1= new Libro("El resplandor","Stephen King", "De bolsillo", 600);
        Libro libro2= new Libro("La perla","John Steinbeck", "Edshasa", 144);
        Libro libro3= new Libro("Meridiano de sangre","Cormac McCarthy", "Random House", 327);
        Libro libro4= new Libro("La enfermedad mortal","Soren Kierkegaard", "Trotta", 176);
        Libro libro5= new Libro("El alguimista","Paulo Coehlo", "Planeta", 192);

        System.out.println("------------------------------------");
        libro1.imprimir();
        System.out.println(libro1.imprimirCubierta());
        libro2.imprimir();
        System.out.println(libro2.imprimirCubierta());
        libro3.imprimir();
        System.out.println(libro3.imprimirCubierta());
        libro4.imprimir();
        System.out.println(libro4.imprimirCubierta());
        libro5.imprimir();
        System.out.println(libro5.imprimirCubierta());
        System.out.println(("------------------------------------"));

        System.out.println("\nLista de videojuegos seleccionados:");
        System.out.println("*******************************");
        Videojuego juego1= new Videojuego("Minecraft", "Aventura","Videojuego de imaginación y supervivencia con diferentes modos de aventura, survival o creativo", 2009);
        Videojuego juego2= new Videojuego("Geometry Dash", "Runner, musica, plataform","es un videojuego de plataformas y videojuego rítmico ", 2013);
        Videojuego juego3= new Videojuego("Rocket League", "Acción, deportes","Rocket League es un videojuego que combina el fútbol con los vehículos.", 2015);

        juego1.mostrar();
        juego2.mostrar();
        juego3.mostrar();
        System.out.println("*******************************\n");

        System.out.println("Lista de canciones seleccionados:");
        System.out.println("++++++++++++++++++++++++++++++++++++");
        Cancion cancion1= new Cancion("So Cold", "Balu Brigada", "3:34");
        Cancion cancion2= new Cancion("Misses", "Dominic Fike", "1:14");
        Cancion cancion3= new Cancion("Call On Me", "Throne", "3:05");

        cancion1.imprime();
        cancion2.imprime();
        cancion3.imprime();
        System.out.println("++++++++++++++++++++++++++++++++++++");
    }
}
