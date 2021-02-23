package co.com.ias.solid.openclosed.goodexample.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Square implements Polygon{
    private final double side;

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}
