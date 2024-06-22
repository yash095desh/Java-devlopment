package oops3.LearnPackages;

// import statement used to import scanner class from java.utils
//import java.util.Scanner;
// we can import whole util package using  * in place of class name
import java.util.*;

public class JavaPackages {
    public static void main(String[] args) {
        // packages is simply a container that groups related types (Java Classes,interfaces,enmerations,and annotaion)
        //imported scanner class from java.util class
        Scanner sc = new Scanner(System.in);


    }
        // Java Access Modifiers
    // Java access modifiers are used to set  accessiblity of classes,variables,method , constructors ,data members and setter methods


        // by default any class within same package access count ;
        int count = 8 ; // default

        // Only this class can access data with private modifier
        private String impdata = "This is a secret"; // private

        // classes inside this package and subclass can access data with protected modifiers
        protected int age = 45; // protected

        // any class can access this data with public modifier
        public int size = 423 ;// public
}
