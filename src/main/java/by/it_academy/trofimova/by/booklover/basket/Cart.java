package by.it_academy.trofimova.by.booklover.basket;

import by.it_academy.trofimova.by.booklover.catalog.Book;
import by.it_academy.trofimova.by.booklover.login.User;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private User user;
    private List<Book> books;


    public Cart(User user) {
        this.user = user;
    }

    public Cart(User user, Book book) {
        this.user = user;
        this.books = new ArrayList<>();
        this.books.add(book);
        //создает экземпляр отдельной корзины для
        //конкретного пользователя и добавляет в его корзину-список книгу
    }

    public Cart(User user, List<Book> books) {
        this.user = user;
        this.books = new ArrayList<>();
        this.books.addAll(books);
        //создает экземпляр отдельной
        //корзины для конкретного пользователя и добавляет в его корзину-список книги
    }

    public User getUser() {
        return user;
    }

    public int getTotalSum() {
        int result = 0;
        for (int i = 0; i < books.size(); i++) {
            result += books.get(i).getPrice();
        }
        return result;
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

    @Override
    public String toString() {
        return "Cart{" +
                "user=" + user +
                ", books=" + books +
                '}';
    }
}
