package org.example.booklover.demo;

import org.example.booklover.model.*;
import org.example.booklover.service.*;
import org.example.booklover.cart.Cart;
import org.example.booklover.util.Login;
import java.util.*;

public class DemoShop {
    public static void main(String[] args) {

        Author pushkin = new Author("Пушкин", "Александр Сергеевич");
        Author tolstoy = new Author("Толстой", "Лев Николаевич");


        Book book1 = new Book("Евгений Онегин", pushkin, "АСТ", "978-5-17-123456-7", 2020, 25.50);
        Book book2 = new Book("Война и мир", tolstoy, "Эксмо", "978-5-699-123456-7", 2019, 45.00);
        Book book3 = new Book("Капитанская дочка", pushkin, "АСТ", "978-5-17-765432-1", 2021, 20.00);
        Book book4 = new Book("Анна Каренина", tolstoy, "АСТ", "978-5-17-987654-3", 2020, 35.75);

        List<Book> allBooks = List.of(book1, book2, book3, book4);


        System.out.println("Книги Пушкина:");
        Books.filterBooksByAuthor(allBooks, "Пушкин").forEach(System.out::println);

        System.out.println("\nКниги издательства АСТ:");
        Books.filterBooksByPublisher(allBooks, "АСТ").forEach(System.out::println);

        System.out.println("\nКниги 2020 года:");
        Books.filterBooksByYear(allBooks, 2020).forEach(System.out::println);

        System.out.println("\nКниги АСТ за 2020 год:");
        Books.filterBooksByPublisherAndYear(allBooks, "АСТ", 2020).forEach(System.out::println);

        System.out.println("\nКниги Пушкина в АСТ за 2020 год:");
        Books.filterBooksByAuthorAndPublisherAndYear(allBooks, "Пушкин", "АСТ", 2020)
                .forEach(System.out::println);


        User user1 = new User("375291234567", "pass123");
        User user2 = new User("375297654321", "qwerty");

        Login login = new Login();
        login.login(user1); // не зарегистрирован → регистрируется
        login.login(user1); // теперь зарегистрирован

        login.register(user2); // явная регистрация

        System.out.println("\nВсе пользователи:");
        Users.getAllUsers().forEach(System.out::println);

                Cart cart = new Cart(user1, book1);
        cart.addBook(book3);
        System.out.println("\nКорзина пользователя " + user1.getPhoneNumber() + ":");
        cart.getBooks().forEach(System.out::println);
        System.out.println("Общая сумма: " + cart.getTotalSum() + " руб.");

        cart.deleteBook(book1);
        System.out.println("\nПосле удаления 'Евгений Онегин':");
        cart.getBooks().forEach(System.out::println);
        System.out.println("Новая сумма: " + cart.getTotalSum() + " руб.");
    }
}
