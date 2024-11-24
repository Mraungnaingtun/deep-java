package org.logant;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Cherry", 3);
        linkedHashMap.put("Apple", 1);
        linkedHashMap.put("Banana", 2);

        linkedHashMap.put("Orange", 4);

        // Iterating through the LinkedHashMap
        linkedHashMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

}
