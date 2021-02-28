package co.com.ias.solid.liskovsubstitution.badexample.domain;

public class Dodo extends Bird {

    public String eats() {
        return "Nuts";
    }

    public void tweet() {
        System.out.println("Brrrr");
    }

    public void fly() throws Exception {
        throw new Exception("Dodos can't fly");
    }

    public Dodo(String name) {
        super(name);
    }
}
