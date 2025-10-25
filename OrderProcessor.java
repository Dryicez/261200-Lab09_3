package oop.dip;

public class OrderProcessor {

    private NotificationService notificationService;

    public OrderProcessor(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void processOrder(String orderId) {
        String status = "Order " + orderId + " processed successfully.";
        notificationService.notify(status);
    }
}
