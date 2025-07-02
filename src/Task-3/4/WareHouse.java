import java.util.ArrayList;
import java.util.List;

public class WareHouse {
    private List<Book> books;
    private String NameWareHouse;
    private String address;
    private String email;
    private final int maxCapacityBook;

    public WareHouse(String nameWareHouse, String address, String email, int maxCapacityBook) {
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


    // cписание книги со склада
    public void writeOffBookFromWareHouse(Book book) {
        for (Book b: books) {
            if (b.equals(book)) {
                b.setStatus("отсутствует");
                System.out.println("Статус книги изменен на - отсутсвует");
                return;
            }
        }
        System.out.println("Книга " + book + "  не найдена");
    }

    public void addBook(Book book) {
        if (this.maxCapacityBook > books.size()) {
            books.add(book);
            System.out.println("Книга успешно добавлена на склад!");
        }
        else {
            System.out.println("Склад переполнен!");
        }
    }

    // поиск книги
    public Book findAvailableBook(Book book) {
        for (Book b : books) {
            if (b.equals(book) && "в наличии".equals(b.getStatus())) {
                return b;
            }
        }
        return null;
    }

    public boolean hasAvailableBook(Book book) {
        for (Book b : books) {
            if (b.equals(book) && "в наличии".equals(b.getStatus())) {
                return true;
            }
        }
        return false;
    }


}
