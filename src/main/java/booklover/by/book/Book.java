package booklover.by.book;

import booklover.by.author.Author;

public class Book {
    private Author author;
    private String title;
    private int year;
    private String publisher;
    private String isbn;
    private double price;

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
