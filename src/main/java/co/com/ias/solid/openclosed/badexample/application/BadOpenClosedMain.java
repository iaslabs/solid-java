package co.com.ias.solid.openclosed.badexample.application;

import co.com.ias.solid.openclosed.badexample.domain.Circle;
import co.com.ias.solid.openclosed.badexample.domain.Square;
import co.com.ias.solid.openclosed.badexample.service.CalculationService;

public class BadOpenClosedMain {

    private static final CalculationService calculationService = new CalculationService();

    public static void main(String[] args) {
        Circle circle = new Circle(4.3);
        Square square = new Square(10);

        System.out.println("Sum of areas: " + calculationService.calculateSumArea(circle, square));
    }
}
