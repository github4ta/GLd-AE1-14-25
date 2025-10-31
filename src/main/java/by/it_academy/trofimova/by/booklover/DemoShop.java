package by.it_academy.trofimova.by.booklover;


import by.it_academy.trofimova.by.booklover.basket.Cart;
import by.it_academy.trofimova.by.booklover.catalog.Author;
import by.it_academy.trofimova.by.booklover.catalog.Book;
import by.it_academy.trofimova.by.booklover.catalog.Books;
import by.it_academy.trofimova.by.booklover.login.Login;
import by.it_academy.trofimova.by.booklover.login.User;
import by.it_academy.trofimova.by.booklover.login.Users;

import java.util.ArrayList;
import java.util.List;

public class DemoShop {
    public static void main(String[] args) {
        Author author1 = new Author("Л.", "Арден");
        Author author2 = new Author("Т.", "Вульф");
        Author author3 = new Author("К", "Малецкая");
        Author author4 = new Author("А.", "Янтарная");
        Author author5 = new Author("М.", "Энде");
        Author author6 = new Author("В.Г.", "Дмитриева");

        List<Book> books = new ArrayList<>();
        books.add(new Book("Во главе конца", 24_19, author1, "978-5-04-122894-1",
                "Эксмо", 2025));
        books.add(new Book("Двойник Запада", 24_44, author1, "978-5-04-168839-4",
                "Эксмо", 2022));
        books.add(new Book("Шарм", 80_60, author2, "978-5-04-216330-2", "Эксмо",
                2025));
        books.add(new Book("Волшебное Рождество", 9_65, author3, "978-5-389-29466-0",
                "Махаон", 5));
        books.add(new Book("Самые красивые сказки о животных", 27_64, author5, "978-5-389-23604-2",
                "Махаон", 10));
        books.add(new Book("Влюбиться в Калининграде", 20_14, author4, "978-5-17-178806-3",
                "АСТ", 2025));
        books.add(new Book("100 заданий для малыша. 0+", 11_99, author6, "978-5-17-153183-6",
                "АСТ", 2023));

        //System.out.println(Books.filterBooksByAuthor(books, "Арден"));
        //System.out.println(Books.filterBooksByPublisher(books, "АСТ"));
        //System.out.println(Books.filterBooksByIsbn(books, "978-5-389-29466-0"));
        //System.out.println(Books.filterBooksByYear(books, 2025));
        //System.out.println(Books.filterBooksByPublisherAndYear(books,"Эксмо", 2025 ));
        //System.out.println(Books.filterBooksByAuthorAndPublisherAndYear(books, "Арден", "Эксмо", 2025));

        Users.addUser(new User(375336390468L, "123456789"));
        Users.addUser(new User(375294567123L, "1a2a3a4a5a"));
        User user3 = new User(375446754819L, "qwerty");
        Users.addUser(user3);

        //System.out.println(Users.getAllUsers());

        User user = new User(375299998877L, "345tre4");

        Users.isUserInList(user3);
        //System.out.println(Users.getAllUsers());

        User user2 = new User(375299678117L, "ffff");
        Login.login(user2); //Вы не были зарегистрированы, мы вас зарегистрировали. Повторите вход.
        //System.out.println(Users.getAllUsers());

        //Login.login(user3);

        User user5 = new User(375112223344L, "qqq");
        Login.register(user5);

        Login.register(user3);

        System.out.println(Users.getAllUsers());


        System.out.println("Demo Корзина");
        Cart cart1 = new Cart(Users.getAllUsers().get(0));
        //System.out.println(cart1);

        Cart cart2 = new Cart(Users.getAllUsers().get(1), books.get(3));
        //System.out.println(cart2);

        Cart cart3 = new Cart(Users.getAllUsers().get(2), Books.filterBooksByAuthor(books, "Арден"));
        //System.out.println(cart3);

        //System.out.println(cart2.getUser());
        //System.out.println(cart3.getTotalSum());
        //System.out.println(cart2.getBooks());
        cart2.addBook(books.get(6));
        //System.out.println(cart2.getBooks());
        cart3.deleteBook(books.get(0));
        //System.out.println(cart3.getBooks())



    }
}
