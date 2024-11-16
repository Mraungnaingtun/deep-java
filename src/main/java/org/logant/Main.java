package org.logant;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        new TestBlock();
        System.out.println();
        new TestBlock();
    }
}

class TestBlock {
    {
        System.out.println("No Static Block1");
    }

    {
        System.out.println("No Static Block2");
    }

    static {
        System.out.println("Static Block1");
    }

    static {
        System.out.println("Static Block2");
    }

}