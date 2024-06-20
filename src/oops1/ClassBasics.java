package oops1;

public class ClassBasics {
    public static void main(String[] args) {
        //Class
        //- Class is blueprint which defines same properties and behaviours
        //Object
        //- An Object is an instance of a class which has those properties and behaviours attached


//Creating object using class
        Dog d1 = new Dog();
        d1.name ="Tommy";
        d1.bark();
        d1.walk();

//        Complex c1 = new Complex();
//        c1.a=4;
//        c1.b=5;
//        c1.print();

    }
}
// creating a class
class Dog {
    String name;
    int age;// class properties

    void bark(){  // behavious or class methods
        System.out.println(name + " is barking");
    }
    void walk(){
        System.out.println(name + " is walking");
    }
}

//class Complex{
//    int a,b;
//
//    void print(){
//        System.out.println(a + "+"+b+"i");
//    }
//}
