package booklover.by.book;

import booklover.by.author.Author;

public class Book {
    private Author author;
    private String title;
    private int year;
    private String publisher;
    private String isbn;
    private double price;

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", publisher='" + publisher + '\'' +
                ", isbn='" + isbn + '\'' +
                ", price=" + price +
                '}';
    }}
