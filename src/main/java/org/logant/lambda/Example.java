package org.logant.lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example {

    /*
     * A lambda expression is an implementation of the only abstract method in
     * functional interface
     * 
     */

    public Example() {

        // 1)Supplier<T> -> T get() -> take nothing and return something
        Supplier<Double> randomNumbSupplier = () -> Math.random();
        System.out.println(randomNumbSupplier.get());

        // 2)Consumer<T> -> void accept(T t) -> take something and return nothing
        Consumer<String> printConsumer = message -> System.out.println(message);
        printConsumer.accept("Test Message");

        // 3)Predicate<T> -> boolean test(T t) -> take something test and return
        // result(boolean)
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(10));

        // 4)Function<T, R> -> R apply(T t) -> take something and return something
        Function<String, Integer> giveStrLength = str -> str.length();
        System.out.println(giveStrLength.apply("Test"));

        //=====================================================================================
        /*
         * Method reference
         * 
         * Static RefType::staticMethod (args) -> RefType.staticMethod(args)
         * Bound expr::instanceMethod (args) -> expr.instanceMethod(args)
         * Unbound RefType::instanceMethod (arg0, rest) -> arg0.instanceMethod(rest)
         * Constructor ClassName::new (args) -> new ClassName(args)
         */
        //=====================================================================================

        
        // Static Method (RefType::staticMethod)
        DoubleUnaryOperator sqrt = a -> Math.sqrt(a);
        double result = sqrt.applyAsDouble(20);
        System.out.println("Max: " + result);
        // -----------------------
        DoubleUnaryOperator sqrt1 = Math::sqrt;
        double result1 = sqrt1.applyAsDouble(20);
        System.out.println("Max: " + result1);
        // ----------------------------------------

        // Unbound Method References(RefType::instanceMethod)
        Function<String, Integer> toLength = s -> s.length();
        System.out.println(toLength.apply("AungNaingTun"));

        Function<String, Integer> toLength1 = String::length;
        System.out.println(toLength1.apply("AungNaingTun"));
        // ----------------------------------------
        // Function<User, String> getName = user -> user.getName();
        Function<User, String> getName = User::getName;
        User user = new User("Aung");
        System.out.println(getName.apply(user));

        BiFunction<String, String, Boolean> unboundLambda = (str1, str2) -> str1.equalsIgnoreCase(str2);
        BiFunction<String, String, Boolean> unboundMethodRef = String::equalsIgnoreCase;
        System.out.println(unboundLambda.apply("Aung", "aung"));
        System.out.println(unboundMethodRef.apply("Aung", "aung"));
        // ----------------------------------------

        // Bound (expr::instanceMethod)
        Consumer<String> printer = System.out::println;
        printer.accept("AungChay");

        String greeting = "Hello, ";
        Function<String, String> boundLambda = name -> greeting.concat(name);
        Function<String, String> boundMethodRef = greeting::concat;
        System.out.println(boundLambda.apply("Aung"));
        System.out.println(boundMethodRef.apply("Chay"));
        // ----------------------------------------

        //Constructor Reference
        Function<String, User> constructorLambda = name -> new User(name);
        Function<String, User> constructorMethodRef = User::new;
        System.out.println(constructorLambda.apply("Aung"));
        System.out.println(constructorMethodRef.apply("Chay"));
        // ----------------------------------------
    }

}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}