package org.logant.Basic;

public class MethodExamples {

    //---------------------------------------------------
    // 1. Instance Method - belongs to an instance of the class
    public void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    //---------------------------------------------------
    // 2. Static Method - belongs to the class itself, not an instance
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    //---------------------------------------------------
    // 3. Abstract Method - requires subclass to provide an implementation
    abstract static class AbstractClass {
        public abstract void abstractMethod();
    }

    static class ConcreteClass extends AbstractClass {
        @Override
        public void abstractMethod() {
            System.out.println("Abstract method implemented in subclass.");
        }
    }

    //---------------------------------------------------
    // 4. Final Method - cannot be overridden by subclasses
    public final void finalMethod() {
        System.out.println("This is a final method.");
    }

    //---------------------------------------------------
    // 5. Synchronized Method - allows only one thread at a time
    private int counter = 0;

    public synchronized void synchronizedMethod() {
        counter++;
        System.out.println("Synchronized method, counter: " + counter);
    }

    //---------------------------------------------------
    // 6. Native Method - placeholder for native code (not implemented here)
    public native void nativeMethod();

    //---------------------------------------------------
    // 7. Constructor Method - initializes an instance of the class
    public MethodExamples() {
        System.out.println("Constructor method called.");
    }

    //---------------------------------------------------
    // 8. Accessor (Getter) and Mutator (Setter) Methods - access and modify private fields
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //---------------------------------------------------
    // 9. Lambda Expression - a concise way to implement a single-method interface
    interface Greeting {
        void sayHello();
    }

    //---------------------------------------------------
    // 10. Varargs Method - accepts a variable number of arguments
    public void printNumbers(int... numbers) {
        System.out.print("Varargs method called with numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    //---------------------------------------------------
    // Main method to demonstrate all methods
    public static void main(String[] args) {
        MethodExamples example = new MethodExamples();
        
        //---------------------------------------------------
        // 1. Instance Method
        example.instanceMethod();

        //---------------------------------------------------
        // 2. Static Method
        staticMethod();

        //---------------------------------------------------
        // 3. Abstract Method (Implemented in a subclass)
        ConcreteClass concrete = new ConcreteClass();
        concrete.abstractMethod();

        //---------------------------------------------------
        // 4. Final Method
        example.finalMethod();

        //---------------------------------------------------
        // 5. Synchronized Method
        example.synchronizedMethod();

        //---------------------------------------------------
        // 6. Native Method (Placeholder - won’t run without native code)
        // example.nativeMethod();

        //---------------------------------------------------
        // 7. Constructor Method (called on instantiation)

        //---------------------------------------------------
        // 8. Accessor and Mutator Methods
        example.setName("John Doe");
        System.out.println("Accessor method (getName): " + example.getName());

        //---------------------------------------------------
        // 9. Lambda Expression
        Greeting greeting = () -> System.out.println("Hello from a lambda expression!");
        greeting.sayHello();

        //---------------------------------------------------
        // 10. Varargs Method
        example.printNumbers(1, 2, 3, 4, 5);
    }
}
