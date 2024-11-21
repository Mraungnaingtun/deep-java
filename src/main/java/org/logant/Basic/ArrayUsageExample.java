package org.logant.Basic;

import java.util.Arrays;

public class ArrayUsageExample {

    public static void mainTest() {
//---------------------------------------------------------------
        // 1. Declaring and Initializing Arrays

        int[] numbers = {1, 2, 3, 4, 5};
        String[] fruits = new String[3]; // Array with default size
        
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Cherry";
        // fruits[3] = "abcd";//java.lang.ArrayIndexOutOfBoundsException
//---------------------------------------------------------------
        // 2. Accessing Array Elements
        System.out.println("First element in numbers: " + numbers[0]);
        System.out.println("First fruit: " + fruits[0]);
//---------------------------------------------------------------
        // 3. Array Length
        System.out.println("Length of numbers array: " + numbers.length);
        System.out.println("Length of fruits array: " + fruits.length);
//---------------------------------------------------------------
        // 4. Iterating Over Arrays
        System.out.println("\nIterating using traditional for-loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "]: " + numbers[i]);
        }

        System.out.println("\nIterating using enhanced for-loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
//---------------------------------------------------------------
        // 5. Copying Arrays
        int[] copiedNumbers = Arrays.copyOf(numbers, numbers.length);
        System.out.println("\nCopied array: " + Arrays.toString(copiedNumbers));
//---------------------------------------------------------------
        // 6. Sorting Arrays
        int[] unsortedNumbers = {5, 3, 4, 1, 2};
        Arrays.sort(unsortedNumbers);
        System.out.println("\nSorted array: " + Arrays.toString(unsortedNumbers));
//---------------------------------------------------------------
        // 7. Multidimensional Arrays (2D Array)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("\n2D Array (Matrix):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
//---------------------------------------------------------------
        // 8. Array Manipulations with Arrays Utility Class
        int[] arrayToFill = new int[5];
        Arrays.fill(arrayToFill, 10);
        System.out.println("\nArray filled with 10: " + Arrays.toString(arrayToFill));

        int index = Arrays.binarySearch(unsortedNumbers, 4);
        System.out.println("Binary search for 4 in sorted array: " + index);
//---------------------------------------------------------------
        // 9. Converting Arrays to List
        System.out.println("\nArray to List (fruits): " + Arrays.asList(fruits));
//---------------------------------------------------------------
        // 10. Jagged Arrays (Arrays of Different Lengths)
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[]{1, 2, 3};
        jaggedArray[1] = new int[]{4, 5};
        jaggedArray[2] = new int[]{6};

        System.out.println("\nJagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.println("Row " + i + ": " + Arrays.toString(jaggedArray[i]));
        }
    }
//---------------------------------------------------------------
}
