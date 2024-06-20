package oops2;

public class Vehicle {
    String model ;
    int wheelCount ;

    Vehicle(){
        System.out.println("Vehicle constructor is initialized");
    }
    Vehicle(int wheelCount){
        this.wheelCount = wheelCount;
    }
// final keyword is non access modifier that is used to define entities that cannot be changed or modified
// method with final keyword cannot be overriden by subclasses
//   final void start(){
//        System.out.println("Vehicle is starting");
//    }

    void start(){
        System.out.println("Vehicle is starting");
    }
}
