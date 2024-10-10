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
    }
}
