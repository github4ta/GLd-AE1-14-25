package by.it_academy.haranskaya.booklover;

import by.it_academy.haranskaya.booklover.Book;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Book> books;
    private User user;

    public Cart(User user) {
        this.user = user;
        this.books = new ArrayList<>(); // Инициализация пустого списка
    }

    public Cart(User user, Book book) {
        this(user);// Вызываем первый конструктор, чтобы не дублировать код
        this.addBook(book);
    }

    public Cart(List<Book> books, User user) {
        this.books = new ArrayList<>(books);
        this.user = user;
    }

    public User getUser() {
        return this.user;
    }

    public int getTotalSum() {
        int totalSum = 0;
        for (Book book : this.books) {
            totalSum += book.getPrice(); // Сокращенная запись для totalSum = totalSum + book.getPrice()
        }
        return totalSum;
    }

    public List<Book> getBooks() {
        return this.books;
    }

    public void addBook(Book book) {
        this.books.add(book);
        System.out.println("Книга '" + "' добавлена в корзину.");
    }

    public void deleteBook(Book book) {
        boolean removed = this.books.remove(book);
        if (removed) {
            System.out.println("Книга '" + "' удалена из корзины.");
        } else {
            System.out.println("Книга '" + "' не найдена в корзине.");
        }
    }
}
