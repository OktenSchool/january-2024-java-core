package org.okten.interfaces;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(5, 10));
        shapes.add(new Square(5));
        shapes.add(new Circle(100));

        for (Shape shape : shapes) {
            shape.printArea();
        }

        System.out.println(Shape.COUNTER);
    }
}
