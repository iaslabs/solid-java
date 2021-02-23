package co.com.ias.solid.singleresponsability.goodexample.application;

import co.com.ias.solid.singleresponsability.goodexample.domain.User;
import co.com.ias.solid.singleresponsability.goodexample.service.NotificationService;

public class GoodSingleResponsibilityMain {

    private static final NotificationService notificationService = new NotificationService();

    public static void main(String[] args) {
        User user = new User("David", "+57314", "david@example.com");

        notificationService.sendEmailNotification("Email message", user.getEmail());
        notificationService.sendSMSNotification("SMS message", user.getPhoneNumber());

    }
}
