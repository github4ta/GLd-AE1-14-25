package booklover.by.cart;

import booklover.by.book.Book;
import booklover.by.user.User;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Book> books;
    private User user;

    public Cart(User user) {
        this.user = user;
        this.books = new ArrayList<>();
    }
}
