package by.it_academy.zaburunov.by.booklover.book;

import java.util.Objects;

public class Book {
    private String name;
    private int pages;
    private Author author;
    private String publisher;
    private String isbn;
    private int year;
    private int price;

    public Book(String name, int pages, Author author, String publisher, String isbn, int year, int price) {
        this.name = name;
        this.pages = pages;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages && year == book.year && price == book.price && Objects.equals(name, book.name) && Objects.equals(author, book.author) && Objects.equals(publisher, book.publisher) && Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pages, author, publisher, isbn, year, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", author=" + author +
                ", publisher='" + publisher + '\'' +
                ", isbn='" + isbn + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}

