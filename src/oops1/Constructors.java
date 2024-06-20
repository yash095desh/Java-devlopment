package oops1;

public class Constructors {
    public static void main(String[] args) {
        //Constructors-
        //Constructors are invoked when you create instance of objects
        Complex c1 = new Complex();
        c1.print();
        Complex c2 = new Complex(2,4);
        c2.print();

    }
}

class Complex{
    int a,b;

    //initally
//    Complex(){
//        int a = 0;
//        int b = 0;
//    }

    Complex(){// overriding constructor
         a = 2;
         b = 3;
    }

//    Complex(int real,int imaginary){
//        a = real;
//        b = imaginary;
//    }


    // this keyword
    //- this keyword is used to refer to the current object inside a method or a constructor.

    Complex(int a , int b){
        this.a = a;
        this.b = b;
    }


    void print(){
        System.out.println(a+" + "+"i"+b);
    }
}