package booklover.by.cart;

import booklover.by.book.Book;
import booklover.by.user.User;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Book> books;
    private User user;

    public Cart() {
        this.books = new ArrayList<>();
    }

    public Cart(List<Book> books, User user) {
        this.books = new ArrayList<>();
        this.user = user;
        this.books.addAll(books);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Cart(User user) {
        this.user = user;
        this.books = new ArrayList<>();
    }

    public Cart(User user, Book book) {
        this(user);
        this.books.add(book);
    }

    public void deleteBook(Book book) {
        if (book != null && books.contains(book)) {
            books.remove(book);
        }
    }
          
    public void addBook(Book book) {
        if (book != null && !books.contains(book)) {
            books.add(book);
        }
    }

    public double getTotalSum() {
        return books.stream().mapToDouble(Book::getPrice).sum();
    }
}
