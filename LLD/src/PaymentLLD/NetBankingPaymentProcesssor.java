package PaymentLLD;

public class NetBankingPaymentProcesssor implements Payment {
    String bankName;
    String ifscCode;

    @Override
    public void pay(double amount) {
        System.out.println("Paying amount using netbanking using bank: " + bankName);
    }
}
