package org.logant;

import org.logant.OOP.Inheritance;

public class Main {

    public static void main(String[] args) {
    //    new Block();
    //    new Block();


        Inheritance inheritance = new Inheritance();
        inheritance.showWhatIHave();
    }
}

class Block {

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