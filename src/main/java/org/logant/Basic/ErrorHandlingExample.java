package org.logant.Basic;

//====================checked exceptions============================================
//The compiler checks these exceptions at compile-time
//Example --> IOException | SQLException | ClassNotFoundException

//--> IOException extends Exception
//--> Exception extends Throwable
//--> Throwable implements Serializable

//=====================Unchecked Exceptions==========================================
//They are not checked by the compiler at compile-time
//Example --> NullPointerException | ArrayIndexOutOfBoundsException | 

//--> ArithmeticException extends RuntimeException
//--> RuntimeException extends Exception
//====================================================================================


// ErrorHandlingExample.java
// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ErrorHandlingExample {
    public static void mainTest() {
        System.out.println("Error Handling in Java:");
//----------------------------------------------------------------------------------
        // Example of built-in exceptions
        try {
            System.out.println("Attempting to divide by zero:");
            int result = divide(10, 0); // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
//----------------------------------------------------------------------------------
        // Example of catching multiple exceptions
        try {
            System.out.println("\nTrying to access an array out of bounds:");
            int[] numbers = {1, 2, 3};
            System.out.println("Number: " + numbers[3]); // This will cause ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e ) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
//----------------------------------------------------------------------------------
        // Using finally block
        try {
            System.out.println("\nFinally block example:");
            int result = divide(10, 2); // This will not cause an exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
//----------------------------------------------------------------------------------
        // Throwing a custom exception
        try {
            System.out.println("\nThrowing custom exception:");
            checkAge(15); // This will throw CustomException
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
//----------------------------------------------------------------------------------
    // Method to perform division
    public static int divide(int a, int b) {
        return a / b; // This can throw ArithmeticException
    }
//----------------------------------------------------------------------------------
    // Method to check age
    public static void checkAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid.");
        }
    }
//----------------------------------------------------------------------------------
}
