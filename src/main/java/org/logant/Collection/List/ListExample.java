package org.logant.Collection.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Iterable
// └── Collection
//     ├── List
//     │   ├── ArrayList
//     │   ├── LinkedList
//     │   └── Vector
//     ├── Set
//     │   ├── HashSet
//     │   ├── LinkedHashSet
//     │   └── TreeSet
//     ├── Queue
//     │   ├── PriorityQueue
//     │   ├── ArrayDeque
//     │   ├── LinkedList (also implements Deque)
//     │   └── DelayQueue
//     ├── Deque
//     │   ├── ArrayDeque
//     │   └── LinkedList
//     └── Map (does not implement Collection)
//         ├── HashMap
//         ├── LinkedHashMap
//         ├── TreeMap
//         ├── Hashtable
//         └── WeakHashMap
//         └── ConcurrentHashMap


public class ListExample {

    public static void showAll() {
    }

    // 1. ArrayList
    // Characteristics:
    // Implements a resizable array.
    // Provides fast random access (index-based).
    // Not synchronized (not thread-safe).
    // Allows null elements.
    public void ArrayListExample() {
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

//------------------------------------------------------------------------------------------------------------------------
    //Implements a doubly-linked list.
    //     Better performance for frequent insertion/removal operations (especially at the beginning or middle).
    //     Slower for random access
    //     Not synchronized.
    //     Can also be used as a Queue or Deque.
    public void LinkedListExample() {
         // Creating a LinkedList of Strings
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


