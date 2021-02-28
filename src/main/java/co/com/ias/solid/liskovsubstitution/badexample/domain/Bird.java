package co.com.ias.solid.liskovsubstitution.badexample.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bird {
    private String name;

    public String eats(){
        return "Seeds";
    }

    public void tweet(){
        System.out.println("Tweet");
    }

    public void fly() throws Exception {
        System.out.println("The bird is flying now");
    }
}
