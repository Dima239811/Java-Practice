import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderCol {
    private List<Order> orderList;

    public OrderCol() {
        this.orderList = new ArrayList<>();
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void addOrder(Book book, Customer customer, Date orderDate) {
        Order order = new Order(book, customer, orderDate, book.getPrice());
        orderList.add(order);
        System.out.println("заказ создан");
    }

    public void changeStatus(int orderId, OrderStatus status) {
        for (Order ord: orderList) {
            if (ord.getOrderId() == orderId) {
                ord.setStatus(status);
                System.out.println("указанный вами статус " + status + " установлен");
                return;
            }
        }
    }
}
