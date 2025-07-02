import java.util.Date;

public class Order {
    private int id;
    private Book book;
    private Customer customer;
    private Date orderDate;
    private double finalPrice;
    private Date delieveryDate;
    private String status;  // создан/ выполнен/ отменен
    private Payment payment;


    public Order(Book book, Customer customer, Date orderDate, double finalPrice, Date delieveryDate, Payment payment, int id) {
        this.book = book;
        this.customer = customer;
        this.orderDate = orderDate;
        this.finalPrice = finalPrice;
        this.delieveryDate = delieveryDate;
        this.status = "создан";
        this.payment = payment;
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public Date getDelieveryDate() {
        return delieveryDate;
    }

    public void setDelieveryDate(Date delieveryDate) {
        this.delieveryDate = delieveryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
