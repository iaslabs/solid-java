package co.com.ias.labs.solid.interfacesegregation.badexample.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class AdminUser implements UserOperations {

    @Override
    public ArrayList<String> getPublicResources() {
        return new ArrayList<>(Arrays.asList("Frontend", "UI"));
    }

    @Override
    public ArrayList<String> getPrivateResources() {
        return new ArrayList<>(Arrays.asList("Server", "Database"));
    }

    @Override
    public boolean deleteResource(String resource) {
        return true;
    }
}
