package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public List<Book> lib = new ArrayList<>();

    public void addBook(Book book) {
        lib.add(book);
    }

    public void removeBook(Book book) {
        lib.remove(book);
    }

    public void showLib() {
        System.out.println("Список книг:");
        for (Book book : lib) {
            System.out.println(book.toString());
        }
    }

    public void showAuthor(Book book) {
        System.out.println("Автор книги " + book.getTitle() + " - " + book.getAuthor());
    }
}
