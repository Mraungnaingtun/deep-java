package org.logant.Collection.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Set
 * The Set interface does not bring any new method to the Collection interface.
 * 
 * Factory Methods
 * ------------------
 *  1) Arrays.asList()
 *  2) List.of()
 *  3) Set.of()
 *  4) .copyOf()
 * 
 */

public class SetExample {

    void showSet() {
        /*
         * HashSet Class
         * -------------
         * HashSet ရဲ့ internal implementation မှာ HashMap ကို အသုံးပြုပြီး data ကို
         * store လုပ်တယ်။
         * 
         * <<< HashSet value is key of HashMap >>>
         * HashSet<String> set = new HashSet<>();
         * set.add("A"); // Internally, map.put("A", PRESENT);
         * set.add("B"); // Internally, map.put("B", PRESENT);
         */

        Set<String> mySet = new HashSet<>();
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Orange");

    }

    void showSortedSet() {
        /*
         * SortedSet - Inteface // TreeSet Class
         * --------------------
         * 1) first() and last()
         * 2) headSet(toElement) -> returns subsets
         * 3) tailSet(fromElement) -> returns subsets
         * 4) subSet(fromElement, toElement) -> returns subsets
         */
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(5);
        sortedSet.add(3);
        sortedSet.add(8);
        sortedSet.add(1);

        NavigableSet<String> sortedStrings = new TreeSet<>(Set.of("a", "b", "c", "d", "e", "f"));
        System.out.println("sorted strings = " + sortedStrings);
        NavigableSet<String> reversedStrings = sortedStrings.descendingSet();
        System.out.println("reversed strings = " + reversedStrings);

    }

    // Creating and Processing Data with the Collections Factory Methods
    public static void showCollectionsFactoryMethods() {
        List<String> stringList = List.of("one", "two", "three");
        Set<String> stringSet = Set.of("one", "two", "three");
        System.out.println(stringList);
        System.out.println(stringSet);
        // can't add or modify like this
        // stringList.add("four");
        // stringList.remove("one");

        /*
         * if in List<User> ...
         * user's age is integer , it can change
         */
    }

    // Getting an Immutable Copy of a Collection
    public static void showImmutableCollection() {
        Collection<String> strings = new ArrayList<>(Arrays.asList("one", "two", "three"));
        // --------------require non null value-------------------------
        List<String> list = List.copyOf(strings);
        Set<String> set = Set.copyOf(strings);
        // -------------------------------------------------------------
        System.out.println(list);
        System.out.println(set);

        strings.add("four");
        // modifying this collection will not be reflected in the list or set
        System.out.println(list);
        System.out.println(set);
    }

    // Wrapping an Array in a List
    void wrappingAnArray() {
        /*
         * can't add or remove // UnsupportedOperationException,
         * only can replace
         */
        List<String> strings = Arrays.asList("one", "two", "three");
        strings.set(1, "new two"); // Replace element at index 1
        System.out.println(strings);

    }
}
