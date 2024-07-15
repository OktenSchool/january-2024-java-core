package org.okten.interfaces;

import lombok.Data;

@Data
public class Circle implements Shape {

    private final double r;

    @Override
    public double getArea() {
        return 3.14 * r * r;
    }
}
