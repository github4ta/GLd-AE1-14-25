package booklover.by.book;

import booklover.by.author.Author;

public class Book {
    private Author author;
    private String title;
    private int year;
    private String publisher;
    private String isbn;
    private double price;

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }
}
