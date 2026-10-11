package NotificationBasedLLD;

class Request {
    EmailNotificationService emailNotificationService;
    PhoneNotificationService phoneNotificationService;


    public Request(String emailId){
        emailNotificationService.triggerNotification();
        emailNotificationService.setEmailId(emailId);
    }

    public Request(double phoneNumber){
        phoneNotificationService.triggerNotification();
        phoneNotificationService.setPhoneNumber(phoneNumber);
    }

    public Request(){
        Notification notification = () ->{
            System.out.println("Sending Notification");
        };
    }
}
