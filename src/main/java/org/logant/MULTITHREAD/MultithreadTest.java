package org.logant.MULTITHREAD;

// MultithreadTest.java
public class MultithreadTest extends Thread {
    private final int threadNumber;

    public MultithreadTest(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        System.out.println("Thread " + threadNumber + " is running.");
        try {
            // Simulating work by making the thread sleep for a short time
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadNumber + " was interrupted.");
        }
        System.out.println("Thread " + threadNumber + " has finished execution.");
    }
}