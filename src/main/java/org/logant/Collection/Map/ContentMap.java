package org.logant.Collection.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ContentMap {

    /*
     * 1) Set<K> keySet();
     * 
     * 2) Collection<V> values();
     * 
     * 3) Set<Map.Entry<K, V>> entrySet();
     */

    void showMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");

        Set<Integer> keys = map.keySet();
        System.out.println("keys = " + keys);

        Collection<String> values = map.values();
        System.out.println("values = " + values);

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println("entries = " + entries);

        keys.remove(3);
        entries.forEach(System.out::println);
    }
}
