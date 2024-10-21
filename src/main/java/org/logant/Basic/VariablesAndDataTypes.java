package org.logant.Basic;

// #### Java Variable Types:
// Local Variables:-- within a method or block and are only accessible within it.
// Instance Variables:
// Static Variables: 
//========================================
// ### Java Data Types:
//-------------------
/*  1)Primitive Data Types:
 byte, short, int,   long,  float, double,  char, and boolean
 8bit, 16bit, 32bit, 64bit, 32bit, 64bit,   16bit,      1bit
*/
//--------------------------------------------
// 2)Non-Primitive (Reference) Data Types:
// Strings, arrays, classes, and interfaces.
//--------------------------------------------
public class VariablesAndDataTypes {

    // Instance Variable: belongs to an object
    String instanceVariable = "I am an instance variable.";
//--------------------------------------------------
    // Static Variable: belongs to the class
    static String staticVariable = "I am a static variable.";
//--------------------------------------------------
    public static void mainTest() {
        //----------------------------------
        // 1. Local Variable: declared and initialized inside a method
        int localVariable = 10; // This variable only exists in this main method
        System.out.println("Local Variable: " + localVariable);
        //----------------------------------
        // 2. Primitive Data Types -------- 8 -------------
        byte byteVar = 127;          // 8-bit signed integer
        short shortVar = 9000;      // 16-bit signed integer
        int intVar = 1000000000;         // 32-bit signed integer
        long longVar = 1000000000000000000L; // 64-bit signed integer, 'L' suffix
        float floatVar = 3.14F;      // 32-bit floating point, 'F' suffix
        double doubleVar = 3.141592; // 64-bit floating point
        char charVar = 'A';          // 16-bit Unicode character
        boolean boolVar = true;      // Boolean value (true/false)

        System.out.println("\nPrimitive Data Types:");
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);
        //----------------------------------
        // 3. Non-Primitive Data Type: String
        String greeting = "Hello, Java!";
        System.out.println("\nString Data Type:");
        System.out.println("String: " + greeting);
        //----------------------------------
        // 4. Creating an object to access instance variables
        VariablesAndDataTypes demo = new VariablesAndDataTypes();
        System.out.println("\nInstance Variable: " + demo.instanceVariable);
        
        // Accessing static variable using class name (recommended way)
        System.out.println("Static Variable: " + VariablesAndDataTypes.staticVariable);
        //----------------------------------
        // 5. Array: Another example of a non-primitive data type
        int[] numbers = {1, 2, 3, 4, 5}; // Array of integers
        System.out.println("\nArray Elements:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

//-------------Java Wrapper Classes--------------------------
// allows primitive types to be treated as objects when needed 
//eg. for use in collections like ArrayList, 

// Primitive Type  <->	Wrapper Class
// byte	                Byte
// short	            Short
// int	                Integer
// long	                Long
// float	            Float
// double	            Double
// char	                Character
// boolean	            Boolean