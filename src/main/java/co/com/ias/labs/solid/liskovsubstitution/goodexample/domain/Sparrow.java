package co.com.ias.labs.solid.liskovsubstitution.goodexample.domain;

public class Sparrow extends Bird implements FlyingBird{
    @Override
    public void fly() {
        System.out.println("The sparrow is flying now");
    }

    public Sparrow(String name) {
        super(name);
    }
}
