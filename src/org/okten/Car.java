package org.okten;

import lombok.Data;

@Data
public class Car {

    public static int CREATED_CAR_COUNT = 0;

    static {
        System.out.println("Car class");
    }

    private final String make;

    private Engine engine;

    private Driver driver;

    private CarType carType;

    public Car(String make, String engineModel, Driver driver) {
        this.make = make;
        this.engine = new Engine(engineModel);
        this.driver = driver;
        CREATED_CAR_COUNT++;
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
