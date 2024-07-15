package org.okten.interfaces;

import lombok.Data;

@Data
public class Rectangle implements Shape, Colorable {

    private final double a;

    private final double b;

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public String getColor() {
        return "green";
    }
}
