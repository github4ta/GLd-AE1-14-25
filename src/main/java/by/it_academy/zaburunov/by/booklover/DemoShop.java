package by.it_academy.zaburunov.by.booklover;

import by.it_academy.zaburunov.by.booklover.book.Author;
import by.it_academy.zaburunov.by.booklover.book.Book;
import by.it_academy.zaburunov.by.booklover.book.Books;
import by.it_academy.zaburunov.by.booklover.cart.Cart;
import by.it_academy.zaburunov.by.booklover.login.Login;
import by.it_academy.zaburunov.by.booklover.user.User;
import by.it_academy.zaburunov.by.booklover.user.Users;

import java.util.ArrayList;
import java.util.List;

public class DemoShop {
    public static void main(String[] args) {

        Author au1 = new Author("Алексей", "Иванов");
        Author au2 = new Author("Мария", "Петрова");
        Author au3 = new Author("Игорь", "Смирнов");
        Author au4 = new Author("Елена", "Кузнецова");
        Author au5 = new Author("Дмитрий", "Попов");

        int pages1 = 150;
        int pages2 = 220;
        int pages3 = 300;
        int pages4 = 420;
        int pages5 = 88;

        String pub1 = "АСТ";
        String pub2 = "Эксмо";
        String pub3 = "Питер";
        String pub4 = "Манн, Иванов";
        String pub5 = "Альпина";

        String isbn1 = "978-5-17-000000-0";
        String isbn2 = "978-5-699-234567-2";
        String isbn3 = "978-5-446-678901-6";
        String isbn4 = "978-5-001-012345-0";
        String isbn5 = "0-306-40615-2";

        int year1 = 2001;
        int year2 = 2008;
        int year3 = 2015;
        int year4 = 2020;
        int year5 = 2024;

        int price1 = 100;
        int price2 = 400;
        int price3 = 500;
        int price5 = 1000;

        Book b1  = new Book("Книга 01 — Тени истории",     pages1, au1, pub1, isbn1, year1, price1);
        Book b2  = new Book("Книга 02 — Ветер перемен",    pages2, au2, pub2, isbn2, year2, price2);
        Book b3  = new Book("Книга 03 — Ночная тропа",     pages3, au3, pub3, isbn3, year3, price3);
        Book b4  = new Book("Книга 04 — Город на холме",   pages4, au4, pub4, isbn4, year4, price1);
        Book b5  = new Book("Книга 05 — Забытые слова",    pages5, au5, pub5, isbn5, year5, price5);

        Book b6  = new Book("Книга 06 — Океан внутри",     pages1, au2, pub1, isbn1, year1, price5);
        Book b7  = new Book("Книга 07 — Последний сигнал", pages2, au3, pub2, isbn2, year2, price3);
        Book b8  = new Book("Книга 08 — Карта звёзд",      pages3, au4, pub3, isbn3, year3, price2);
        Book b9  = new Book("Книга 09 — Соль и снег",      pages4, au5, pub4, isbn4, year4, price1);
        Book b10 = new Book("Книга 10 — Письма к сестре",  pages5, au1, pub5, isbn5, year5, price3);

        Book b11 = new Book("Книга 11 — Тайна ручья",      pages1, au3, pub1, isbn1, year1, price3);
        Book b12 = new Book("Книга 12 — Эксперимент 47",   pages2, au4, pub2, isbn2, year2, price2);
        Book b13 = new Book("Книга 13 — Между строк",      pages3, au5, pub3, isbn3, year3, price5);
        Book b14 = new Book("Книга 14 — Белая птица",      pages4, au1, pub4, isbn4, year4, price1);
        Book b15 = new Book("Книга 15 — Обретённый дом",   pages5, au2, pub5, isbn5, year5, price1);

        Book b16 = new Book("Книга 16 — Сердце механизма", pages1, au4, pub1, isbn1, year1, price2);
        Book b17 = new Book("Книга 17 — Дорога без края",  pages2, au5, pub2, isbn2, year2, price5);
        Book b18 = new Book("Книга 18 — Песнь ветра",      pages3, au1, pub3, isbn3, year3, price5);
        Book b19 = new Book("Книга 19 — Зеркало памяти",   pages4, au2, pub4, isbn4, year4, price3);
        Book b20 = new Book("Книга 20 — Пробуждение",      pages5, au3, pub5, isbn5, year5, price3);

        List<Book> bookList = new ArrayList<>(
                List.of(b1, b2, b3, b4, b5,
                        b6, b7, b8, b9, b10,
                        b11, b12, b13, b14, b15,
                        b16, b17, b18, b19, b20)
        );

        List<Book> filterBooksByAuthor = Books.filterBooksByAuthor(bookList, au1.getSurname());
        System.out.printf("Отфильтрованные книги по автору: %s \n %s", au1.getSurname(), filterBooksByAuthor);

        List<Book> filterBooksByPublisher = Books.filterBooksByPublisher(bookList, pub1);
        System.out.printf("Отфильтрованные книги по издателю: %s \n %s ", pub1, filterBooksByPublisher);

        List<Book> filterBooksByYear = Books.filterBooksByYear(bookList, year1);
        System.out.printf("Отфильтрованные книги по %s году: \n %s", year1, filterBooksByYear);

        List<Book> filterBooksByIsbn = Books.filterBooksByIsbn(bookList, isbn1);
        System.out.printf("Отфильтрованные книги по ISBN: %s \n %s", isbn1, filterBooksByIsbn);

        List<Book> filterBooksByPublisherAndYear = Books.filterBooksByPublisherAndYear(bookList, pub1 , year1);
        System.out.printf("Отфильтрованные книги по издателю %s и году %s: \n %s", pub1, year1,
                filterBooksByPublisherAndYear);

        List<Book> filterBooksByAuthorAndPublisherAndYear = Books.filterBooksByAuthorAndPublisherAndYear(bookList,
                au2.getSurname(), pub2, year2);
        System.out.printf("Отфильтрованные книги по автору %s, издателю %s и году %s: \n %s",
                au1, pub1, year1, filterBooksByAuthorAndPublisherAndYear);

        User user1 = new User(1111111, "User 1 password");
        Users.addUser(user1);

        System.out.println(Users.isUserInList(user1));

        Login login = new Login();

        User user2 = new User(22222222, "User 2 password");
        User user3 = new User(33333333, "User 3 password");
        login.register(user2);
        login.register(user3);

        System.out.println(Users.getAllUsers());

        login.login(user2);

        Cart cart = new Cart(user1);
        System.out.println(cart.getUser());

        Cart cart2 = new Cart(user2, b1);
        System.out.println(cart2.getBooks());
        System.out.println("Стоимость всех книг юзера" + cart2.getTotalSum());

        Cart cart3 = new Cart(bookList,user3);
        System.out.println("Стоимость всех книг юзера" + cart3.getTotalSum());

        cart2.addBook(b2);
        System.out.println("Список книг после добавления " + cart2.getBooks());

        cart3.deleteBook(b2);
        System.out.println("Список книг после удаления второй книги " + cart3.getBooks());
    }
}

