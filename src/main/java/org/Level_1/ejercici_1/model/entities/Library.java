package org.Level_1.ejercici_1.model.entities;

import java.util.ArrayList;
import java.util.Comparator;

public class Library {

    private static ArrayList<Book> bookList = new ArrayList<>();

    public static ArrayList<Book> getBookList() {
        return bookList;
    }

    public static String addBook(String title) {
        bookList.add(new Book(title));
        bookList.sort(Comparator.comparing(Book::getTitle));
        return "Libro titulado " + title + " añadido\n";
    }

    public static String showAllBooks() {
        StringBuilder list = new StringBuilder();
        for (Book book : bookList) {
            list.append("- ").append(book.getTitle()).append("\n");
        }
        return list.toString();
    }

    public static String showBook(int index) {
        return bookList.get(index - 1).getTitle();
    }

    public static String addBookHere(int index, String title) {
        bookList.add(index - 1, new Book(title));
        return "Libro titulado \"" + title + "\" añadido\n";
    }

    public static String removeBook(String title) {
        bookList.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
        return "Libro titulado \"" + title + "\" borrado\n";
    }

}