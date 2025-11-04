package booklover.by.cart;

import booklover.by.book.Book;
import booklover.by.user.User;

import java.util.List;

public class Cart {
    private List<Book> books;
    private User user;

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
}
