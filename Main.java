package oop.dip;

public class Main {
    public static void main(String[] args) {

        NotificationService email = new EmailNotifier("noreply@shop.com");
        NotificationService sms   = new SMSNotifier("SMS ....");
        NotificationService app   = new AppNotifier("OrderChannel....");

        OrderProcessor processor = new OrderProcessor(email);
        processor.processOrder("A5031"); // แจ้งทาง email

        processor.setNotificationService(sms);
        processor.processOrder("A5032"); // แจ้งทาง SMS

        processor.setNotificationService(app);
        processor.processOrder("A5033"); // แจ้งทาง App

        OrderProcessor processor2 = new OrderProcessor(sms);
        processor2.processOrder("B5034");
    }
}
