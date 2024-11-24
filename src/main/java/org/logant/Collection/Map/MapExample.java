package org.logant.Collection.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * Map <- SortedMap <- NavigableMap
 * key-value pairs
 * There are several implementations of the Map interface
 * ---------------------------------------------------
 * SortedMap
 * sort their keys like SortedSet
 * ----------------------------------------
 * NavigableMap is same as NavigableSet
 */

/*
 * Checking for the Content of a Map
 * ---------------------------------
 * isEmpty()
 * size()
 * clear()
 * putAll(otherMap)
 * 
 */

public class MapExample {

    // main concepts
    void showMap() {
        /*
         * A key can be bound to only one value
         * A value can be bound to several keys.
         * 
         * to add -> put(key, value)
         * if existing key -> replace value
         * if not create new
         * 
         * putIfAbsent()
         * remove(key) -> return null
         * map.remove("five",6) -> when match key and value too -> return boolean
         * 
         * check present
         * -------------
         * .containsKey(key)
         * .containsValue(value)
         */
    }

    void showLinkedHashMap() {
        /*
         * LinkedHashMap
         * this keep added order
         * maintains the insertion order by default.
         */

        Map<String, String> mapp = new LinkedHashMap<>();
        mapp.put("first", "first value");
        mapp.put("second", "second value");
        mapp.put("third", "third value");
        System.out.println(mapp);
    }

    // Using the Convenience Factory Methods for Collections to Create Maps
    void showFactoryMethod() {
        // suggest no more than 10 key-value pairs.
        Map<Integer, String> mapOne = Map.of(
                1, "one",
                2, "two",
                3, "three");
        System.out.println(mapOne);

        // if you have more
        Map.Entry<Integer, String> e1 = Map.entry(1, "one");
        Map.Entry<Integer, String> e2 = Map.entry(2, "two");
        Map.Entry<Integer, String> e3 = Map.entry(3, "three");

        Map<Integer, String> mapTwo = Map.ofEntries(e1, e2, e3);
        System.out.println(mapTwo);
        // or like this
        Map<Integer, String> mapThree = Map.ofEntries(
                Map.entry(1, "one"),
                Map.entry(2, "two"),
                Map.entry(3, "three"),
                Map.entry(3, null));
        System.out.println(mapThree);

        /*
         * 1) The map and the entries you get are immutable objects
         * 2) Null entries, null keys, and null values are not allowed
         * 3) will be IllegalArgumentException
         */
    }

    void showPutIfAbset() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Apple");
        myMap.put(2, "Banana");
        myMap.put(3, null);

        myMap.putIfAbsent(3, "hello"); // မရှိစော် or null ဖြစ်နိန်ကေ effect ဖြစ်တေ
        System.out.println();
        System.out.println(myMap);// {1=Apple, 2=Banana, 3=hello}

        // -----------------------------------------------
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", null);
        map.put("three", 3);
        map.put("four", null);
        map.put("five", 5);
        for (String key : map.keySet()) {
            map.putIfAbsent(key, -1);
        }
        for (int value : map.values()) {
            System.out.println("value = " + value);
        }
        // ---------------getOrDefault--------------------------
        Map<Integer, String> map2 = new HashMap<>();

        map2.put(1, "one");
        map2.put(2, "two");
        map2.put(3, "three");

        List<String> values = new ArrayList<>();
        for (int key = 0; key < 5; key++) {
            values.add(map2.getOrDefault(key, "UNDEFINED"));
        }
        System.out.println("values = " + values);
        // -------------------------------------------------------
    }

}
