package co.com.ias.solid.interfacesegregation.goodexample.domain;

import co.com.ias.solid.interfacesegregation.goodexample.domain.operations.PublicOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class AnonymousUser implements PublicOperations {

    @Override
    public ArrayList<String> getPublicResources() {
        return new ArrayList<>(Arrays.asList("Frontend", "UI"));
    }
}
