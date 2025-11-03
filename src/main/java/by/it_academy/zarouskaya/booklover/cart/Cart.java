package by.it_academy.zarouskaya.booklover.cart;

import by.it_academy.zarouskaya.booklover.book.Book;
import by.it_academy.zarouskaya.booklover.user.User;

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
        this.user = user;
        this.books = new ArrayList<>();
        this.books.add(book);
    }

    public Cart(User user, List<Book> books) {
        this.user = user;
        this.books = new ArrayList<>(books);
    }

    public User getUser() {
        return user;
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

    public double getTotalSum() {
        double sum = books.stream()
                .mapToDouble(Book::getPrice)
                .sum();
        return Math.round(sum * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "сart for user: " + user.getMobileNumber() +
                ", Books in cart: " + books +
                ", Total sum: " + getTotalSum() + ".";
    }
}
