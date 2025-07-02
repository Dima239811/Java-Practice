import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManagerOrder {
    private List<Order> orders;
    private WareHouse wareHouse;

    public ManagerOrder(WareHouse wareHouse) {
        this.orders = new ArrayList<>();
        this.wareHouse = wareHouse;
    }


    public boolean createOrder(Book book, Customer customer, Date orderDate, double finalPrice, Date deliveryDate, Payment payment, int id) {
        // если книга есть и свободна
        if (wareHouse.hasAvailableBook(book)) {

            Order order = new Order(book, customer, orderDate, finalPrice, deliveryDate, payment, id);
            orders.add(order);

            wareHouse.writeOffBookFromWareHouse(book);

            System.out.println("Заказ создан успешно!");
            return true;
        } else {
            System.out.println("Книга недоступна для заказа!");
            return false;
        }
    }

    public Order findOrderById(long id) {
        for (Order order : orders) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    public boolean cancelOrder(long orderId) {
        Order order = findOrderById(orderId);
        if (order != null && !"отменен".equals(order.getStatus())) {
            order.setStatus("отменен");
            System.out.println("Заказ с id " + orderId + " отменен.");
            return true;
        } else {
            System.out.println("Заказ не найден или уже отменен.");
            return false;
        }
    }

    public boolean changeOrderStatus(int orderId, String newStatus) {
        Order order = findOrderById(orderId);
        if (order != null) {
            order.setStatus(newStatus);
            System.out.println("Статус заказа с id " + orderId + " изменен на " + newStatus);
            return true;
        }
        System.out.println("Заказ не найден.");
        return false;
    }


}
