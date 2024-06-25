package oops4;

public class LearnInnerClass {
    class Toy {
        int price ;
    }
    static  class PlayStation {
        int price ;
    }

    public static void main(String[] args) {
    // Inner class
    // Non-static nested class within another class

        LearnInnerClass obj = new LearnInnerClass();
        Toy toy =  obj.new Toy();
        toy.price = 23;

    // nested static class
    // Static-class within another class
    // Cannot access the member variables of the outer class because outer class instance is not created

        PlayStation g4 = new LearnInnerClass.PlayStation() ;
         g4.price = 200 ;

    }

}


