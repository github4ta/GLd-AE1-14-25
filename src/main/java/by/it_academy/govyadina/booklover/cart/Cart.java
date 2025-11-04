package by.it_academy.govyadina.booklover.cart;

import by.booklover.Book;
import by.booklover.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cart {
    private List<by.booklover.Book> books;
    private User user;

    public Cart(User user) {
        this.user = user;
        this.books = new ArrayList<>();
    }

    public Cart(User user, by.booklover.Book book) {
        this.user = user;
        this.books = new ArrayList<>();
        this.books.add(book);
    }

    public Cart(User user, List<by.booklover.Book> books) {
        this.user = user;
        this.books = new ArrayList<>();
    }

    public Cart() {

    }

    public void setBooks(List<by.booklover.Book> books) {
        this.books = books;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "books=" + books +
                ", user=" + user +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Objects.equals(books, cart.books) && Objects.equals(user, cart.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books, user);
    }



    public User getUser() {
        return user;
    }

    public int getTotalSum() {
        double booksSum = 0;
        for (int i = 0; i < books.size(); i++) {
            booksSum = booksSum + books.get(i).getPrice();
        }
        return (int) booksSum;
    }

    public List<by.booklover.Book> getBooks() {
        return books;
    }

    public void addBook(by.booklover.Book book) {
        if (books == null) {
            books = new ArrayList<>();
        }
        books.add(book);
    }

    public void deleteBook(Book book) {
        if (books != null) {
            books.remove(book);
        }
    }
}

