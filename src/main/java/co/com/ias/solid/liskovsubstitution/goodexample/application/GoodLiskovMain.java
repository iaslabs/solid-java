package co.com.ias.solid.liskovsubstitution.goodexample.application;

import co.com.ias.solid.liskovsubstitution.goodexample.domain.Dodo;
import co.com.ias.solid.liskovsubstitution.goodexample.domain.Duck;
import co.com.ias.solid.liskovsubstitution.goodexample.domain.Sparrow;

public class GoodLiskovMain {

    public static void main(String[] args) {
        Dodo dodo = new Dodo("Dodo");
        dodo.tweet();

        Duck duck = new Duck("Donald");
        duck.swim();

        Sparrow sparrow = new Sparrow("Jack");
        sparrow.fly();
    }

}
