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
}
