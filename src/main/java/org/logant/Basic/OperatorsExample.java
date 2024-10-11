package org.logant.Basic;

public class OperatorsExample {
    public static void mainTest() {
        // 1. Arithmetic Operators
        int a = 10;
        int b = 20;

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("b / a = " + (b / a)); // Division // စားလဒ်
        System.out.println("b % a = " + (b % a)); // Modulus //အကြွင်း

        // 2. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // 3. Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x));          // Logical NOT

        // 4. Bitwise Operators
        int m = 5;  // 0101 in binary
        int n = 3;  // 0011 in binary

        System.out.println("\nBitwise Operators:");
        System.out.println("m & n: " + (m & n)); // Bitwise AND
        System.out.println("m | n: " + (m | n)); // Bitwise OR
        System.out.println("m ^ n: " + (m ^ n)); // Bitwise XOR
        System.out.println("~m: " + (~m));       // Bitwise NOT
        System.out.println("m << 1: " + (m << 1)); // Left shift
        System.out.println("m >> 1: " + (m >> 1)); // Right shift

        // 5. Assignment Operators
        int p = 10;
        System.out.println("\nAssignment Operators:");
        p += 5;  // Equivalent to p = p + 5
        System.out.println("p += 5: " + p);
        p -= 2;  // Equivalent to p = p - 2
        System.out.println("p -= 2: " + p);
        p *= 2;  // Equivalent to p = p * 2
        System.out.println("p *= 2: " + p);
        p /= 3;  // Equivalent to p = p / 3
        System.out.println("p /= 3: " + p);
        p %= 2;  // Equivalent to p = p % 2
        System.out.println("p %= 2: " + p);

        // 6. Unary Operators
        System.out.println("\nUnary Operators:");
        int q = 5;
        System.out.println("++q: " + (++q)); // Pre-increment
        System.out.println("q++: " + (q++)); // Post-increment
        System.out.println("--q: " + (--q)); // Pre-decrement
        System.out.println("q--: " + (q--)); // Post-decrement

        // 7. Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b; // Ternary operation
        System.out.println("Maximum of a and b is: " + max);
    }
}
