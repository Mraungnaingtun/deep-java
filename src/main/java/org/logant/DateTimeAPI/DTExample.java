package org.logant.DateTimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

/*
 * DateTime API
 * 
 * Most of the classes in the Date-Time API create objects that are immutable
 * of, from, or with, rather than constructors, and there are no set methods
 * 
 * 
 * 
 */
public class DTExample {

    /*
     * LocalDate
     * YearMonth
     * MonthDay
     * Year
     * 
     * Immutable and Thread-Safe
     * isBefore, isAfter, and equals to compare
     * 
     */

    // DayofWeek(enum)
    void showDayOfWeek() {
        System.out.printf("%s%n", DayOfWeek.MONDAY.plus(3));
        DayOfWeek dow = DayOfWeek.MONDAY;
        Locale locale = Locale.getDefault();
        System.out.println(dow.getDisplayName(TextStyle.FULL, locale));
        System.out.println(dow.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(dow.getDisplayName(TextStyle.SHORT, locale));
    }

    // Month enum
    public static void showMonth() {
        // The Month enum includes constants for the twelve months
        System.out.printf("%d%n", Month.FEBRUARY.maxLength());
        Month month = Month.AUGUST;
        Locale locale = Locale.getDefault();
        System.out.println(month.getDisplayName(TextStyle.FULL, locale));
        System.out.println(month.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(month.getDisplayName(TextStyle.SHORT, locale));
    }

    // LocalDate Class
    public static void showLocalDate() {
        LocalDate date = LocalDate.of(2025, Month.FEBRUARY, 20);
        LocalDate nextWed = date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println(nextWed);

        // get day of a date
        DayOfWeek dotw = LocalDate.of(2024, Month.DECEMBER, 3).getDayOfWeek();
        System.out.println(dotw);

        // get next wednesday of a date
        LocalDate date1 = LocalDate.of(2024, Month.DECEMBER, 3);
        TemporalAdjuster adj = TemporalAdjusters.next(DayOfWeek.WEDNESDAY);
        LocalDate nextWed1 = date1.with(adj);
        System.out.printf("For the date of %s, the next Wednesday is %s.%n",
                date1, nextWed1);

    }

    // YearMonth Class
    public static void voidYearMonth() {
        YearMonth date = YearMonth.now();
        System.out.printf("%s: %d%n", date, date.lengthOfMonth());

        YearMonth date2 = YearMonth.of(2010, Month.FEBRUARY);
        System.out.printf("%s: %d%n", date2, date2.lengthOfMonth());

        YearMonth date3 = YearMonth.of(2012, Month.FEBRUARY);
        System.out.printf("%s: %d%n", date3, date3.lengthOfMonth());
    }

    // MonthDay Class
    public static void voidMonthDay() {
        MonthDay date = MonthDay.of(Month.FEBRUARY, 29);
        boolean validLeapYear = date.isValidYear(2010);
        System.out.println(validLeapYear);
        System.out.println("DayOfMonth " + date.getDayOfMonth());
    }

    // Year Class
    public static void voidYearClass() {
        boolean validLeapYear = Year.of(2024).isLeap();
        System.out.println(validLeapYear);
    }
}
