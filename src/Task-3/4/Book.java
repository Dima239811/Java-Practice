public class Book {
    private String name;
    private String authtor;
    private int year;
    private double price;
    private String status;

    public Book(String name, String authtor, int year, double price, String status) {
        this.name = name;
        this.authtor = authtor;
        this.year = year;
        this.price = price;
        this.status = "в налачии";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthtor() {
        return authtor;
    }

    public void setAuthtor(String authtor) {
        this.authtor = authtor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
