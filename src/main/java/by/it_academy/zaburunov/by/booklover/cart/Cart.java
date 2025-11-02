package by.it_academy.zaburunov.by.booklover.cart;

import by.it_academy.zaburunov.by.booklover.book.Book;
import by.it_academy.zaburunov.by.booklover.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cart {
    private List<Book> books = new ArrayList<>();
    private User user;

    public Cart(User user) {
        this.user = user;
    }

    public Cart(User user, Book book) {
        this.user = user;
        this.books.add(book);
    }

    public Cart(List<Book> books, User user) {
        this.books = books;
        this.user = user;
    }

    public int getTotalSum() {
        int result = 0;
        for (Book book : books) {
            result += book.getPrice();
        }
        return result;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Книга удалена");
        } else System.out.println("Такой книги нет в корзине");
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

    @Override
    public String toString() {
        return "Cart{" +
                "books=" + books +
                ", user=" + user +
                '}';
    }
}

