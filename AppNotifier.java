package oop.dip;

public class AppNotifier implements NotificationService {

    private final String appChannel;

    public AppNotifier(String appChannel) {
        this.appChannel = appChannel;
    }

    @Override
    public void notify(String message) {
        System.out.println(" APP Channel: " + appChannel + " Message: " + message);
    }
}
