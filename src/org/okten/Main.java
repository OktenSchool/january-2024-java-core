package org.okten;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

    static {
        System.out.println("Main class");
    }

    public static final Double PI = 3.14159;

    public static void main(String[] args) {
        System.out.println("Starting application...");

        Driver john = new Driver("John", "J123");
        Driver mike = new Driver("Mike", "M123");

        System.out.println("Created cars: " + Car.CREATED_CAR_COUNT);

        Car tesla = new Car("Tesla", "EV", john);
        Car audi = new Car("Audi", "V8", mike);

        tesla.setCarType(CarType.SUV);

        System.out.println("Created cars: " + Car.CREATED_CAR_COUNT);

        Car.printInfo();

        System.out.println(tesla);
        System.out.println(audi);

        tesla.setDriver(mike);
        audi.setDriver(john);

        System.out.println(tesla);
        System.out.println(audi);

        Driver bob = new ProficientDriver("Bob", "B777", new BigDecimal("100.00"));
        audi.setDriver(bob);

        System.out.println(audi);

        john.printWelcomeMessage();
        mike.printWelcomeMessage();
        bob.printWelcomeMessage();

        john.printLicenseNumber();
        mike.printLicenseNumber();
        bob.printLicenseNumber();

        audi.setCarType(CarType.SUV);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(tesla);
        cars.add(audi);

        for (Car car : cars) {
            if (car.getCarType() == CarType.SUV) {
                System.out.println(car.getMake() + " is SUV");
            }
        }
    }

    private void print() {
        System.out.println("hello");
    }
}