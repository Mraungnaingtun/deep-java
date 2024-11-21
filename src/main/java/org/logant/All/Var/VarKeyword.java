package org.logant.All.Var;

import java.util.HashMap;
import java.util.List;

import org.logant.All.Record.StudentRecord;


public class VarKeyword {

    public static void showAll(){
        var name = "John";        // Compiler infers String
        var age = 25;             // Compiler infers int
        var isStudent = true;     // Compiler infers boolean

        System.out.println(name); // Prints: John
        System.out.println(age);  // Prints: 25
        System.out.println(isStudent); // Prints: true

//        For-Loop Declarations
        for (var i = 0; i < 10; i++) {
            System.out.println(i);
        }
//        Enhanced for-loop:
        var numbers = List.of(1, 2, 3, 4, 5);
        for (var number : numbers) {
            System.out.println(number);  // Compiler infers the type from the collection (int)
        }

//        With try-with-resources Statement
//        try (var input = new FileInputStream("data.txt")) {
//            // Use the input stream
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        In Switch Statements
        var day = "MONDAY";
        switch (day) {
            case "MONDAY" -> System.out.println("Start of the week!");
            case "FRIDAY" -> System.out.println("End of the week!");
            default -> System.out.println("Midweek!");
        }

        //Lambda Parameters
        List<String> names = List.of("Alice", "Bob");
        names.forEach(n -> System.out.println(name));

        var nameMap = new HashMap<>();
        StudentRecord person = new StudentRecord("Alice", 30,"Java");
        nameMap.put("first","Aung");
        nameMap.put("last","Chay");
        nameMap.put("full",person);
        System.out.println(nameMap);

    }
}
