package co.com.ias.solid.interfacesegregation.badexample.application;

import co.com.ias.solid.interfacesegregation.badexample.domain.AdminUser;
import co.com.ias.solid.interfacesegregation.badexample.domain.AnonymousUser;

public class BadInterfaceMain {

    public static void main(String[] args) {
        AdminUser administrator = new AdminUser();
        AnonymousUser invited = new AnonymousUser();

        System.out.println("========== Administrator operations ==========");
        administrator.deleteResource("Table");
        System.out.println(administrator.getPrivateResources());

        System.out.println("========== Invited operations ==========");
        System.out.println(invited.getPublicResources());
        System.out.println(invited.getPrivateResources());

    }

}
