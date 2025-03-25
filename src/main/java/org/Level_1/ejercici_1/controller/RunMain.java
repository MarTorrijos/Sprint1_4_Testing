package org.Level_1.ejercici_1.controller;

import org.Level_1.ejercici_1.data.BookInstances;
import org.Level_1.ejercici_1.model.entities.Library;

public class RunMain {

    public static void run() {

        BookInstances.loadBooks();

        System.out.println("Lista inicial de libros:\n" + Library.showAllBooks());

        System.out.println(Library.addBook("Larga vida al mal"));

        System.out.println("Todos los libros actuales:\n" + Library.showAllBooks());

        System.out.println("Voy a asumir que la posición la introduce el usuario. " +
                "Así que el index no será 0 based sino que empiezan desde el 1\n");

        System.out.println("Obtenemos el título de un libro por su posición (posición 1):\n" + " -  "
                + Library.showBook(1) + "\n");

        System.out.println("Añadimos un libro en una posición específica (posición 1):\n" + Library.addBookHere(1, "Ella que llegó a ser el Sol"));

        System.out.println("Comprobamos que el libro está en la posición específica:\n" + Library.showAllBooks());

        System.out.println(Library.removeBook("Larga vida al mal"));

        System.out.println("Comprobación de que el libro se ha borrado:\n" + Library.showAllBooks());

    }

}
