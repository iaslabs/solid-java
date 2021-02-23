package co.com.ias.solid.singleresponsability.goodexample.service;

import lombok.NoArgsConstructor;

import java.util.logging.Logger;

@NoArgsConstructor
public class NotificationService {

    private static final Logger logger = Logger.getLogger(NotificationService.class.getName());

    public void sendEmailNotification(String message, String email){
        //logic to send an email notification
        logger.info(String.format("Message: %s\nSent to: %s",
                message,
                email));
    }

    public void sendSMSNotification(String message, String phoneNumber){
        //Logic to send a SMS notification
        logger.info(String.format("Message: %s\nSent to: %s",
                message,
                phoneNumber));
    }
}
