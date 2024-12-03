package org.logant.DateTimeAPI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/*
 * 
 */
public class ParsingandFormatting {

    // temporal-based classes in the Date-Time API provide parse() methods
    public static void showParsing() {

        /*
         * you provide a pattern to the DateTimeFormatter to create a formatter object.
         * 
         * This formatter is then passed to the parse() or format() method.
         * 
         * The DateTimeFormatter class provides numerous predefined formatters,
         * or you can define your own.
         * 
         */

        String input = "Dec 31 2024";
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d yyyy");
            LocalDate date = LocalDate.parse(input, formatter);

            System.out.printf("Parsed date: %s%n", date);

        } catch (DateTimeParseException exc) {
            System.out.printf("\"%s\" is not parsable!%n", input);
            throw exc;
        }
    }

    public static void showFormatting() {
          // Create a LocalDate object
          LocalDate date = LocalDate.of(2024, 12, 3);
        
          // Define the formatter with a desired pattern
          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d yyyy");
          
          // Format the LocalDate into a string
          String formattedDate = date.format(formatter);
          
          // Print the formatted date string
          System.out.printf("Formatted date: %s%n", formattedDate);
    }

}
