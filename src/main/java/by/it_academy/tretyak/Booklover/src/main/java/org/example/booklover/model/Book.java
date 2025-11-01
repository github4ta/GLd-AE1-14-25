package org.example.booklover.model;

public class Book {
    private String title;
    private Author author;
    private String publisher;
    private String isbn;
    private int year;
    private double price;

    public Book(String title, Author author, String publisher, String isbn, int year, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
    }

    public String getTitle() { return title; }
    public Author getAuthor() { return author; }
    public String getPublisher() { return publisher; }
    public String getIsbn() { return isbn; }
    public int getYear() { return year; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", publisher='" + publisher + '\'' +
                ", isbn='" + isbn + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
