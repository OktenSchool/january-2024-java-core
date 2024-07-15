package org.okten.classes;

public class OuterClass {

    private static String staticVariable = "static variable";

    private String nonStaticVariable = "non static variable";

    private Integer counter = 10;

    public static void printStaticVariable() {
        System.out.println(staticVariable);
    }

    public void printNonStaticVariable() {
        System.out.println(nonStaticVariable);
    }

    public class NestedClass {

        private static String nestedStaticVariable = "nested static variable";

        private String nestedNonStaticVariable = "nested non static variable";

        private Integer counter = 15;

        public static void printNestedStaticVariable() {
            System.out.println(nestedStaticVariable);
            System.out.println("Nested class has access to the " + staticVariable);
        }

        public void printNestedNonStaticVariable() {
            System.out.println(nestedNonStaticVariable);
            System.out.println(nonStaticVariable);
        }

        public void printCounter() {
            System.out.println("Counter from nested class " + counter);
            System.out.println("Counter from outer class " + OuterClass.this.counter);
        }
    }

    public static class StaticNestedClass {

        private static String nestedStaticVariable = "nested static variable in nested static class";

        private String nestedNonStaticVariable = "nested non static variable in nested static class";
        public static void printNestedStaticVariable() {
            System.out.println(nestedStaticVariable);
            System.out.println("Nested class has access to the " + staticVariable);
        }

        public void printNestedNonStaticVariable() {
            System.out.println(nestedNonStaticVariable);
        }
    }
}