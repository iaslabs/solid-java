package co.com.ias.solid.liskovsubstitution.badexample.domain;


public class Duck extends Bird{

    public String eats(){
        return "Fish";
    }

    public void tweet(){
        System.out.println("Quack");
    }

    public void fly(){
        System.out.println("Duck is flying");
    }

    public Duck(String name) {
        super(name);
    }
}
