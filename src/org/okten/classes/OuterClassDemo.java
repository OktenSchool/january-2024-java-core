package org.okten.classes;

import org.okten.Driver;

import java.math.BigDecimal;

public class OuterClassDemo {

    public static void main(String[] args) {
        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();

        OuterClass.printStaticVariable();
        OuterClass.StaticNestedClass.printNestedStaticVariable();
        staticNestedClass.printNestedNonStaticVariable();

        OuterClass.NestedClass nestedClass = new OuterClass().new NestedClass();

        nestedClass.printNestedNonStaticVariable();
        nestedClass.printCounter();

        OuterClass.NestedClass.printNestedStaticVariable();

        class LocalInnerClass {

            public static void printStatic() {
                System.out.println("I am static method in local inner class");
            }

            public void print() {
                System.out.println("I am non-static method in local inner class");
            }
        }

        LocalInnerClass.printStatic();
        new LocalInnerClass().print();

        Driver driver = new Driver("John", "123") {
            @Override
            public void printWelcomeMessage() {
                System.out.println("Hello. I am inner driver");
            }
        };

        driver.printWelcomeMessage();
    }
}
