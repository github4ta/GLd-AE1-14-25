package by.it_academy.govyadina.booklover;

import by.it_academy.govyadina.booklover.author.Author;
import by.it_academy.govyadina.booklover.book.Books;
import by.it_academy.govyadina.booklover.book.Book;
import by.it_academy.govyadina.booklover.cart.Cart;
import by.it_academy.govyadina.booklover.login.Login;
import by.it_academy.govyadina.booklover.user.User;
import by.it_academy.govyadina.booklover.user.Users;

import java.util.ArrayList;
import java.util.List;


public class DemoShop {
    public static void main(String[] args) {
        Author author = new Author("Гоголь", "Николай");
        Author author1 = new Author("Чехов", "Антон");
        Author author2 = new Author("Чехов", "Антон");
        Author author3 = new Author("Достоевский", "Федор");
        Author author4 = new Author("Достоевский", "федор");

        List<by.it_academy.govyadina.booklover.book.Book> books = new ArrayList<>();

        books.add(new Book(author, "Мертвые души", 1842, "Художественная литература", "№3", 125));
        books.add(new Book(author1, "Душечка", 1897, "Русский писатель", "№5", 564));
        books.add(new Book(author2, "Человек в футляре", 1897, "Русский писатель", "№1", 451));
        books.add(new Book(author3, "Преступление и наказание", 1866, "Русский вестник", "№2", 474));
        books.add(new Book(author4, "Идиот", 1868, "Русский вестник", "№4", 174));

        System.out.println(Books.filterBooksByAuthor(books, "Чехов"));
        System.out.println(Books.filterBooksByPublisher(books, "Русская мысль"));
        System.out.println(Books.filterBooksByIsbn(books, "№3"));
        System.out.println(Books.filterBooksByYear(books, 1866));
        System.out.println(Books.filterBooksByPublisherAndYear(books, "Русский писатель", 1897));
        System.out.println(Books.filterBooksByAuthorPublisherAndYear(books, "Достоевский", "Русский вестник", 1868));


        Users.addUser(new User("+375296", 5689));
        Users.addUser(new User("+375298", 4712));
        Users.addUser(new User("+375295", 1236));

        System.out.println(Users.getAllUsers());
        System.out.println(Users.isUserInList(new User("+375296", 5689)));
        System.out.println(Users.isUserInList(new User("+375297", 5478)));

        Login login = new Login();
        login.login(new User("+375299", 5689));

        Cart cart = new Cart(Users.getAllUsers().get(2));
        System.out.println(cart);

        Cart cart1 = new Cart(Users.getAllUsers().get(1));
        cart1.addBook(books.get(0));
        cart1.addBook(books.get(1));
        cart1.addBook(books.get(2));
        System.out.println(cart1);
        System.out.println(cart1.getTotalSum());

        cart1.addBook(books.get(3));
        System.out.println(cart1);

        cart1.deleteBook(books.get(3));
        System.out.println(cart1);
    }
}
