package NotificationBasedLLD;

public class EmailNotificationService implements Notification {
    String emailId;

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void triggerNotification() {
        System.out.println("Sending email to: " + emailId);
    }
}
