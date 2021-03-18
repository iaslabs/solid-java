package co.com.ias.labs.solid.dependencyinversion.badexample.domain;

public class SQLDatabase {

    public boolean save(String log){
        // Logic to save a log
        System.out.println("Saving a log: " + log);
        return true;
    }

}
