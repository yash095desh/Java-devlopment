package LearnObjectClass;

public class ObjectClass {
    public static void main(String[] args) {
        //Object class is present in Java.lang.package
        //Every Class is directly or indirectly derived from Object Class.

//        Object Methods
//        1) getClass();
//        2) hashCode();
//        3) wait();
//        4) toString();
//        5) clone();
//        6) equals();
//        7) finalize();
//        8) notify();
//        9) notifyall();

        Demo obj = new Demo("Demo1");
//      System.out.println(obj.getClass()); // returns => class LearnObjectClass.Demo
//       System.out.println(obj.hashCode());  // returns unique hashCode for this object =>1791741888
//        System.out.println(obj.toString()); //  returns a string that "textually represents" this object => LearnObjectClass.Demo@6acbcfc0

        Demo obj2 = new Demo("Demo1");

        System.out.println(obj.equals(obj)); // return true

        System.out.println(obj.equals(obj2)); // return false because reference for both user is different you can check by printing each classObject using toString() method

    }
}

class Demo {
    String name ;
    Demo (String name){
        this.name = name ;
    }

    void SomeFuction (){
        System.out.println(" Working 123");
    };
}