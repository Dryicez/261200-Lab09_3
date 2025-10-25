package oop.dip;

public class EmailNotifier implements NotificationService {

    private final String fromAddress;

    public EmailNotifier(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    @Override
    public void notify(String message) {
        System.out.println("EMAIL From : " + fromAddress + " Body: " + message);
    }
}
