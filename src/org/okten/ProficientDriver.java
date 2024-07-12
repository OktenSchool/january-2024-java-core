package org.okten;

import lombok.ToString;

import java.math.BigDecimal;

@ToString(callSuper = true)
public class ProficientDriver extends Driver {

    private BigDecimal price;

    public ProficientDriver(String name, String licenseNumber, BigDecimal price) {
        super(name, licenseNumber);
        this.price = price;
    }

    @Override
    public void printWelcomeMessage() {
        System.out.println("Hello. I am " + name + " with license number " + licenseNumber + " and I can drive your car for " + price + " dollars");
    }

    // forbidden, as overridden method is final
//    @Override
//    public void printLicenseNumber() {
//        System.out.println(name + "'s license number is " + licenseNumber);
//    }
}
