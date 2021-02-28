package co.com.ias.solid.liskovsubstitution.badexample.application;

import co.com.ias.solid.liskovsubstitution.badexample.domain.Dodo;
import co.com.ias.solid.liskovsubstitution.badexample.domain.Duck;

public class BadLiskovMain {

    public static void main(String[] args) throws Exception {
        Duck duck = new Duck("Donald");
        duck.fly();

        Dodo dodo = new Dodo("Dodo");
        dodo.fly();
    }
}
