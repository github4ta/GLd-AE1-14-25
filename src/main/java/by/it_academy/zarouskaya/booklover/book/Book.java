package by.it_academy.zarouskaya.booklover.book;

import java.util.Objects;

public class Book {
    private String title;
    private String genre;
    private double price;
    private String isbn;
    private String publisher;
    private int year;
    private Author author;

    public Book() {
    }

    public Book(String title, String genre, double price, String isbn, String publisher, int year, Author author) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.isbn = isbn;
        this.publisher = publisher;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book {\n" +
                "  Title: '" + title + "'\n" +
                "  Genre: '" + genre + "'\n" +
                "  Price: " + price + "\n" +
                "  ISBN: '" + isbn + "'\n" +
                "  Publisher: '" + publisher + "'\n" +
                "  Year: " + year + "\n" +
                "  Author: " + author + "\n" +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && year == book.year && Objects.equals(title, book.title) && Objects.equals(genre, book.genre) && Objects.equals(isbn, book.isbn) && Objects.equals(publisher, book.publisher) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, genre, price, isbn, publisher, year, author);
    }
}
