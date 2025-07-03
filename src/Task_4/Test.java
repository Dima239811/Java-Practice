import enums.OrderStatus;
import enums.StatusBook;
import model.Book;
import model.Customer;
import model.DataManager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // сортировка книг
        DataManager dataManager = new DataManager();
        List<Book> books = new ArrayList<>();

        dataManager.addBookToWareqHouse(new Book("1984", "George Orwell", 1949, 12.99, StatusBook.IN_STOCK, 1));
        dataManager.addBookToWareqHouse(new Book("To Kill a Mockingbird", "Harper Lee", 1960, 10.50, StatusBook.IN_STOCK, 2));
        dataManager.addBookToWareqHouse(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 9.99, StatusBook.OUT_OF_STOCK, 3));
        dataManager.addBookToWareqHouse(new Book("Pride and Prejudice", "Jane Austen", 1813, 8.25, StatusBook.IN_STOCK, 4));
        dataManager.addBookToWareqHouse(new Book("The Hobbit", "J.R.R. Tolkien", 1937, 15.75, StatusBook.IN_STOCK, 5));

        System.out.println(dataManager.getAllBooks());
        System.out.println(dataManager.sorBookInWareHouse("по алфавиту"));

    }
}
