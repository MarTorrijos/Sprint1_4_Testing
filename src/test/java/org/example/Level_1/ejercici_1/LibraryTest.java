package org.example.Level_1.ejercici_1;

import org.example.Level_1.ejercici_1.model.entities.Book;
import org.example.Level_1.ejercici_1.model.entities.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @BeforeEach
    public void setUp() {
        Library.getBookList().clear();
        Library.addBook("Dune");
        Library.addBook("La bruja Mon");
    }

    @Test
    void listNotEmpty() {
        assertFalse(Library.getBookList().isEmpty(), "La lista no debería estar vacía");
    }

    @Test
    void expectedListSize() {
        assertEquals(2, Library.getBookList().size(), "El tamaño de la lista debería ser de 2");
    }

    @Test
    void bookTitleInPosition() {
        assertTrue(Library.getBookList().get(0).getTitle().equalsIgnoreCase("Dune"));
    }

    @Test
    void noDuplicatedTitles() {
        List<Book> booksChecked = new ArrayList<>();

        for (Book book : Library.getBookList()) {
            if (!booksChecked.contains(book)) {
                booksChecked.add(book);
            }
        }
        assertEquals(2, booksChecked.size(), "Hay libros repetidos");
    }

    @Test
    void getTitleFromPosition() {
        Book book1 = new Book("Dune");
        Book book2 = new Book("La bruja Mon");

        Library.getBookList().add(0, book1);
        Library.getBookList().add(1, book2);

        assertEquals(book1.getTitle(), Library.getBookList().get(0).getTitle());
    }

    // Afegir un llibre modifica correctament la llista
    @Test
    void modifiedListAfterAddingTitle() {
        Library.addBook("1984");
        assertTrue(Library.getBookList().contains(new Book("1984")), "La lista debería contener '1984'");
    }

    // Eliminar un llibre disminueix la mida de la llista
    @Test
    void listReducedAfterRemovingTitle() {
        Library.removeBook("Dune");
        assertEquals(1, Library.getBookList().size(), "El tamaño de la lista debería ser 1 después de borrar un libro");
        assertFalse(Library.getBookList().contains(new Book("Dune")), "La lista ya no debería contener 'Dune");
    }

    // La llista roman ordenada alfabèticament després d'afegir o eliminar un llibre
    @Test
    void listSortedAfterAddingTitle() {
//        Library.addBook("Book 1");
//        Library.addBook("Book 3");
//        Library.addBook("Book 2");
//
//        List<Book> sortedBooks = Library.getBookList();
//
//        assertEquals("Book 1", sortedBooks.get(0).getTitle(), "El primer libro debería ser Book 1");
//        assertEquals("Book 2", sortedBooks.get(1).getTitle(), "El segundo libro debería ser Book 2");
//        assertEquals("Book 3", sortedBooks.get(2).getTitle(), "El tercer libro debería ser Book 3");

        Library.getBookList().clear();

        Library.addBook("Book 1");
        Library.addBook("Book 3");
        Library.addBook("Book 2");


        assertEquals("Book 1", Library.getBookList().get(0).getTitle());
        assertEquals("Book 2", Library.getBookList().get(1).getTitle());
        assertEquals("Book 3", Library.getBookList().get(2).getTitle());

        Library.addBook("Book 4");
        Library.removeBook("Book 1");

        assertEquals("Book 2", Library.getBookList().get(0).getTitle());
        assertEquals("Book 3", Library.getBookList().get(1).getTitle());
        assertEquals("Book 4", Library.getBookList().get(2).getTitle());
    }

}
