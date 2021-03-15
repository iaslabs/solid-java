package co.com.ias.labs.solid.openclosed.badexample.service;

import co.com.ias.labs.solid.openclosed.badexample.domain.Circle;
import co.com.ias.labs.solid.openclosed.badexample.domain.Square;

public class CalculationService {

    public double calculateSumArea(Object polygon1, Object polygon2) {
        double polygon1Area = 0;
        double polygon2Area = 0;

        if(polygon1 instanceof Circle){
            polygon1Area = calculateAreaCircle((Circle) polygon1);
        }else if (polygon1 instanceof Square){
            polygon1Area = calculateAreaSquare((Square) polygon1);
        }

        if(polygon2 instanceof Circle){
            polygon2Area = calculateAreaCircle((Circle) polygon2);
        }else if (polygon1 instanceof Square){
            polygon2Area = calculateAreaSquare((Square) polygon2);
        }

        return polygon1Area + polygon2Area;

    }

    private double calculateAreaCircle(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    private double calculateAreaSquare(Square square) {
        return Math.pow(square.getSide(), 2);
    }

}
