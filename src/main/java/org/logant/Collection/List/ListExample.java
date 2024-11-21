package org.logant.Collection.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * List Interface
 * -----------
 * 1) Accessing a Single Object
 * -> add(index, element)
 * -> get(index)
 * -> set(index, element) -- replace
 * -> remove(index)
 * ---------------------------------
 * 2) Finding the Index of an Object
 * -> indexOf(element)
 * -> lastIndexOf(element)
 * ---------------------------------
 * 3) Getting a SubList
 * -> subList(start, end)
 * ---------------------------------
 * 4) Inserting a Collection
 * ->  addAll(int index, Collection collection).
 * 
 * 
 * IndexOutOfBoundsException exception, if index is not valid
 */

public class ListExample {

    public void ArrayListExample() {
        /*
         * ArrayList
         * Provides fast random access (index-based).
         * Not synchronized (not thread-safe).
         * Allows null elements.
         */

        List<String> arrayList = new ArrayList<>();

        // Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Accessing elements by index
        System.out.println("Element at index 1: " + arrayList.get(1));
        // Iterating through ArrayList
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Removing an element
        arrayList.remove("Banana");
        System.out.println("ArrayList after removal: " + arrayList);
    }

    // ------------------------------------------------------------------------------------------------------------------------

    public void LinkedListExample() {
        /*
         * doubly-linked list.
         *
         * Slower for random access
         * Not synchronized
         * Faster than array
         * diminished(လျော့သွား) by modern hardware
         * can access its first and last element faster than an ArrayList
         */

        List<String> linkedList = new LinkedList<>();

        // Adding elements
        linkedList.add("Tom");
        linkedList.add("Jerry");
        linkedList.add("Spike");
        // Adding elements at specific positions
        linkedList.add(2, "Tyke");

        // Accessing elements by index
        System.out.println("Element at index 2: " + linkedList.get(2));

        // Iterating through LinkedList
        for (String character : linkedList) {
            System.out.println(character);
        }

        // Removing an element
        linkedList.remove("Jerry");
        System.out.println("LinkedList after removal: " + linkedList);
    }
}
