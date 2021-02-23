package co.com.ias.solid.singleresponsability.badexample.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.logging.Logger;

@Data
@AllArgsConstructor
public class User {

    private String name;
    private String phoneNumber;
    private String email;

    private static final Logger logger = Logger.getLogger(User.class.getName());

    public void sendEmailNotification(String message, User user){
        // logic to send a message to an user
        logger.info(String.format("Message: %s\nSent to: %s",
                message,
                user.getEmail()));
    }

}
