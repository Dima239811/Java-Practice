import java.util.Date;

public class Test {
    public static void main(String[] args) {

         //изменение статуса книги
        Book book1 = new Book("Война и мир", "Лев Толстой", 1897, 2000);

        DataManager dataManager = new DataManager();
        dataManager.addBookToWareqHouse(book1);
        System.out.println("статус книги до списания " + book1.getStatus());
        dataManager.writeOffBook(book1.getBookId());
        System.out.println("статус книги после списания " + book1.getStatus());

//        // создание заказа
        System.out.println("создание заказа");
        Book book2 = new Book("Анна Каренина", "Лев Толстой", 1897, 2000);
        Customer customer = new Customer("Дима", 18, "+7888888", "email", "ул Пролетарская");
        dataManager.createOrder(book2, customer, new Date());


        // отмена заказа
        System.out.println("отмена заказа");
        dataManager.cancelOrder(0);

        // изменение статуса заказа
        dataManager.changeStatusOrder(0, OrderStatus.COMPLETED);

        // добавление книги на склад и изменение статуса у запросов
        dataManager.addRequest(book1, customer);
        dataManager.addBookToWareqHouse(book1);


    }
}
