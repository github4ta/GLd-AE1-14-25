package by.it_academy.vovk.booklover;

import by.it_academy.vovk.booklover.author.Author;
import by.it_academy.vovk.booklover.book.Book;
import by.it_academy.vovk.booklover.book.Books;
import by.it_academy.vovk.booklover.cart.Cart;
import by.it_academy.vovk.booklover.login.Login;
import by.it_academy.vovk.booklover.user.User;

import java.util.ArrayList;
import java.util.List;

public class DemoShop {
   public static void main(String[] args) {
        Author author1 = new Author("Joan","Rouling");
        Author author2 = new Author("Ivan","Turgenev");
        Author author3 = new Author("Alexander","Duma");

        Book book1 = new Book("Harry Potter and sorcerer's stone",author1,"Bloomberg","111-AAA",2001,1253);
        Book book2 = new Book("Fathers and sons",author2,"Eksmo","123-BAA",2021,1869);
        Book book3 = new Book("Twenty years after",author3,"Eksmo","321-IAA",2025,2005);
        Book book4 = new Book("The Queen's Necklace",author3,"Eksmo","525-IBA",2024,2535);

        List<Book> allBooks = new ArrayList<>();
        allBooks.add(book1);
        allBooks.add(book2);
        allBooks.add(book3);
        allBooks.add(book4);

        System.out.println("All books by A.Duma:");
        List<Book> dumaBooks = Books.filterBooksByAuthor(allBooks,"Duma");
        System.out.println(dumaBooks);

        System.out.println("All books by publisher:");
        List<Book> publisherBooks = Books.filterBooksByPublisher(allBooks,"Eksmo");
        System.out.println(publisherBooks);

        System.out.println("All books by year:");
        List<Book> booksByYear = Books.filterBooksByYear(allBooks,2021);
        System.out.println(booksByYear);

        User user1 = new User("pass12345","+375291234567");
        User user2 =new User("12345pass","+375449876543");

        System.out.println("Registration");
        Login.register(user1);
        Login.register(user2);

        Login.Login(user1);
        Login.Login(new User("qwer1234","+375333698521"));
        System.out.println();

        System.out.println("Cart demonstration");
        Cart cart1 = new Cart(user1);
        cart1.addBook(book1);
        cart1.addBook(book4);

        System.out.println(cart1.getBooks());
        System.out.println(cart1.getTotalSum());

       cart1.deleteBook(book4);
       System.out.println(cart1.getBooks());

       Cart cart2 = new Cart(user2,book3);

       System.out.println("Second user's card:" + cart2.getBooks());



    }

}
