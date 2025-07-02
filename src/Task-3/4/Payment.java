import java.time.LocalDateTime;
import java.util.Date;

public abstract class Payment {
    protected double totalPrice;
    protected String paymentStatus;
    protected Date paymentDate; //ожидает платежа или оплачен

    public Payment(double totalPrice, Date paymentDate) {
        this.paymentDate = paymentDate;
        this.totalPrice = totalPrice;
        this.paymentStatus = "ожидает платежа";
    }

    // false если не оплачен
    public abstract boolean pay();
}
