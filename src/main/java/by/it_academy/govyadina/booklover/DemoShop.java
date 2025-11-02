package by.it_academy.govyadina.booklover;

import by.booklover.Author;
import by.booklover.Book;
import by.booklover.Cart;
import by.booklover.Login;
import by.booklover.User;
import by.booklover.Users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoShop {
    public static void main(String[] args) {
        by.booklover.Author author = new by.booklover.Author("Гоголь", "Николай");
        by.booklover.Author author1 = new by.booklover.Author("Чехов", "Антон");
        by.booklover.Author author2 = new by.booklover.Author("Чехов", "Антон");
        by.booklover.Author author3 = new by.booklover.Author("Достоевский", "Федор");
        by.booklover.Author author4 = new Author("Достоевский", "федор");

        List<by.booklover.Book> books = new ArrayList<>();
        books.add(new by.booklover.Book(author, "Мертвые души", 1842, "Художественная литература", "№3", 125));
        books.add(new by.booklover.Book(author1, "Душечка", 1897, "Русский писатель", "№5", 564));
        books.add(new by.booklover.Book(author2, "Человек в футляре", 1897, "Русский писатель", "№1", 451));
        books.add(new by.booklover.Book(author3, "Преступление и наказание", 1866, "Русский вестник", "№2", 474));
        books.add(new Book(author4, "Идиот", 1868, "Русский вестник", "№4", 174));


        // System.out.println(Books.filterBooksByAuthor(books, "Чехов"));
        // System.out.println(Books.filterBooksByPublisher(books, "Русская мысль"));
        //  System.out.println(Books.filterBooksByIsbn(books, "№3"));
        //  System.out.println(Books.filterBooksByYear(books, 1866));
        // System.out.println(Books.filterBooksByPublisherAndYear(books, "Русский писатель", 1897));
        //System.out.println(Books.filterBooksByAuthorAndPublisherAndYear(books, "Достоевский", "Русский вестник", 1868));


        by.booklover.Users.addUser(new by.booklover.User("+375296", 5689));
        by.booklover.Users.addUser(new by.booklover.User("+375298", 4712));
        by.booklover.Users.addUser(new User("+375295", 1236));

        //System.out.println(Users.getAllUsers());
        //System.out.println(Users.isUserInList(new User("+375296",5689)));
        // System.out.println(Users.isUserInList(new User("+375297", 5478)));

        by.booklover.Login login = new Login();
        //login.login(new User("+375299", 5689));

        by.booklover.Cart cart = new by.booklover.Cart(by.booklover.Users.getAllUsers().get(2));
        //System.out.println(cart);

        by.booklover.Cart cart1 = new Cart(Users.getAllUsers().get(1));
        cart1.addBook(books.get(0));
        cart1.addBook(books.get(1));
        cart1.addBook(books.get(2));
       // System.out.println(cart1);
       // System.out.println(cart1.getTotalSum());

        cart1.addBook(books.get(3));
       // System.out.println(cart1);

        cart1.deleteBook(books.get(3));
        //System.out.println(cart1);
    }
}
