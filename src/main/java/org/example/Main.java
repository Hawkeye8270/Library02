package org.example;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("FirstTitle", "FirstAuthor", 1999);
        Book book2 = new Book("SecondTitle", "SecondAuthor", 1985);
        Book book3 = new Book("ThirdTitle", "ThirdAuthor", 2000);

        Library lib = new Library();

        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);

        lib.showLib();
        System.out.println("-".repeat(50));

        lib.removeBook(book2);

        lib.showLib();
        System.out.println("-".repeat(50));

        lib.showAuthor(book1);

    }
}