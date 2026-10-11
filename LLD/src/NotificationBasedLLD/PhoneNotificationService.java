package NotificationBasedLLD;

public class PhoneNotificationService implements Notification {
    double phoneNumber;

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void triggerNotification() {
        System.out.println("Sending SMS to:" + phoneNumber);
    }
}
