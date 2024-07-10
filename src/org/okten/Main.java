package org.okten;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello okten");

        var variable = "test"; // after Compilation -> String variable - NOT dynamic
//        variable = "test2"; // valid
//        variable = 1; // not valid
//        variable = false; // not valid
//        variable = <ONLY STRING>; // not valid

        String text = "lorem ipsum";
        String newText = new String("lorem ipsum");
        String oldText = "lorem ipsum";

        System.out.println(text.equals(newText)); // true
        System.out.println(text == newText); // false
        System.out.println(text == oldText); // true

        boolean bool = true; // false

        byte b = 127; // -128 - 127
        short s = 32767; // 2 ^ 15 - 1
        int i = 2_000_000_000; // 2 ^ 31 - 1
        long l = 200043343434L; // 2 ^ 63 - 1

        double d = 2.32; // 2.32
        BigDecimal bd = new BigDecimal("2.32");
        BigInteger bi = new BigInteger("32");

        float f = 3.14F;

        char c = 83;

        System.out.println(c);

        Test.printHello();
//        PrivatePrint.printHello(); - private modifier
//        PackagePrivatePrint.printHello(); - no access modifier == package private

        // private - only in class
        // protected - inside class and descendants
        // <no modifier> (Test.printHello) - inside class and same package classes - package-private
        // public - everywhere

        Product laptop = new Product("Ноутбук", new BigDecimal("20000"));
        System.out.println(laptop.getName());
        System.out.println(laptop.getPrice());
        laptop.setPrice(new BigDecimal("15000"));
        System.out.println(laptop.getPrice());
        System.out.println("Quantity: " + laptop.getQuantity()); // 0
        System.out.println("Description: " + laptop.getDescription()); // null

        var pencil = new Product("Олівець", new BigDecimal("10"));
        pencil.addReview("Хороший олівець");
        pencil.addReview("Поганий олівець");
        System.out.println(pencil.getReviews());

        for (int index = 0; index < pencil.getReviews().size(); index++) {
            System.out.println(pencil.getReviews().get(index));
        }

        for (String review : pencil.getReviews()) {
            System.out.println(review);
        }

        int index = 0;
        while (index < pencil.getReviews().size()) {
            System.out.println(pencil.getReviews().get(index));
            index++; // === < index = index + 1; >
        }

        if (pencil.getReviews().size() > 0) {
            System.out.println("Олівець має відгуки");
        }
    }
}