package oop.dip;

public class SMSNotifier implements NotificationService {

    private final String senderId;

    public SMSNotifier(String senderId) {
        this.senderId = senderId;
    }

    @Override
    public void notify(String message) {
        System.out.println("SMS SenderID: " + senderId + " Text: " + message);
    }
}
