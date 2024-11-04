package org.logant.MULTITHREAD;

import java.util.concurrent.CompletableFuture;

public class AsyncAwaitExample {
    public static void mainMethod() {

        // Calling the async method
        asyncMethod().thenAccept(result -> {
            System.out.println(result);
            System.out.println("Main 1");
        });

        System.out.println("Main 2");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void mainMethod2() {

        // Calling the async method
        asyncMethod().thenRun(() -> {
            System.out.println("Main 1");
        });
        System.out.println("Main 2");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void mainMethod3() {

        asyncMethod()
                .thenCompose(result -> {
                    // Perform another asynchronous task based on the result
                    return anotherAsyncMethod(result);
                })
                .thenAccept(finalResult -> {
                    System.out.println(finalResult);
                    System.out.println("Main 1");
                });
        
        System.out.println("Main Thread");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Simulates an asynchronous operation
    public static CompletableFuture<String> asyncMethod() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Return a string");
            return "Hello from async method!";
        });
    }

    public static CompletableFuture<String> anotherAsyncMethod(String input) {
        System.out.println("Hello1");
        return CompletableFuture.supplyAsync(() -> {
            return input + " and also from another async method!";
        });
    }

}
