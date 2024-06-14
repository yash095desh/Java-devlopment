package loops;

import java.util.Scanner;

public class NestedLoop {
    public static void main( String[] args){
        // break and Continue

        // If a loop exists inside the body of another loop it's called a nested loop.

        // print a traingle by taking number as an input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int num = sc.nextInt();
//        for (int i = 1; i <= num ; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Labelled break and Continue
        // By providing label to outerloop we can break and continue inner loop or other loop

        Outerloop:
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                if(i == 5){
                    break Outerloop;
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
