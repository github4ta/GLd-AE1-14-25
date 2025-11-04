package by.it_academy.tretyak.booklover.cart;

import by.it_academy.tretyak.booklover.model.Book;
import by.it_academy.tretyak.booklover.model.User;

import java.util.ArrayList;
import java.util.List;

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

    public int getTotalSumInKopecks() {
        return books.stream().mapToInt(Book::getPrice).sum();
    }

    public String getTotalSumFormatted() {
        int totalCents = getTotalSumInKopecks();
        int rubles = totalCents / 100;
        int kopecks = totalCents % 100;
        return String.format("%d руб. %02d коп.", rubles, kopecks);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(Book book) {
        books.remove(book);
    }
}