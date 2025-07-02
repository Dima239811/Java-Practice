import java.time.LocalDateTime;
import java.util.Date;

public class CashPayment extends Payment{
    private String requisites;
    private String receipt;

    public CashPayment(double totalPrice, Date paymentDate, String requisites, String receipt) {
        super(totalPrice, paymentDate);
        this.requisites = requisites;
        this.receipt = receipt;
    }

    @Override
    public boolean pay() {
        System.out.println("какая-то логика оплатой наличными");
        return false;
    }
}
