package co.com.ias.solid.openclosed.goodexample.service;

import co.com.ias.solid.openclosed.goodexample.domain.Polygon;

import java.util.List;

public class CalculationService {

    public double calculateSumArea(Polygon polygon1, Polygon polygon2) {
        return polygon1.getArea() + polygon2.getArea();
    }

    public double calculateSubtractionAreas(Polygon polygon1, Polygon polygon2) {
        return polygon1.getArea() - polygon2.getArea();
    }

    public double calculateAccumulatedAreas(List<Polygon> polygons) {
        return polygons.stream().mapToDouble(Polygon::getArea).sum();
    }

}
