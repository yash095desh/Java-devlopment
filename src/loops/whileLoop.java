package loops;

public class whileLoop {
    public static void main (String[] args){
    // while Loop

    // In while loop initialization take place outside the body and updation inside the body.
    // Most simpler form of loop
        int i = 0;
        while (i<=5){
            System.out.println(i);
            i++ ;
        }


    // do-while Loop
    // In do while loop first code is executed then condition is checked means must execute one time.
        int j = 0;
        do{
            System.out.println(j);
            j++;
        }while (j<5);

    }
}
