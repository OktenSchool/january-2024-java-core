package org.okten;

import java.math.BigDecimal;

public class MegaProficientDriver extends ProficientDriver {

    static {
        System.out.println("MegaProficientDriver class");
    }

    public MegaProficientDriver(String name, String licenseNumber, BigDecimal price) {
        super(name, licenseNumber, price);
    }
}
