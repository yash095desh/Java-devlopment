package oops4;

public class FunctionalInterface {
    // An Interface that contains exactly one abstract method is known as functional interface

    public static void main(String[] args) {

//    Walks obj = new Walks() {
//        @Override
//        public void walking() {
//
//        }
//    };
//

    // through lambda expression excessing functional interface
    Walks obj2 = ()->{
        System.out.println("Walking");
    };
    obj2.walking();

    }
}

interface Walks {
    void walking ();
}
