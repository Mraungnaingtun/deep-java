package org.logant;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        Collection<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");

        strings.remove("three");

        System.out.println(strings);

    }
    
}


