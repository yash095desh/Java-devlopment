package loops;

public class BreakAndContinue {
    public static void main (String[] args){
        // Break
        //Used to exit a loop

        for (int i = 0 ; i<=5 ; i++){
            System.out.println(i);
            if(i == 3) break;
        }

        // Continue
        // Used to skip execution of code at specific condition

        for (int i = 0 ; i<=10 ; i++){
            if( i == 2)continue;
            System.out.println("Giving Choclate to " + i);
        }

    }
}
