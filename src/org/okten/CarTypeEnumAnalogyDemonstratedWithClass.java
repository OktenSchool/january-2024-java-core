package org.okten;

public final class CarTypeEnumAnalogyDemonstratedWithClass {

    public static final CarTypeEnumAnalogyDemonstratedWithClass SUV = new CarTypeEnumAnalogyDemonstratedWithClass("SUV");
    public static final CarTypeEnumAnalogyDemonstratedWithClass SEDAN = new CarTypeEnumAnalogyDemonstratedWithClass("SEDAN");
    public static final CarTypeEnumAnalogyDemonstratedWithClass COUPE = new CarTypeEnumAnalogyDemonstratedWithClass("COUPE");
    //...

    private String name;

    private CarTypeEnumAnalogyDemonstratedWithClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Car type: " + name);
    }
}
