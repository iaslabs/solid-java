package co.com.ias.solid.openclosed.goodexample.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle implements Polygon{

    private final double radius;

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
