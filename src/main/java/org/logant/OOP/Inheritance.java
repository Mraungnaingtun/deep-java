package org.logant.OOP;

public class Inheritance {
    Me aungnaingtun = new Me("Rakhine Song");

    public void showWhatIHave() {
        System.out.println();
        System.out.println("Degree: " + aungnaingtun.bachelorDegree);
        System.out.println("Htaw Lar Gi: " + aungnaingtun.htawLarGi);
        System.out.println("Cows: " + aungnaingtun.cow);
        aungnaingtun.doBusiness();
        aungnaingtun.doWritingCoding();
        aungnaingtun.doFramerWork();
        aungnaingtun.loveChildren();
    }
}

class Me extends Papa {
    int bachelorDegree = 1;

    Me() {
        super();
    }

    Me(String song) {
        super(song);
        System.out.println("I like " + song + ".");
    }

    void doWritingCoding() {
        System.out.println("I can write code ✌🏻");
    }
    //default method overrding
    void loveChildren(){
        System.out.println("I love my children.");//but i don't have yet ,i will 🙄
    }
}

class Papa extends GrandPa {
    int htawLarGi = 2;

    Papa() {
        super();
    }

    Papa(String song) {
        this();
        System.out.println("Papa like " + song + ".");
    }

    void doBusiness() {
        System.out.println("I can do business.");
    };

    void loveChildren(){
        System.out.println("Papa love children.");
    }
}

class GrandPa {
    int cow = 50;

    GrandPa() {
        super();
    }

    GrandPa(String song) {
        super();
        System.out.println("GrandPa like " + song + ".");
    }

    void doFramerWork() {
        System.out.println("I can do framer work.");
    }


    void loveChildren(){
        System.out.println("GrandPa love children.");
    }
}