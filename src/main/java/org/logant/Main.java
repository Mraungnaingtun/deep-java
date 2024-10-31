package org.logant;

import org.logant.MULTITHREAD.MultithreadTest;

public class Main {
    public static void main(String[] args) {
       
        int numberOfThreads = 10;
        for (int i = 1; i <= numberOfThreads; i++) {
            MultithreadTest thread = new MultithreadTest(i);
            thread.start();
        }
        
        System.out.println("Main Thread is Running");
    }
}