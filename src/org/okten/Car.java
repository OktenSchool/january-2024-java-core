package org.okten;

import lombok.Data;
import org.okten.interfaces.Shape;

@Data
public class Car<T extends Shape> {

    public static int CREATED_CAR_COUNT = 0;

    static {
        System.out.println("Car class");
    }

    private final String make;

    private Engine engine;

    private Driver driver;

    private CarType carType;

    private T passenger;

    public Car(String make, String engineModel, Driver driver) {
        this.make = make;
        this.engine = new Engine(engineModel);
        this.driver = driver;
        CREATED_CAR_COUNT++;

        passenger.printArea();
    }

    public static void printInfo() {
        System.out.println(CREATED_CAR_COUNT);

        // unreal
//        System.out.println(make);
    }

    public void printCarInfo() {
        System.out.println(CREATED_CAR_COUNT);
        System.out.println(make);
    }
}
