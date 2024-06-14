package loops;

import java.util.Scanner;

public class ForLoop {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        // Create a table using for loop
//        System.out.println("Enter number to obtain table : ");
//        int num = sc.nextInt();
//
//        for(int i = 1 ; i<=10;i++){
//            System.out.println(num + " * " + i + " = " + num*i );
//        }

        // find the sum of first n numbers
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int sum = 0 ;
        for (int i = 0 ; i <= n ;i++){
            sum += i ;
        }
        System.out.println(" Sum of first "+ n +" number is : " + sum );
    }
}
