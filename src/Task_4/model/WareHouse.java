package model;



import comporator.book.AvailiableComporator;
import comporator.book.LetterComporator;
import comporator.book.PriceComporator;
import comporator.book.YearComporator;
import enums.StatusBook;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class WareHouse {
    private List<Book> books;
    private String NameWareHouse;
    private String address;
    private String email;
    private final int maxCapacityBook;

    public WareHouse() {
        this.maxCapacityBook = 100;
        this.email = "email";
        this.address = "address";
        NameWareHouse = "nameWareHouse";
        this.books = new ArrayList<>();
    }

    public WareHouse(String nameWareHouse, String address, String email, int maxCapacityBook) {
        this.books = new ArrayList<>();
        NameWareHouse = nameWareHouse;
        this.address = address;
        this.email = email;
        this.maxCapacityBook = maxCapacityBook;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getNameWareHouse() {
        return NameWareHouse;
    }

    public void setNameWareHouse(String nameWareHouse) {
        NameWareHouse = nameWareHouse;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMaxCapacityBook() {
        return maxCapacityBook;
    }

    // cписание книги со склада
    public void writeOffBookFromWareHouse(int bookId) {
        for (Book b: books) {
            if (b.getBookId() == bookId & b.getStatus().equals(StatusBook.IN_STOCK)) {
                b.setStatus(StatusBook.OUT_OF_STOCK);
                System.out.println("Статус книги изменен на - отсутсвует");
                return;
            }
        }
        System.out.println("Книга с id " + bookId + "  не найдена");
    }

    public boolean addBook(Book book) {
        if (this.maxCapacityBook > books.size()) {
            books.add(book);
            System.out.println("Книга успешно добавлена на склад!");
            return true;
        }
        else {
            System.out.println("Склад переполнен!");
            return false;
        }
    }


    public List<Book> sortByName() {
        LetterComporator lettersComporators = new LetterComporator();
        books.sort(lettersComporators);
        return books;
    }

    public List<Book> sortByPrice() {
        PriceComporator priceComporators = new PriceComporator();
        books.sort(priceComporators);
        return books;
    }

    public List<Book> sortByYear() {
        books.sort(new YearComporator());
        return books;
    }

    public List<Book> sortByStatus() {
        books.sort(new AvailiableComporator());
        return books;
    }

    public Date calculateSizMonthAgoDate(Date current) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(current);
        calendar.add(Calendar.MONTH, -6);
        Date sixMonthsAgo = calendar.getTime();
        return sixMonthsAgo;
    }

    public List<Book> sortByDateUnsoldBook(Date current) {
        Date sixMonthsAgo = calculateSizMonthAgoDate(current);

        return books.stream().filter(books -> books.getStatus().equals(StatusBook.IN_STOCK))
                .filter(book -> book.getEntranceDate().before(sixMonthsAgo))
                .collect(Collectors.toList());
    }


    public List<Book> sortByPriceUnsoldBook(Date current) {
        Date sixMonthsAgo = calculateSizMonthAgoDate(current);

        return books.stream().filter(books -> books.getStatus().equals(StatusBook.IN_STOCK))
                .filter(book -> book.getEntranceDate().before(sixMonthsAgo))
                .sorted(new PriceComporator())
                .collect(Collectors.toList());
    }

    public Book checkBookById(int id) {
        return books.stream().
                filter(book -> book.getBookId() == id)
                .findFirst().orElse(null);
    }



}
