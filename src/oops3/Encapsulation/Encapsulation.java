package oops3.Encapsulation;



public class Encapsulation {

    public static void main(String[] args) {
        // Encapsulation refers to the building of feilds and methods inside a single class. It prevents outer class from accessing and changing feilds and method of a class



    }

    // If we want to access class members without creating an instance of the class we need to declare the class members static.
    //Static variables or methods can be accessed by calling the class name of the class
    // for example : Math.max(int a , int b)
    // here Math is class and max is static method to find maximum among to numbers.

    // Note this and super keyword not works inside static methods because they dont have instance.

    private static int serialNO = 12 ;
    private static String fileName = "Encapsulation" ;

    static int getSerialNO (){
        return  serialNO;
    }

    static String getfilename(){
        return fileName;
    }

    static void modifySerialNO (int serialNo){
      serialNO = serialNo ;
    }
    static void modifyfileName (String name){
        fileName = name ;
    }


}
