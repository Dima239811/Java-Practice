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
}
