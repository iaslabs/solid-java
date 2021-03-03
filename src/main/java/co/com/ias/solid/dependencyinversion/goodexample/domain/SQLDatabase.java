package co.com.ias.solid.dependencyinversion.goodexample.domain;

public class SQLDatabase implements Database{

    @Override
    public boolean save(String log) {
        System.out.println("Saving log: " + log + " in a relational database");
        return false;
    }
}
