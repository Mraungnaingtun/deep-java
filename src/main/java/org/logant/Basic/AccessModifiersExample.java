package org.logant.Basic;

// This is a public class, so it can be accessed from anywhere.
public class AccessModifiersExample {

    // Public field: can be accessed from any class
    public String publicField = "Public Field";
//-----------------------------------------------------------------------

    // Private field: can only be accessed within this class
    // private String privateField = "Private Field";
//-----------------------------------------------------------------------

    // Protected field: can be accessed within the same package and subclasses
    protected String protectedField = "Protected Field";
//-----------------------------------------------------------------------

    // Default (package-private) field: can be accessed within the same package
    String defaultField = "Default Field";
//-----------------------------------------------------------------------

    // Public constructor: can be called from any class
    public AccessModifiersExample() {
        System.out.println("Public Constructor");
    }
//-----------------------------------------------------------------------

    // Private constructor: can only be called within this class
    // private AccessModifiersExample(String msg) {
    //     System.out.println("Private Constructor: " + msg);
    // }
//-----------------------------------------------------------------------

    // Public method: can be called from any class
    public void publicMethod() {
        System.out.println("Public Method: Accessible from anywhere");
        privateMethod();  // A private method can be accessed inside the same class
    }
//-----------------------------------------------------------------------

    // Private method: can only be called within this class
    private void privateMethod() {
        System.out.println("Private Method: Only accessible within this class");
    }
//-----------------------------------------------------------------------

    // Protected method: can be called within the same package and subclasses
    protected void protectedMethod() {
        System.out.println("Protected Method: Accessible within the same package or by subclasses");
    }
//-----------------------------------------------------------------------

    // Default (package-private) method: can be called within the same package
    void defaultMethod() {
        System.out.println("Default Method: Accessible within the same package");
    }
//-----------------------------------------------------------------------

    public static void mainTest() {
        // Create an instance of AccessModifiersExample
        AccessModifiersExample example = new AccessModifiersExample();

        // Accessing the public field
        System.out.println(example.publicField);

        // Accessing the private field (won't work outside this class)
        // System.out.println(example.privateField); // Uncommenting this will cause an error

        // Accessing the protected field
        System.out.println(example.protectedField);

        // Accessing the default field
        System.out.println(example.defaultField);

        // Calling public method
        example.publicMethod();

        // Calling private method (won't work outside this class)
        // example.privateMethod(); // Uncommenting this will cause an error

        // Calling protected method
        example.protectedMethod();

        // Calling default method
        example.defaultMethod();
    }
}
//-----------------------------------------------------------------------
// Class within the same package to demonstrate access of members with different access modifiers
class AnotherClassInSamePackage {

    public static void mainTest() {
        AccessModifiersExample example = new AccessModifiersExample();

        // Access public field
        System.out.println("Public Field from another class: " + example.publicField);

        // Access private field (won't work)
        // System.out.println("Private Field from another class: " + example.privateField); // Error

        // Access protected field (accessible within the same package)
        System.out.println("Protected Field from another class: " + example.protectedField);

        // Access default field (accessible within the same package)
        System.out.println("Default Field from another class: " + example.defaultField);

        // Call public method
        example.publicMethod();

        // Call protected method (accessible within the same package)
        example.protectedMethod();

        // Call default method (accessible within the same package)
        example.defaultMethod();
    }
}
//-----------------------------------------------------------------------
// Subclass to demonstrate the accessibility of protected members
class Subclass extends AccessModifiersExample {

    public static void mainTest() {
        Subclass subclass = new Subclass();

        // Access public field
        System.out.println("Public Field in subclass: " + subclass.publicField);

        // Access private field (won't work)
        // System.out.println("Private Field in subclass: " + subclass.privateField); // Error

        // Access protected field (accessible in subclasses)
        System.out.println("Protected Field in subclass: " + subclass.protectedField);

        // Access default field (won't work from a different package)
        // System.out.println("Default Field in subclass: " + subclass.defaultField); // Error

        // Call public method
        subclass.publicMethod();

        // Call protected method (accessible in subclasses)
        subclass.protectedMethod();

        // Call default method (won't work from a different package)
        // subclass.defaultMethod(); // Error
    }
}
