package org.example.booklover.cart;

import org.example.booklover.model.Book;
import org.example.booklover.model.User;
import java.util.*;

public class Cart {
    private List<Book> books;
    private User user;

    public Cart(User user) {
        this.user = user;
        this.books = new ArrayList<>();
    }

    public Cart(User user, Book book) {
        this(user);
        this.books.add(book);
    }

    public Cart(User user, List<Book> books) {
        this(user);
        this.books.addAll(books);
    }

    public User getUser() {
        return user;
    }

    public int getTotalSum() {
        return (int) books.stream().mapToDouble(Book::getPrice).sum();
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(Book book) {
        books.remove(book);
    }
}
