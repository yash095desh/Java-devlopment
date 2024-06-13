package conditionalStatements;

import java.util.Scanner;

public class switchStatement {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day as a num");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("This is Sunday");
                break;
            case 2:
                System.out.println("This is Monday");
                break;
            case 3:
                System.out.println("This is Tuesday");
                break;
            case 4:
                System.out.println("This is Wednesday");
                break;
            case 5:
                System.out.println("This is Thursday");
                break;
            case 6:
                System.out.println("This is Friday");
                break;
            case 7:
                System.out.println("This is Saturday");
                break;
            default:
                System.out.println("Not a valid day");
        }
    }
}
