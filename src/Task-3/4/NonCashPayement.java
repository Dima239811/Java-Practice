import java.time.LocalDateTime;
import java.util.Date;

public class NonCashPayement extends Payment{
    private String numberCard;

    public NonCashPayement(double totalPrice, Date paymentDate, String numberCard) {
        super(totalPrice, paymentDate);
        this.numberCard = numberCard;
    }

    @Override
    public boolean pay() {
        System.out.println("какая-то логика оплатой картой");
        return !super.paymentStatus.equals("ожидает платежа");
    }
}
