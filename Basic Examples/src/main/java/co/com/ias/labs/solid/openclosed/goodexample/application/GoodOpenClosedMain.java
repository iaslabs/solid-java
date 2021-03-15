package co.com.ias.labs.solid.openclosed.goodexample.application;

import co.com.ias.labs.solid.openclosed.goodexample.domain.Polygon;
import co.com.ias.labs.solid.openclosed.goodexample.domain.Square;
import co.com.ias.labs.solid.openclosed.goodexample.domain.Triangle;
import co.com.ias.labs.solid.openclosed.goodexample.service.CalculationService;
import co.com.ias.labs.solid.openclosed.goodexample.domain.Circle;

import java.util.Arrays;
import java.util.List;

public class GoodOpenClosedMain {

    private static final CalculationService calculationService = new CalculationService();

    public static void main(String[] args) {
        Circle circle = new Circle(1.4);
        Square square = new Square(4);
        Triangle triangle = new Triangle(10,2);

        System.out.println("Sum of areas: " + calculationService.calculateSumArea(circle, square));
        System.out.println("Subtraction of areas: " + calculationService.calculateSubtractionAreas(circle, square));

        List<Polygon> polygons = Arrays.asList(circle, square, triangle);
        System.out.println("Accumulated areas: " + calculationService.calculateAccumulatedAreas(polygons));
    }
}
