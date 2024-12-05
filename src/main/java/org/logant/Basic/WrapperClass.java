package org.logant.Basic;

public class WrapperClass {

    /*
     * Integer wrapper class:
     * Caching Behavior of Integer Objects
     * -------------------------------------------------
     * Java employs an internal cache for Integer objects within the range -128 to
     * 127. When you create Integer objects within this range, such as:
     * Integer a = 10;
     * Integer b = 10;
     * Both a and b will reference the same cached Integer object representing the
     * value 10. Consequently, comparing a == b will yield true, as they point to
     * the same cached object.
     * 
     * However, for values outside this cached range, like:
     * Integer x = 150;
     * Integer y = 150;
     * Java won’t reuse the same object reference from the cache. In this case, x
     * and y will refer to different Integer objects, and x == y will return false.
     */
}
