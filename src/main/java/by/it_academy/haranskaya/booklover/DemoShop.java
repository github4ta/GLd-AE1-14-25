package by.it_academy.haranskaya.booklover;

import java.util.ArrayList;
import java.util.List;

public class DemoShop {
    public static void main(String[] args) {

        System.out.println("=== Инициализация магазина ===");
        Author pushkin = new Author("Пушкин", "Александр");
        Author turgenev = new Author("Тургенев", "Иван");
        Author tolstoy = new Author("Толстой", "Лев");

        List<Book> allBooks = new ArrayList<>();
        allBooks.add(new Book(pushkin, "АСТ", "9-5-17-09415-3", 1836, 68));
        allBooks.add(new Book(pushkin, "АСТ", "978-5-17-094135-4", 1820, 72));
        allBooks.add(new Book(turgenev, "Росмэн", "5-353-00714-3", 1854, 120));
        allBooks.add(new Book(tolstoy, "Белкнига", "978-5-17-094138-5", 1867, 50));
        allBooks.add(new Book(tolstoy, "Росмэн", "978-5-17-094139-2", 1878, 450));
        System.out.println("В магазине доступны следующие книги:");
        allBooks.forEach(System.out::println);
        System.out.println("==============================\n");

        System.out.println("=== Демонстрация фильтров ===");
        System.out.println("\n--- Книги автора с фамилией 'Толстой':");
        Books.filterBooksByAuthor(allBooks, "Толстой").forEach(System.out::println);

        System.out.println("\n--- Книги издательства 'Росмэн':");
        Books.filterBooksByPublisher(allBooks, "Росмэн").forEach(System.out::println);

        System.out.println("\n--- Книги, изданные в 1854 году:");
        Books.filterBooksByYear(allBooks, 1854).forEach(System.out::println);

        System.out.println("\n--- Книги издательства 'АСТ', изданные в 1867 году:");
        Books.filterBooksByPublisherAndYear(allBooks, "АСТ", 1867).forEach(System.out::println);
        System.out.println("=============================\n");


        System.out.println("=== Демонстрация регистрации и входа ===");
        User user1 = new User("+375297166233", "pass123");
        User user2 = new User("+375442445569", "qwerty");

        System.out.println("-> Попытка входа user1 (в первый раз):");
        Login.login(user1);

        System.out.println("\n-> Попытка входа user1 (во второй раз):");
        Login.login(user1);

        System.out.println("\n-> Регистрация user2:");
        Login.register(user2);

        System.out.println("\n-> Попытка входа user2:");
        Login.login(user2);
        System.out.println("========================================\n");


        System.out.println("=== Демонстрация работы с корзиной ===");

        Cart user1Cart = new Cart(user1);


        System.out.println("\n--- Содержимое корзины пользователя " + user1Cart.getUser().getPhoneNumber() + " ---");
        if (user1Cart.getBooks().isEmpty()) {
            System.out.println("Корзина пуста.");
        } else {
            for (Book book : user1Cart.getBooks()) {
                System.out.println(book);
            }
        }
        System.out.println("Итоговая сумма: " + user1Cart.getTotalSum());
        System.out.println("-------------------------------------\n");


        Book bookToAdd1 = Books.filterBooksByIsbn(allBooks, "9-5-17-09415-3").get(0);
        Book bookToAdd2 = Books.filterBooksByIsbn(allBooks, "5-353-00714-3").get(0);

        user1Cart.addBook(bookToAdd1);
        user1Cart.addBook(bookToAdd2);



        System.out.println("\n--- Содержимое корзины пользователя " + user1Cart.getUser().getPhoneNumber() + " ---");
        if (user1Cart.getBooks().isEmpty()) {
            System.out.println("Корзина пуста.");
        } else {
            for (Book book : user1Cart.getBooks()) {
                System.out.println(book);
            }
        }
        System.out.println("Итоговая сумма: " + user1Cart.getTotalSum());
        System.out.println("-------------------------------------\n");


        user1Cart.deleteBook(bookToAdd1);



        System.out.println("\n--- Содержимое корзины пользователя " + user1Cart.getUser().getPhoneNumber() + " ---");
        if (user1Cart.getBooks().isEmpty()) {
            System.out.println("Корзина пуста.");
        } else {
            for (Book book : user1Cart.getBooks()) {
                System.out.println(book);
            }
        }
        System.out.println("Итоговая сумма: " + user1Cart.getTotalSum());
        System.out.println("-------------------------------------\n");


        System.out.println("======================================\n");
    }
}
