package org.logant.Basic;


public class AutoboxingUnboxingDemo {
    // Method to demonstrate autoboxing
    public void demonstrateAutoboxing() {
        int primitiveInt = 42; // Primitive int
        Integer wrappedInt = primitiveInt; // Autoboxing (int to Integer)

        System.out.println("Autoboxing:");
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapped Integer: " + wrappedInt);
    }

    // Method to demonstrate unboxing
    public void demonstrateUnboxing() {
        Integer wrappedInt = 100; // Autoboxing (Integer literal)
        int primitiveInt = wrappedInt; // Unboxing (Integer to int)

        System.out.println("\nUnboxing:");
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Primitive int: " + primitiveInt);
    }

    // Method to demonstrate null handling in unboxing
    public void demonstrateNullHandling() {
        Integer nullableInt = null;

        try {
            int unboxedInt = nullableInt; // This will throw NullPointerException
            System.out.println("Unboxed int: " + unboxedInt);
        } catch (NullPointerException e) {
            System.out.println("\nUnboxing null Integer:");
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    // public static void main(String[] args) {
    //     AutoboxingUnboxingDemo demo = new AutoboxingUnboxingDemo();
    //     demo.demonstrateAutoboxing();
    //     demo.demonstrateUnboxing();
    //     demo.demonstrateNullHandling();
    // }
}
