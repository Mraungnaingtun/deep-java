package org.logant.Basic.Record;

// they do not require explicit set methods since they are immutable
// can use getter methods, toString(), hashCode(), and equals()
// thread safety
// Records are perfect for defining DTOs // Data Transfer Objects
public record StudentRecord(String name, int age, String course) {

    public static void test() {
        StudentRecord student1 = new StudentRecord("aungchay", 12, "java basic");
        System.out.println();
        System.out.println("age -- > " + student1.age());
        System.out.println("course -- > " + student1.course());
        System.out.println("name -- > " + student1.name());

        StudentRecord student2 = new StudentRecord("aungoo", 15, "c++ basic");
        System.out.println();
        System.out.println("age -- > " + student2.age());
        System.out.println("course -- > " + student2.course());
        System.out.println("name -- > " + student2.name());

    }
}