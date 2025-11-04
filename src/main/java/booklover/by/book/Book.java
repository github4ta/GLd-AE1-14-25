package booklover.by.book;

import booklover.by.author.Author;

public class Book {
    private Author author;
    private String title;
    private int year;
    private String publisher;
    private String isbn;
    private double price;

    public Book(Author author, String title, int year, String publisher, String isbn, double price) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.publisher = publisher;
        this.isbn = isbn;
        this.price = price;
    }
}
