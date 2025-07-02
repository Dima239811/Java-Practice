import java.util.Date;

public class Test {
    public static void main(String[] args) {

        // изменение статуса книги
        Book book1 = new Book("Война и мир", "Лев Толстой", 1897, 2000);
        WareHouse wareHouse = new WareHouse("Новый", "ул Юности", "sklad@yandex.ru", 235);
        wareHouse.addBook(book1);
        System.out.println("статус книги до списания " + book1.getStatus());
        wareHouse.writeOffBookFromWareHouse(book1);
        System.out.println("статус книги после списания " + book1.getStatus());

        // создание заказа
        System.out.println("создание заказа");
        Book book2 = new Book("Анна Каренина", "Лев Толстой", 1897, 2000);
        Customer customer = new Customer("Дима", 18, "+7888888", "email", "ул Пролетарская");
        ManagerOrder managerOrder = new ManagerOrder(wareHouse);
        Date date = new Date();
        wareHouse.addBook(book2);
        managerOrder.createOrder(book2, customer, date, 1800, date, new NonCashPayement(1800, date, "jggjgj"), 1);


        // отмена заказа
        managerOrder.cancelOrder(1);

        // изменение статуса заказа
        managerOrder.changeOrderStatus(1, "выполнен");

    }
}
