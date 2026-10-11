package PaymentLLD;

public class CreditCardPaymentProcesssor implements Payment {
    protected long creditCardNumber;
    @Override
    public void pay(double amount) {
        System.out.println("Payment using Credit Card");
    }
}
