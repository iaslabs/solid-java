package co.com.ias.solid.liskovsubstitution.goodexample.domain;

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
