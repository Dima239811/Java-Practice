package Task_4;

import Task_4.enums.StatusBook;
import Task_4.model.Book;
import Task_4.model.Customer;
import Task_4.model.DataManager;
import Task_4.model.Order;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // сортировка книг
          DataManager dataManager = new DataManager();
//        List<Book> books = new ArrayList<>();
//
//        dataManager.addBookToWareHouse(new Book("1984", "George Orwell", 1949, 12.99, StatusBook.IN_STOCK, 1));
//        dataManager.addBookToWareHouse(new Book("To Kill a Mockingbird", "Harper Lee", 1960, 10.50, StatusBook.IN_STOCK, 2));
//        dataManager.addBookToWareHouse(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 9.99, StatusBook.OUT_OF_STOCK, 3));
//        dataManager.addBookToWareHouse(new Book("Pride and Prejudice", "Jane Austen", 1813, 8.25, StatusBook.IN_STOCK, 4));
//        dataManager.addBookToWareHouse(new Book("The Hobbit", "J.R.R. Tolkien", 1937, 15.75, StatusBook.IN_STOCK, 5));
//
//        System.out.println(" Все книги до сортировки:");
//        dataManager.getAllBooks().forEach(System.out::println);
//
//        System.out.println("Сортировка по алфавиту:");
//        dataManager.sortBooks("по алфавиту").forEach(System.out::println);
//
//        System.out.println("Сортировка по цене:");
//        dataManager.sortBooks("по цене").forEach(System.out::println);
//
//        System.out.println("Сортировка по году издания:");
//        dataManager.sortBooks("по году издания").forEach(System.out::println);
//
//        System.out.println("Сортировка по наличию на складе:");
//        dataManager.sortBooks("по наличию на складе").forEach(System.out::println);


        // сортировка заказа
        Book book = new Book("Война и мир", "Лев Толстой", 1949, 8500, StatusBook.IN_STOCK, 1);
        Book book1 = new Book("Война и мир", "Лев Толстой", 1949, 3000, StatusBook.OUT_OF_STOCK, 1);
        Book book2 = new Book("Война и мир", "Лев Толстой", 1949, 4500, StatusBook.IN_STOCK, 1);

        Customer customer = new Customer("dima", 19, "+7555555", "john@example.com", "adress");

        dataManager.createOrder(book, customer, new Date(2012, 10, 3));
        dataManager.createOrder(book1, customer, new Date(2025, 6, 7));
        dataManager.createOrder(book2, customer, new Date(2022, 3, 4));

        System.out.println(" Все заказы до сортировки:");
        dataManager.getAllBooks().forEach(System.out::println);

        System.out.println("Сортировка по дате:");
        dataManager.sortOrders("по дате").forEach(System.out::println);

        System.out.println("Сортировка по цене:");
        dataManager.sortOrders("по цене").forEach(System.out::println);

        System.out.println("Сортировка по статусу:");
        dataManager.sortOrders("по статусу").forEach(System.out::println);

    }
}
