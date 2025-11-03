package by.it_academy.haranskaya.booklover;

import java.util.Objects;

public class Book {
    private Author author;
    private String publisher;
    private String isbn;
    private int year;
    private int price;

    public Book(Author author, String publisher, String isbn, int year, int price) {
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
    }

    public Author getAuthor() {
        return author;
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
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", publisher='" + publisher + '\'' +
                ", isbn='" + isbn + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getYear() == book.getYear() && getPrice() == book.getPrice() && Objects.equals(getAuthor(), book.getAuthor()) && Objects.equals(getPublisher(), book.getPublisher()) && Objects.equals(getIsbn(), book.getIsbn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthor(), getPublisher(), getIsbn(), getYear(), getPrice());
    }
}




