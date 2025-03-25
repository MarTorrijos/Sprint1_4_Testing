package org.Level_1.ejercici_1.data;

import org.Level_1.ejercici_1.model.entities.Book;

import static org.Level_1.ejercici_1.model.entities.Library.getBookList;

public class BookInstances {

    public static void loadBooks() {
        getBookList().add(new Book("El imperio final"));
        getBookList().add(new Book("La guerra de la amapola"));
    }

}
