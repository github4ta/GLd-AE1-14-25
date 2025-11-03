package by.it_academy.tainikava.booklover;

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

    public Cart(List<Book> books, User user) {
        this.books = new ArrayList<>(books);
        this.user = user;
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
        if (books.contains(book)) {
            books.remove(book);
        }
    }

    public int getTotalSum() {
        int totalSum = 0;
        for (int i = 0; i < books.size(); i++) {
            totalSum += books.get(i).getPrice();
        }
        return totalSum;
    }
}
