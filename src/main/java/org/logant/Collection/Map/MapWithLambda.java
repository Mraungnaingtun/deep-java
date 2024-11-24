package org.logant.Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class MapWithLambda {

    void show() {

        /*
         * Map interface has foreach
         * take BiConsumer<? super K, ? super V> action
         */
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.forEach((key, value) -> System.out.println(key + " : " + value));

        /*
         * replace methods
         * replace(key, value)
         */
        map.replace(3, "Three");
        map.forEach((key, value) -> System.out.println(key + " : " + value));

        /*
         * replace(key, existingValue, newValue)
         * key နက် old value တူမှ replace လုပ်
         */
        boolean replaced = map.replace(3, "threse", "Threeee");
        System.out.println("Apple replaced: " + replaced);

        /*
         * replaceAll()
         */
        map.replaceAll((key, value) -> value.toUpperCase());
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
