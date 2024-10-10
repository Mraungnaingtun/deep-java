package org.logant.All.Stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class MapStreamExample {

  public static void showAll(){
        Map<String,Object> newMap = new HashMap<>();
        newMap.put("first","Aung");
        newMap.put("last","Chay");
        newMap.put("Address", "Rakhine");
        newMap.put("age", 24);

        newMap.values().stream().forEach(System.out::println);
  }      

  public void showAll1(){

      var map = new HashMap<String, Integer>(); //<---------using var keyword

      map.put("Apple", 1);
      map.put("Banana", 2);
      map.put("Cherry", 3);
// -----------------------------------------------------------------------------------------
      // Using var in a stream operation
      var filteredMap = map.entrySet()
              .stream()
              .filter(entry -> entry.getValue() > 0)
              .filter(entry -> entry.getKey().toLowerCase().startsWith("a"))
              .toList(); // Collecting results into a List
      filteredMap.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
// -----------------------------------------------------------------------------------------
  }

  public static void showAll2(){
          Map<String, Integer> map = new HashMap<>();
          map.put("Apple", 3);
          map.put("Banana", 2);
          map.put("Orange", 5);
          map.put("Grapes", 1);
          map.put("Mango", 4);
// -----------------------------------------------------------------------------------------
          // 1. Iterating using streams
      System.out.println("1. Iterating using streams");
          System.out.println("All fruits:");
          map.forEach((key, value) -> System.out.println(key + ": " + value));
// -----------------------------------------------------------------------------------------
          // 2. Filtering entries
      System.out.println("2. Filtering entries");
          System.out.println("\nFruits with quantity greater than 2:");
          map.entrySet()
                  .stream()
                  .filter(entry -> entry.getValue() > 2)
                  .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
// -----------------------------------------------------------------------------------------
          // 3. Transforming values
      System.out.println("3. Transforming values");
          System.out.println("\nTransformed values:");
          map.entrySet()
                  .stream()
                  .map(entry -> entry.getKey() + " has quantity " + entry.getValue())
                  .forEach(System.out::println);
// -----------------------------------------------------------------------------------------
          // 4. Sorting by keys
      System.out.println("4. Sorting by keys");
          System.out.println("\nSorted by keys:");
          map.entrySet()
                  .stream()
                  .sorted(Map.Entry.comparingByKey())
                  .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
// -----------------------------------------------------------------------------------------
          // 5. Sorting by values
      System.out.println("5. Sorting by values");
          System.out.println("\nSorted by values:");
          map.entrySet()
                  .stream()
                  .sorted(Map.Entry.comparingByValue())
                  .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
// -----------------------------------------------------------------------------------------
          // 6. Collecting results
      System.out.println("6. Collecting results");
          Map<String, Integer> filteredMap = map.entrySet()
                  .stream()
                  .filter(entry -> entry.getValue() > 2)
                  .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

          System.out.println("\nFiltered Map: " + filteredMap);
// -----------------------------------------------------------------------------------------
          // 7. Finding maximum and minimum values
      System.out.println("7. Finding maximum and minimum values");
          map.entrySet()
                  .stream()
                  .max(Map.Entry.comparingByValue())
                  .ifPresent(entry -> System.out.println("Max: " + entry.getKey() + " = " + entry.getValue()));

          map.entrySet()
                  .stream()
                  .min(Map.Entry.comparingByValue())
                  .ifPresent(entry -> System.out.println("Min: " + entry.getKey() + " = " + entry.getValue()));
// -----------------------------------------------------------------------------------------
          // 8. Grouping by values
      System.out.println("8. Grouping by values");
          Map<Integer, List<String>> groupedByValue = map.entrySet()
                  .stream()
                  .collect(Collectors.groupingBy(Map.Entry::getValue,
                          Collectors.mapping(Map.Entry::getKey, Collectors.toList())));

          System.out.println("\nGrouped by Value: " + groupedByValue);
// -----------------------------------------------------------------------------------------
          // 9. Counting occurrences
      System.out.println("9. Counting occurrences");
          long countGreaterThanTwo = map.values()
                  .stream()
                  .filter(value -> value > 2)
                  .count();

          System.out.println("Count of values greater than 2: " + countGreaterThanTwo);
// -----------------------------------------------------------------------------------------

  }
}
