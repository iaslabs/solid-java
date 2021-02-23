package co.com.ias.solid.singleresponsability.goodexample.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String name;
    private String phoneNumber;
    private String email;
}
