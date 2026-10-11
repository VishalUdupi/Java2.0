package PaymentLLD;

public class UPIPaymentProcesssor implements Payment {
    String upiId;

    @Override
    public void pay(double amount) {
        System.out.println("Sending amount using UPI from UPI ID: " + upiId);
    }
}
