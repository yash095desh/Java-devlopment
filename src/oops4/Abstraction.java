package oops4;

public class Abstraction {

    //Abstraction
    //  is an important concept of object-oriented programming that allows us to hide unnecessary details and only show the needed information

    // abstraction can be achieved by using
    //1) abstract Class
    //2) Interfaces

    public static void main(String[] args) {

        // both bike and car are subclass of vehicle thus always contain all methods of abstract parent class
        Car aulto = new Car();

        aulto.start();
        aulto.wheelCount(4);
        aulto.horn();

        Bike KTM = new Bike();
        KTM.start();
        KTM.wheelCount(2);

    }

}
    // abstract class
    abstract class Vehicle {

    abstract void start();

    abstract void wheelCount(int wheels);

    // abstract class can have both regular and abstract methods
    void horn (){
        System.out.println("Vehicle is horning ");
    }

    }

// subClass is formed using abstract main class and has to implement all methods declared in parent class So abstract class serves as a blueprint for the subclass


  class  Car extends Vehicle{
      @Override
      void start() {
          System.out.println("Car is Starting");
      }

      @Override
      void wheelCount(int wheels) {
          System.out.println("Car has " + wheels + "wheels");
      }
  }

  class Bike extends Vehicle{

      @Override
      void start() {
          System.out.println("Bike is Starting");
      }

      @Override
      void wheelCount(int wheels) {
          System.out.println("Bike has "+ wheels +" wheels");
      }
  }
