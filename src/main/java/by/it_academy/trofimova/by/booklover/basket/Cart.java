package by.it_academy.trofimova.by.booklover.basket;

import by.it_academy.trofimova.by.booklover.catalog.Book;
import by.it_academy.trofimova.by.booklover.login.User;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private User user;
    private List<Book> books;


    public Cart(User user) {
        this.user = user;
        this.books = new ArrayList<>();
    }

    public Cart(User user, Book book) {
        this.user = user;
        this.books = new ArrayList<>();
        this.books.add(book);
    }

    public Cart(User user, List<Book> books) {
        this.user = user;
        this.books = new ArrayList<>();
        this.books.addAll(books);
    }

    public User getUser() {
        return user;
    }

    public int getTotalSum() {
        return books.stream().mapToInt(Book::getPrice).sum();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        if (book == null) {
            books = new ArrayList<>();
        }
        books.add(book);
    }

    public void deleteBook(Book book) {
        if (book != null) {
            books.remove(book);
        }
    }

    @Override
    public String toString() {
        return "Cart{" +
                "user=" + user +
                ", books=" + books +
                '}';
    }
}
