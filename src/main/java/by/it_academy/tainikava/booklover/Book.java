package by.it_academy.tainikava.booklover;

import java.util.Objects;

public class Book {
    private Author author;
    private String title;
    private String publisher;
    private String isbn;
    private int year;
    private int price;

    public Book(Author author, String title, String publisher, String isbn, int year, int price) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && price == book.price && Objects.equals(author, book.author) && Objects.equals(title, book.title) && Objects.equals(publisher, book.publisher) && Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, publisher, isbn, year, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", isbn='" + isbn + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
