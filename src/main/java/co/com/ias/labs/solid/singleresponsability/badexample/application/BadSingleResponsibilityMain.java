package co.com.ias.labs.solid.singleresponsability.badexample.application;

import co.com.ias.labs.solid.singleresponsability.badexample.domain.User;

public class BadSingleResponsibilityMain {
    public static void main(String[] args) {
        User user = new User("David","+57314598", "david@example.com");

        user.sendEmailNotification("Mensaje de prueba", user);

    }
}
