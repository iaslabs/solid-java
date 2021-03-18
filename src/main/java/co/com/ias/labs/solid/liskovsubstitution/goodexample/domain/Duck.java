package co.com.ias.labs.solid.liskovsubstitution.goodexample.domain;

public class Duck extends Bird implements FlyingBird, SwimmingBird{

    public String eats() {
        return "Fish";
    }

    public void tweet() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("The duck is flying now");
    }

    @Override
    public void swim() {
        System.out.println("The duck is swimming now");
    }

    public Duck(String name) {
        super(name);
    }
}
