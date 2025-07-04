
import enums.OrderStatus;
import enums.StatusBook;
import model.Book;
import model.Customer;
import model.DataManager;
import model.Order;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // сортировка книг
          DataManager dataManager = new DataManager();
        List<Book> books = new ArrayList<>();

        dataManager.addBookToWareHouse(new Book("1984", "George Orwell", 1949, 12.99, StatusBook.IN_STOCK,
                new Date(),1));
        dataManager.addBookToWareHouse(new Book("To Kill a Mockingbird", "Harper Lee", 1960, 10.50,
                StatusBook.IN_STOCK, new Date(),2));
        dataManager.addBookToWareHouse(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 9.99,
                StatusBook.OUT_OF_STOCK,new Date(), 3));
        dataManager.addBookToWareHouse(new Book("Pride and Prejudice", "Jane Austen", 1813, 8.25,
                StatusBook.IN_STOCK, new Date(),4));
        dataManager.addBookToWareHouse(new Book("The Hobbit", "J.R.R. Tolkien", 1937, 15.75,
                StatusBook.IN_STOCK, new Date(),5));

        System.out.println(" Все книги до сортировки:");
        dataManager.getAllBooks().forEach(System.out::println);

        System.out.println("Сортировка по алфавиту:");
        dataManager.sortBooks("по алфавиту").forEach(System.out::println);

        System.out.println("Сортировка по цене:");
        dataManager.sortBooks("по цене").forEach(System.out::println);

        System.out.println("Сортировка по году издания:");
        dataManager.sortBooks("по году издания").forEach(System.out::println);

        System.out.println("Сортировка по наличию на складе:");
        dataManager.sortBooks("по наличию на складе").forEach(System.out::println);


        // сортировка заказа
        Book book = new Book("Война и мир", "Лев Толстой", 1949, 8500,
                StatusBook.IN_STOCK, new Date(2022, 4, 5), 1);
        Book book1 = new Book("Анна Каренина", "Лев Толстой", 1949, 3000,
                StatusBook.OUT_OF_STOCK, new Date(2022, 4, 1),2);
        Book book2 = new Book("Брест", "Лев Толстой", 1949, 4500,
                StatusBook.IN_STOCK, new Date(2020, 3, 5),3);
        Customer customer = new Customer("dima", 19, "+7555555", "john@example.com", "adress");

        dataManager.createOrder(book, customer, new Date(2022, 3, 3));
        dataManager.createOrder(book1, customer, new Date(2025, 6, 7));
        dataManager.createOrder(book2, customer, new Date(2022, 3, 4));
        dataManager.createOrder(book2, customer, new Date(2022, 3, 8));

        dataManager.changeStatusOrder(3, OrderStatus.COMPLETED);
        dataManager.changeStatusOrder(0, OrderStatus.COMPLETED);


        System.out.println(" Все заказы до сортировки:");
        dataManager.getAllOrder().forEach(System.out::println);

        System.out.println("Сортировка по дате:");
        dataManager.sortOrders("по дате").forEach(System.out::println);

        System.out.println("Сортировка по цене:");
        dataManager.sortOrders("по цене").forEach(System.out::println);

        System.out.println("Сортировка по статусу:");
        dataManager.sortOrders("по статусу").forEach(System.out::println);


        //  сортировка запросов
        dataManager.addRequest(book, customer);
        dataManager.addRequest(book1, customer);
        dataManager.addRequest(book2, customer);
        dataManager.addRequest(book, customer);

        System.out.println("до сортировки");
        System.out.println(dataManager.getAllRequestBook());

        System.out.println("сортировка по алфавиту");
        dataManager.sortRequest("по алфавиту").forEach(System.out::println);

        System.out.println("сортировка по количеству запросов");
        dataManager.sortRequest("по количеству запросов").forEach(System.out::println);

        // сортировка выполненных заказов
        System.out.println("после сортировки");
        dataManager.sortPerformOrdersForPeriod("по цене", new Date(2022, 3, 2),
        new Date(2022, 3, 8)).forEach(System.out::println);


        // сумма заработанных средств за период времени
        dataManager.sortPerformOrdersForPeriod("по цене", new Date(2022, 3, 2),
                new Date(2022, 3, 8)).forEach(System.out::println);
        System.out.println(dataManager.calculateIncomeForPeriod(new Date(2022, 3, 2),
                new Date(2022, 3, 8)));


        // подсчет кол-ва заказов в период времени
        System.out.println("\n кол-во заказов за период");
        System.out.println(dataManager.countingOrderForPeriod(new Date(2022, 3, 2),
                new Date(2022, 3, 8)));

        // сортировка непроданных книг
        Book book4 = new Book("Война и мир", "Лев Толстой", 1949, 8500,
                StatusBook.IN_STOCK, new Date(2022, 4, 5), 4);
        Book book5 = new Book("Анна Каренина", "Лев Толстой", 1949, 30000,
                StatusBook.IN_STOCK, new Date(2021, 7, 1),5);
        Book book6 = new Book("Брест", "Лев Толстой", 1949, 4500,
                StatusBook.IN_STOCK, new Date(2020, 3, 5),6);

        dataManager.addBookToWareHouse(book4);
        dataManager.addBookToWareHouse(book5);
        dataManager.addBookToWareHouse(book6);

        System.out.println("по дате");
        System.out.println(dataManager.sortUnsoldBooks(new Date(2022, 4, 1), "по дате поступления"));

        System.out.println("по цене");
        System.out.println(dataManager.sortUnsoldBooks(new Date(2022, 4, 1), "по цене"));


        // просмотр деталей заказа
        System.out.println("детали заказа");
        System.out.println(dataManager.checkOrderDetails(4));

        // просмтор автора книги
        Book book7 = new Book("Война и мир", "Лев Толстой", 1949, 8500,
                StatusBook.IN_STOCK, new Date(2022, 4, 5), 1);
        Book book8 = new Book("Анна Каренина", "Лев Толстой", 1949, 3000,
                StatusBook.OUT_OF_STOCK, new Date(2022, 4, 1),2);
        Book book9 = new Book("Брест", "Лев Толстой", 1949, 4500,
                StatusBook.IN_STOCK, new Date(2020, 3, 5),3);

        dataManager.addBookToWareHouse(book7);
        dataManager.addBookToWareHouse(book8);
        dataManager.addBookToWareHouse(book9);
        System.out.println(dataManager.checkAuthorBook(3));
    }
}
