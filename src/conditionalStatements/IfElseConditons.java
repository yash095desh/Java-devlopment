package conditionalStatements;

import java.util.Scanner;

public class IfElseConditons {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

      // ---- Java if-else statements

       /*
        The if statement execute a certain section of code if the test expression is evaluated true

        Statement inside the body of else block are executed if the test expression is evaluated to if (true)
        This is known as if-else statement
       */

//        System.out.println("Enter Your Age");
//        int age = sc.nextInt();
//        if(age>=18){
//            System.out.println("You can vote");
//        }
//        else {
//            System.out.println("You are not allowed to vote");
//        }


        // ---- Java if-else if -else statements


        /*
        In ,Java we have an if else-if ladder,
        that can be used to execute one block of code among multiple other blocks
        */

//        System.out.println("Enter day as a num");
//        int day = sc.nextInt();
//        if(day == 1){
//            System.out.println("Go to  home");
//        } else if (day == 2) {
//            System.out.println("Go to gym");
//        } else {
//            System.out.println("Go to Office");
//        }

        // ---- Nested Loop

        /*
        In,Java we have an if .. else if ladder that can be used to execute one block
         of code among multiple blocks nested loop means loop inside another loop
        */

        // You have to check which one is greatest among three numbers them using nested loop
        System.out.println("Enter values for a , b ,c : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        if(a>b){
//            System.out.println("a is greater than b");
//            if(a>c){
//                System.out.println("a is greater than c");
//                System.out.println(" a is greatest");
//            }
//            else {
//                System.out.println(" c is greater than a");
//                System.out.println(" c is greatest ");
//            }
//        }
//        else {
//            System.out.println("b is greater than a");
//            if(b>c){
//                System.out.println("b is greater than c");
//                System.out.println("b is greatest");
//            }else{
//                System.out.println(" c is greater than b");
//                System.out.println(" c is greatest");
//            }
//        }

        // --- Java Ternary Operator

        /*
        A ternary operator evaluates the test condition and executes a block of
        code base on the result of the condition
        the ternary operator can be used to replace certain types of if..else
        statements
        */

        // condition ? expression 1 : expression 2;

        // int max = a > b? a : b ;
        char max = a > b ? a > c ? 'a' : 'c' : b > a ? 'b' : 'c' ;
        System.out.println(max);

    }
}
