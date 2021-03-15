package co.com.ias.labs.solid.liskovsubstitution.goodexample.domain;

public class Dodo extends Bird{
    public String eats() {
        return "Nuts";
    }

    public void tweet() {
        System.out.println("Brrrr");
    }

    public Dodo(String name) {
        super(name);
    }
}
