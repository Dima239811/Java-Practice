import java.util.Date;

public class RequestBook {
    private Customer customer;
    private Book book;
    private String status; // "открыт", "закрыт"

    public RequestBook(Customer customer, Book book) {
        this.customer = customer;
        this.book = book;
        this.status = "открыт";
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
