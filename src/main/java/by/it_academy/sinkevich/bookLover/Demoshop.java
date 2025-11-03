package by.it_academy.sinkevich.bookLover;


import java.util.ArrayList;
import java.util.List;

import by.it_academy.sinkevich.bookLover.Login;

public class Demoshop {
    public static void demoshop(){

        // USER , LOGIN , REGISTRATION
        System.out.println("USER , LOGIN , REGISTRATION");
        System.out.println("---------------------------");

        User user1 = new User("+375291112233","password");
        writeUser(user1);

        System.out.println("Login: ");
        Login login = new Login();
        login.login(user1);
        System.out.println();

        System.out.println("Register: ");
        login.register(user1);
        System.out.println();

        User user2 = new User("+375292223344","paswword1");
        writeUser(user2);

        System.out.println("Login: ");
        login.login(user2);
        System.out.println();

        User user3 = new User("1234455", "password2");
        writeUser(user3);

        System.out.println("Register: ");
        login.register(user3);

        System.out.println("Login: ");
        login.login(user3);
        System.out.println();

        User user4 = new User("+375291234455", "password2");
        writeUser(user4);

        System.out.println("Register: ");
        login.register(user4);

        System.out.println("Login: ");
        login.login(user4);
        System.out.println();

        System.out.println("User list : ");
        for (int i = 0; i < Users.getAllUsers().size(); i++) {
            writeUser(Users.getAllUsers().get(i));
        }

        // BOOK
        System.out.println();
        System.out.println("BOOK");
        System.out.println("---------------------------");

        Author author1 = new Author("author1", "name1");
        Author author2 = new Author("author2", "name2");

        Book book1 = new Book("book1",author1,2001,"publisher1",1,12);
        Book book2 = new Book("book2",author1,2002,"publisher2",2,122);
        Book book3 = new Book("book3",author2,2001,"publisher1",1,33);
        Book book4 = new Book("book4",author2,2002,"publisher1",4,33);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        System.out.println("BooksByAuthor");
        writeListBook(Books.filterBooksByAuthor(books,author2.getSurname()));
        System.out.println();

        System.out.println("BooksByPublisher");
        writeListBook(Books.filterBooksByPublisher(books,"publisher1"));
        System.out.println();

        System.out.println("BooksByIsbn");
        writeListBook(Books.filterBooksByIsbn(books,1));
        System.out.println();

        System.out.println("BooksByYear");
        writeListBook(Books.filterBooksByYear(books,2002));
        System.out.println();

        System.out.println("BooksByPublisherAndYear");
        writeListBook(Books.filterBooksByPublisherAndYear(books,"publisher1",2001));
        System.out.println();

        System.out.println("BooksByAuthorAndPublisherAndYear");
        writeListBook(Books.filterBooksByAuthorAndPublisherAndYear(books,author1.getSurname(),"publisher1",2001));
        System.out.println();



        // CART
        System.out.println();
        System.out.println("CART");
        System.out.println("---------------------------");

        //Cart(User user)
        System.out.println("create Cart(User user) : ");
        Cart cart1 = new Cart(Users.getAllUsers().get(0));
        writeCart(cart1);

        cart1.addBook(book1);
        System.out.println("add book: ");
        writeCart(cart1);

        System.out.println("delete book: ");
        cart1.deleteBook(book1);
        writeCart(cart1);

        //Cart(User user, List<Book> books)
        List<Book> listBooksUser = new ArrayList<>();
        listBooksUser.add(book1);
        listBooksUser.add(book2);
        listBooksUser.add(book3);

        System.out.println("create Cart(User user, List<Book> books) : ");
        Cart cart2 = new Cart(Users.getAllUsers().get(1));
        writeCart(cart2);

        cart2.deleteBook(book1);
        System.out.println("delete book: ");
        writeCart(cart2);

        cart2.addBook(book4);
        System.out.println("add book: ");
        writeCart(cart2);

        //Cart(User user, Book book)
        Cart cart3 = new Cart(Users.getAllUsers().get(2));
        System.out.println("create Cart(User user, Book book) : ");
        writeCart(cart3);

        cart3.deleteBook(book1);
        System.out.println("delete book: ");
        writeCart(cart3);

        cart3.addBook(book2);
        System.out.println("add book: ");
        writeCart(cart3);


    }

    public static void writeListBook (List<Book> bookList){
        List<Book> bookToEnter = new ArrayList<>();
        bookToEnter.addAll(bookList);

        if (!bookToEnter.isEmpty()) {
            for (int i = 0; i < bookToEnter.size(); i++) {
                System.out.print("->");
                System.out.print(" name : " + bookToEnter.get(i).name);
                System.out.print("; author : " + bookList.get(i).getAuthor().getSurname() + " " + bookList.get(i).getAuthor().getName());
                System.out.print("; year : " + bookToEnter.get(i).getYear());
                System.out.print("; publisher : " + bookToEnter.get(i).getPublisher());
                System.out.print("; isbn : " + bookToEnter.get(i).getIsbn());
                System.out.print("; price : " + bookToEnter.get(i).getPrice());
                System.out.println();
            }
        }
        else {
            System.out.println("-> booklist is empty");
        }
    }
    public static void writeCart (Cart cart){
        System.out.println("cart :");

        System.out.println("-> user login : " + cart.getUser().getLogin() + " ;password : " + cart.getUser().getPassword());
        writeListBook(cart.getBooks());
        System.out.println("-> total sum : " + cart.getTotalSum());
        System.out.println();
    }
    public static void writeUser(User user){
        System.out.println("User -> login : " + user.getLogin() +" password : " + user.getPassword());
    }

}