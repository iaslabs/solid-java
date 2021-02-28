package co.com.ias.solid.interfacesegregation.badexample.domain;

import java.util.ArrayList;

public interface UserOperations {
    public ArrayList<String> getPublicResources();

    public ArrayList<String> getPrivateResources();

    public boolean deleteResource(String resource) throws Exception;
}
