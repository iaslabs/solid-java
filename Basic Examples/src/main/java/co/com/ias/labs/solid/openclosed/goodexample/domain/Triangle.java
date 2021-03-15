package co.com.ias.labs.solid.openclosed.goodexample.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Triangle implements Polygon{
    private final double width;
    private final double height;

    @Override
    public double getArea() {
        return (width*height)/2;
    }
}
