package org.logant.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/*

 Iterable
└── Collection
    ├── List
    └── Set
        └── SortedSet
            └── NavigableSet

 */

// What Collection Can Do
/*
 * add or remove elements;
 * test for the presence of a given element;
 * ask for the number of elements contained, or if this collection is empty;
 * clear this content.
 * 
 */

/*
 * testing for the inclusion of a set in another set; -> containsAll()
 * union; -> addAll()
 * intersection; -> retainAll(Collection c)
 * complement. -> removeAll()
 */

/*
 * iterate over the elements of a collection, through the use of an iterator
 * create a stream on these elements, that can be parallel.
 */

/*
 * Methods That Handle The Collection Itself
 * size()
 * isEmpty()
 * clear()
 */

public class CollectionExample {
    /*
     * The Collections Framework is about storing and organizing
     * your data in the memory of your JVM
     * 
     * // store // organize // access // data in memory
     * 
     * a set of interfaces
     * 
     * Two main categories of interfaces => collections and maps.
     * 
     * Queues and stacks are not really about iterating over collections of objects
     */
    void runIt() {
        Collection<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        System.out.println("strings = " + strings);
        strings.remove("one");
        System.out.println("strings = " + strings);
    }

    void filterCollection() {
        Predicate<String> isNull = Objects::isNull;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNullOrEmpty = isNull.or(isEmpty);

        Collection<String> strings = new ArrayList<>();
        strings.add(null);
        strings.add("");
        strings.add("one");
        strings.add("two");
        strings.add("");
        strings.add("three");
        strings.add(null);

        System.out.println("strings = " + strings);
        strings.removeIf(isNullOrEmpty);
        System.out.println("filtered strings = " + strings);
    }

    void testIterator() {
        Collection<String> strings = List.of("one", "two", "three", "four");
        for (Iterator<String> it = strings.iterator(); it.hasNext();) {
            String element = it.next();
            if (element.length() == 3) {
                System.out.println(element);
            }
        }

    }

}
