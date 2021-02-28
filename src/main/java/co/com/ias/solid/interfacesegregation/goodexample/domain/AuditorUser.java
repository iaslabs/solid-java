package co.com.ias.solid.interfacesegregation.goodexample.domain;

import co.com.ias.solid.interfacesegregation.goodexample.domain.operations.AuditorOperations;
import org.javamoney.moneta.Money;

import javax.money.Monetary;

public class AuditorUser implements AuditorOperations {

    @Override
    public boolean payResourceBill(String resourceName, Money money) {
        return true;
    }

    @Override
    public Money getResourceBill(String resourceName) {
        return Money.of(200, Monetary.getCurrency("USD"));
    }
}
