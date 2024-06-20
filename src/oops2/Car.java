package oops2;
//Inheritance is one of the key features of  OOPs that allows us to create a new class from existing class
public final class Car extends Vehicle{

    int gears ;

    //Method Overriding
    // If a subclass provides the specific implementation of method that has been declared by one of the parent class,it is known as Method Overriding

    @Override
    void start() {
        //super keyword
        //super is a special keyword in Java that is used to refer the instance of parent class
        super.start();
        System.out.println(model + " is starting ");
    }
    void count(){
        System.out.println(model + " has " + wheelCount + "wheels");
    }

    Car(){
        System.out.println("Car contructor is initalized"+ this);
    }

    Car(int wheelcount){
        // super keyword is used to invoke instance variable,method or constructor of immediate parent class
        super(wheelcount);
        System.out.println("Car contructor is initalized"+ this);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        //wheelcount,model and start are inherited from  Vehicle(Parent class)
        c1.wheelCount = 6 ;
        c1.model = "TG-90" ;
        c1.gears = 4 ;
        c1.start();
        c1.count();

        Car c2 = new Car(4);
        c2.model = "IM-50" ;
        c2.count();

    }
}
