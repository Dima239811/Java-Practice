import java.util.Date;

public class DataManager {
    private WareHouse wareHouse;
    private OrderCol orderCol;
    private CustomerCol customerCol;
    private RequestBookCol requestBookCol;

    public  DataManager() {
        wareHouse = new WareHouse();
        orderCol = new OrderCol();
        customerCol = new CustomerCol();
        requestBookCol = new RequestBookCol();
    }

    public void writeOffBook(int bookId) {
        wareHouse.writeOffBookFromWareHouse(bookId);
    }

    public void createOrder(Book book, Customer customer, Date orderDate) {
        orderCol.addOrder(book, customer, orderDate);
    }

    // отмена заказа
    public void cancelOrder(int orderId) {
        orderCol.changeStatus(orderId, OrderStatus.CANCELLED);
    }

    // изменение статуса заказа
    public void changeStatusOrder(int orderId, OrderStatus status) {
        orderCol.changeStatus(orderId, status);
    }

    public void addBookToWareqHouse(Book book) {
        // если книга успешно добавлена, закрываем запросы на нее
        if (wareHouse.addBook(book)) {
            requestBookCol.closeRequest(book);
        }
    }

    public void addRequest(Book book, Customer customer) {
        requestBookCol.addRequest(customer, book);
    }


}

