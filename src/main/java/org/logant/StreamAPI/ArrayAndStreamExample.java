package org.logant.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Array.stream().

public class ArrayAndStreamExample {
        public static void main(String[] args) {
                // Example: Integer Array to Stream
                Integer[] numbers = { 1, 2, 3, 4, 5, 6 };

                // ---------------------------------------------------------------

                // Convert Array to Stream using Arrays.stream()
                Stream<Integer> numberStream = Arrays.stream(numbers);
                numberStream.forEach(n -> System.out.println("Number: " + n));
                System.out.println(numberStream.filter(n -> n > 1).collect(Collectors.toList()));

                // ---------------------------------------------------------------

                // Example: Filter Even Numbers
                List<Integer> evenNumbers = Arrays.stream(numbers)
                                .filter(n -> n % 2 == 0)
                                .sorted()
                                .collect(Collectors.toList());
                System.out.println("Even Numbers: " + evenNumbers);

                // ---------------------------------------------------------------

                // Example: Square each number using map() and collect the result into a List
                List<Integer> squaredNumbers = Arrays.stream(numbers)
                                .map(n -> n * n)
                                .collect(Collectors.toList());
                System.out.println("Squared Numbers: " + squaredNumbers);

                // ---------------------------------------------------------------

                // Example: Primitive Array to Stream using Arrays.stream()
                int[] primitiveNumbers = { 5, 10, 15, 20 };
                IntStream intStream = Arrays.stream(primitiveNumbers);
                int sum = intStream.sum();
                System.out.println("Sum of primitive numbers: " + sum);

                // ---------------------------------------------------------------

                // Example: Convert Array to List using Stream
                String[] fruits = { "Apple", "Banana", "Cherry" };
                List<String> fruitList = Stream.of(fruits).collect(Collectors.toList());
                System.out.println("Fruit List: " + fruitList);

                // ---------------------------------------------------------------

                // Example: Find the first element greater than 3
                Integer firstNumberGreaterThanThree = Arrays.stream(numbers)
                                .filter(n -> n > 3)
                                .findFirst()
                                .orElse(null);
                System.out.println("First number greater than 3: " + firstNumberGreaterThanThree);

                // ---------------------------------------------------------------

                // Example: Sorting Stream from Array
                Integer[] unsortedArray = { 9, 1, 4, 3, 7 };
                List<Integer> sortedList = Arrays.stream(unsortedArray)
                                .sorted()
                                .collect(Collectors.toList());
                System.out.println("Sorted List: " + sortedList);
                // ---------------------------------------------------------------

                List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
                integerList.stream()
                                .filter(n -> n > 2)
                                .map(n -> n + 3).forEach(System.out::println);

                List<String> stringList = Arrays.asList("Bac", "BAC", "BAc", "Aung", "Yxn");
                stringList.stream()
                                .filter(n -> n.startsWith("B"))
                                .map(n -> n + "-Added").forEach(System.out::println);
                // ---------------------------------------------------------------
        }

}


