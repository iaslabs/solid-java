package co.com.ias.labs.solid.liskovsubstitution.goodexample.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Bird {
    private String name;

    public String eats() {
        return "Seeds";
    }

    public void tweet() {
        System.out.println("Tweet");
    }

}
