package basic2;
import java.util.Scanner;

public class UserInput {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
       /* System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        System.out.println("Your age is  "+ age);*/

        System.out.println("Enter first number");
        int fNumber = sc.nextInt();
        System.out.println("Enter Second number");
        int SNumber = sc.nextInt();
        System.out.println("Result : " + (fNumber + SNumber));

    }
}
