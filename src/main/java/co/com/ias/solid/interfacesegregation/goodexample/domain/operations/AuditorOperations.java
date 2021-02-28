package co.com.ias.solid.interfacesegregation.goodexample.domain.operations;

import org.javamoney.moneta.Money;

public interface AuditorOperations {

    public Money getResourceBill(String resourceName);

    public boolean payResourceBill(String resourceName, Money money);

}
