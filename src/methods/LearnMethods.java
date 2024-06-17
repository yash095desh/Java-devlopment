package methods;

public class LearnMethods {
    public static void main (String[] args){
        // method -
        // A method is a block of code or collection of statements or a set of code grouped together to perform a certain task or operation. It is used to acheive the reusabilty of code.


//         Components of method/function
//        public -> access Specifier
//        int -> return type
//        sum -> method name



        // calling a function
        greet("Yash");// <-- parameter
        System.out.println(average(12,34));

    }

    // declaring a function
    public static void greet( String name){
        System.out.println("Hello "+name);
    }

    public static int average(int a,int b){
        return a+b/2 ;
    }

}
