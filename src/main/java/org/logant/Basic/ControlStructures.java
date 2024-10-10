package org.logant.Basic;

// ControlStructuresDemo.java
// A guide to Java Control Structures

public class ControlStructures {

    public static void mainTest() {
        System.out.println("Understanding Java Control Structures!\n");

        // 1. If-Else Statement
        int number = 10;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
//---------------------------------------------------------------
        // 2. Switch Case Statement
        int day = 3;
        System.out.println("\nSwitch Case Statement Example:");
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day!");
        }
//---------------------------------------------------------------
        // 3. For Loop
        System.out.println("\nFor Loop Example:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }
//---------------------------------------------------------------
        // 4. While Loop
        System.out.println("\nWhile Loop Example:");
        int counter = 1;
        while (counter <= 3) {
            System.out.println("Counter: " + counter);
            counter++;
        }
//---------------------------------------------------------------
        // 5. Do-While Loop
        System.out.println("\nDo-While Loop Example:");
        int n = 5;
        do {
            System.out.println("n = " + n);
            n--;
        } while (n > 0);
//---------------------------------------------------------------
        // 6. For-Each Loop (Enhanced For Loop)
        System.out.println("\nFor-Each Loop Example:");
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
//---------------------------------------------------------------
        // 7. Break Statement
        System.out.println("\nBreak Statement Example:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Exit the loop when i is 3
            }
            System.out.println("i = " + i);
        }
//---------------------------------------------------------------
        // 8. Continue Statement
        System.out.println("\nContinue Statement Example:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skip the current iteration when i is 3
            }
            System.out.println("i = " + i);
        }
//---------------------------------------------------------------
    }
}
