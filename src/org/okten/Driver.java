package org.okten;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Driver {

    static {
        System.out.println("Driver class");
    }

    protected String name;

    protected String licenseNumber;

    public void printWelcomeMessage() {
        System.out.println("Hello. I am " + name + " with license number " + licenseNumber + " and I can drive your car");
    }

    public final void printLicenseNumber() {
        System.out.println(name + "'s license number is " + licenseNumber);
    }
}
