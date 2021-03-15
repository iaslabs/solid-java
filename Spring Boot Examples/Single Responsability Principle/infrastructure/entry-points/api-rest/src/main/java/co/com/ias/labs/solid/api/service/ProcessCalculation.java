package co.com.ias.labs.solid.api.service;

import org.springframework.stereotype.Service;

@Service
public class ProcessCalculation {

    public double process(Double first, Double second, String operation) {
        switch (operation) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            default:
                throw new ArithmeticException("Operacion no valida");
        }
    }

}
