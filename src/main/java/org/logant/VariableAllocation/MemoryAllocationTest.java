package org.logant.VariableAllocation;

import java.util.*;

public class MemoryAllocationTest {

    public MemoryAllocationTest(){}

    public void testInList(){
        List<String> myList1 = new ArrayList<>();
        myList1.add("Aung");
        myList1.add("Naing");
        myList1.add("Tun");

        //same reference in heap
        List<String> myList2 = myList1;
        myList1.remove(0);
        myList2.add("Htay");
        System.out.println("list one : " + myList1);
        System.out.println("list two : " + myList2);


        //new reference in heap
        List<String> myList3 = new ArrayList<>();
        myList3.add("Aung");
        myList3.add("Naing");
        myList3.add("Tun");
        changeList(myList3);
        System.out.println("list three : " + myList3);

    }

    private void changeList(List<String> myList3){
        myList3.add("NewItem");
    }

    public void testInMap() {
        // Creating a HashMap and adding entries
        Map<String, String> myMap1 = new HashMap<>();
        myMap1.put("key1", "Aung");
        myMap1.put("key2", "Naing");
        myMap1.put("key3", "Tun");

        // Same reference in heap
        Map<String, String> myMap2 = myMap1;
        myMap1.remove("key1");
        myMap2.put("key4", "Htay");
        System.out.println("map one : " + myMap1);
        System.out.println("map two : " + myMap2);

        // New reference in heap
        Map<String, String> myMap3 = new LinkedHashMap<>();
        myMap3.put("key1", "Aung");
        myMap3.put("key2", "Naing");
        myMap3.put("key3", "Tun");
        changeMap(myMap3);
        System.out.println("map three : " + myMap3);
    }

    private void changeMap(Map<String, String> myMap3) {
        myMap3.put("key5", "NewItem");
    }

 
}
