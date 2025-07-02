import java.util.ArrayList;
import java.util.List;

public class WareHouse {
    private List<Book> books;
    private String NameWareHouse;
    private String address;
    private String email;
    private int maxCapacityBook;

    public WareHouse(List<Book> books, String nameWareHouse, String address, String email, int maxCapacityBook) {
        this.books = new ArrayList<>();
        NameWareHouse = nameWareHouse;
        this.address = address;
        this.email = email;
        this.maxCapacityBook = maxCapacityBook;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getNameWareHouse() {
        return NameWareHouse;
    }

    public void setNameWareHouse(String nameWareHouse) {
        NameWareHouse = nameWareHouse;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMaxCapacityBook() {
        return maxCapacityBook;
    }

    public void setMaxCapacityBook(int maxCapacityBook) {
        this.maxCapacityBook = maxCapacityBook;
    }
}
