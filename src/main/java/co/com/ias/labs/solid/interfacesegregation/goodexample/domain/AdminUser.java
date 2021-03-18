package co.com.ias.labs.solid.interfacesegregation.goodexample.domain;

import co.com.ias.labs.solid.interfacesegregation.goodexample.domain.operations.AdminOperations;
import co.com.ias.labs.solid.interfacesegregation.goodexample.domain.operations.PublicOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class AdminUser implements AdminOperations, PublicOperations {

    @Override
    public ArrayList<String> getPublicResources() {
        return new ArrayList<>(Arrays.asList("Frontend", "UI"));
    }

    @Override
    public boolean createResource(String name) {
        return true;
    }

    @Override
    public boolean deleteResource(String name) {
        return true;
    }
}
