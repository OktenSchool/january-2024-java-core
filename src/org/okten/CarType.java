package org.okten;

import lombok.Getter;

@Getter
public enum CarType {

    SUV("Кросовер"),
    SEDAN("Седан"),
    COUPE("Купе"),
    HATCHBACK("Хечбек");

    private String title;

    CarType(String title) {
        this.title = title;
    }

    public void printInfo() {
        System.out.println("Car type: " + name() + ", index: " + ordinal());
    }
}
