import java.util.ArrayList;
import java.util.List;

public class BookRequestManager {
    private List<RequestBook> requests = new ArrayList<>();

    public void addRequest(Customer customer, Book book) {
        requests.add(new RequestBook(customer,book));
        System.out.println("Запрос на книгу оставлен.");
    }
}
