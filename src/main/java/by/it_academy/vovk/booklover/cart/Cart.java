package by.it_academy.vovk.booklover.cart;

import by.it_academy.vovk.booklover.user.User;
import by.it_academy.vovk.booklover.book.Book;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Book> books;
    private User user;
    private int totalSum;


    public Cart(User user) {
        this.user = user;
        this.books = new ArrayList<>();
        this.totalSum = 0;
    }

    public Cart(User user, Book firstBook) {
        this.user = user;
        this.books = new ArrayList<>();
        this.books.add(firstBook);
        this.totalSum = 0;
    }


    public User getUser() {
        return user;
    }

    public List<Book> getBooks() {
        return books;
    }

public int getTotalSum(){
        int sum = 0;
        for (int i = 0; i < books.size(); i++) {
        Book book = books.get(i);
        sum+=book.getPrice();
    }
    return sum;
}

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
        } else {
            System.out.println("Такой книги нет в корзине");
        }
    }
}
