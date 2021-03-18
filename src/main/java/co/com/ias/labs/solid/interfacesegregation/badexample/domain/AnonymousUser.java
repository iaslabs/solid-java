package co.com.ias.labs.solid.interfacesegregation.badexample.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AnonymousUser implements UserOperations{

    @Override
    public ArrayList<String> getPublicResources() {
        return new ArrayList<>(Arrays.asList("Frontend","UI"));
    }

    @Override
    public ArrayList<String> getPrivateResources() {
        // throw new Exception("Does not have the privileges");
        // return new ArrayList<>();
        return new ArrayList<>(Collections.singletonList("Does not have the privileges"));
    }

    @Override
    public boolean deleteResource(String resource) throws Exception {
        // Just nothing
        throw new Exception("Does not have the privileges");
    }
}
