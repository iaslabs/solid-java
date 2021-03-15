package co.com.ias.labs.solid.dependencyinversion.goodexample.domain;

public class NoSQLDatabase implements Database{

    @Override
    public boolean save(String log) {
        System.out.println("Saving log: " + log + " in a NoSQL database" );
        return false;
    }
}
