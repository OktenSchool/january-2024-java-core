package org.okten.interfaces;

public interface Shape {

    Integer COUNTER = 5;

    double getArea();

    default void printArea() {
        System.out.println(getArea());
    }
}
