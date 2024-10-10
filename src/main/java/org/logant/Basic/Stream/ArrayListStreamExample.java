package org.logant.Basic.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayListStreamExample {
    public static void mainFunction() {
        // Creating an ArrayList
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice");
// -----------------------------------------------------------------------------------------
        // Filtering names that start with "A"
        List<String> filteredNames = names.stream()
                                           .filter(name -> name.startsWith("A"))
                                           .collect(Collectors.toList());
        System.out.println("Filtered Names: " + filteredNames); 
        // Output: [Alice]
// -----------------------------------------------------------------------------------------
        // Transforming names to uppercase
        List<String> upperCaseNames = names.stream()
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());
        System.out.println("Uppercase Names: " + upperCaseNames); 
        // Output: [ALICE, BOB, CHARLIE]
// -----------------------------------------------------------------------------------------
        // Sorting names
        List<String> sortedNames = names.stream()
                                         .sorted()
                                         .collect(Collectors.toList());
        System.out.println("Sorted Names: " + sortedNames); 
        // Output: [Alice, Bob, Charlie]
// -----------------------------------------------------------------------------------------
        // Counting names with more than 3 letters
        long count = names.stream()
                          .filter(name -> name.length() > 3)
                          .count();
        System.out.println("Count of names with more than 3 letters: " + count); 
        // Output: 2
// -----------------------------------------------------------------------------------------
        // Reducing names to a single string
        String concatenatedNames = names.stream()
                                         .reduce("", (a, b) -> a + b + " ");
        System.out.println("Concatenated Names: " + concatenatedNames.trim()); 
        // Output: Alice Bob Charlie
// -----------------------------------------------------------------------------------------
        // Collecting to a Set
        Set<String> nameSet = names.stream()
                                    .collect(Collectors.toSet());
        System.out.println("Name Set: " + nameSet); 
        // Output: [Alice, Bob, Charlie]
// -----------------------------------------------------------------------------------------
        // Grouping names by their length
        Map<Integer, List<String>> namesByLength = names.stream()
                                                        .collect(Collectors.groupingBy(String::length));
        System.out.println("Names by Length: " + namesByLength); 
        // Output: {3=[Bob], 5=[Alice], 7=[Charlie]}
// -----------------------------------------------------------------------------------------
    }
}
