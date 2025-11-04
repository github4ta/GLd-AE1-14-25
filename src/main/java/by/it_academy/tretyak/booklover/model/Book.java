package by.it_academy.tretyak.booklover.model;

public class Book {
    private String title;
    private Author author;
    private String publisher;
    private String isbn;
    private int year;
    private int price;

    public Book(String title, Author author, String publisher, String isbn, int year, String priceStr) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.year = year;
        this.price = parsePriceToKopecks(priceStr);
    }

    private int parsePriceToKopecks(String priceStr) {
        if (priceStr == null || priceStr.trim().isEmpty()) {
            throw new IllegalArgumentException("Цена не может быть пустой");
        }

        String digitsOnly = priceStr.replaceAll("[^\\d]", "");

        if (digitsOnly.isEmpty()) {
            throw new IllegalArgumentException("Не удалось извлечь цифры из цены: " + priceStr);
        }

        try {
            return Integer.parseInt(digitsOnly);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Слишком большое число в цене: " + priceStr, e);
        }
    }

    public String getTitle() { return title; }
    public Author getAuthor() { return author; }
    public String getPublisher() { return publisher; }
    public String getIsbn() { return isbn; }
    public int getYear() { return year; }
    public int getPrice() { return price; }

    public String formatPrice() {
        int rubles = price / 100;
        int kopecks = price % 100;
        return String.format("%d руб. %02d коп.", rubles, kopecks);
    }

    @Override
    public String toString() {
        return String.format(
                "Book{title='%s', author=%s, publisher='%s', isbn='%s', year=%d, price=%s}",
                title, author, publisher, isbn, year, formatPrice()
        );
    }
}