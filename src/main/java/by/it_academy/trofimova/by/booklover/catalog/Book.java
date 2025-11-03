package by.it_academy.trofimova.by.booklover.catalog;
import java.util.Objects;

public class Book {
    private String nameBook;
    private int price;
    private Author author; //поле типа Author
    private String isbn;
    private String publisher;
    private int year;

    public Book(String nameBook, int price, Author author, String isbn, String publisher, int year) {
        this.nameBook = nameBook;
        this.price = price;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.year = year;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getPrice() {
        return price;
    }

    public Author getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", price=" + price +
                ", author=" + author +
                ", isbn='" + isbn + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && year == book.year && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author) && Objects.equals(isbn, book.isbn) && Objects.equals(publisher, book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, price, author, isbn, publisher, year);
    }
}

