package org.logant.Basic;

// FunctionsDemo.java
// A guide to Java Methods

public class MethodDemo {

    // 1. Instance Method: Requires an object of the class to be called
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
//===================================================================================
    // 2. Static Method: Can be called without creating an object
    public static int add(int a, int b) {
        return a + b;
    }
//===================================================================================
    // 3. Method Overloading: Same method name but different parameters
    public void displayInfo(String name) {
        System.out.println("Name: " + name);
    }

    public void displayInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
//===================================================================================
    // 4. Recursive Method: Calls itself until a base condition is met
    public int factorial(int n) {
        if (n <= 1) return 1; // Base case
        return n * factorial(n - 1); // Recursive call
    }
//===================================================================================
    // 5. Getter and Setter Methods: Encapsulate private fields
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
//===================================================================================

    public static void mainTest() {
        // Calling the static method
        System.out.println("Addition: " + add(10, 5));

        // Creating an instance of FunctionsDemo to call instance methods
        MethodDemo demo = new MethodDemo();

        // Calling instance methods
        demo.greet("Aung");
        
        // Using method overloading
        demo.displayInfo("Aung");
        demo.displayInfo("Aung", 27);

        // Calling the recursive method
        System.out.println("Factorial of 5: " + demo.factorial(5));

        // Using getter and setter methods
        demo.setColor("Blue");
        System.out.println("Favorite Color: " + demo.getColor());
    }
//===================================================================================
}
