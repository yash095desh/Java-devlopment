public class Variables {
    public static void main ( String[] args){
        boolean isAdmin = true;
        byte marks = 70;
        short rank = 15000;
        int rollNo = 45500505;
        long diseCode = 123456765434453L;
        float Cgpa = 8.2f;
        double pi = 3.1423282;
        char Symbol = '@';

        // Data Type Implicit Conversion
        /*
        Data type implicit conversion means converting a data type to another directly

           byte - > short
           char -> int
           short -> int -> double
           int -> long -> float -> boolean
           int -> long ->double
         */
        byte num = 28;
        int numInt = num ;
        System.out.println(numInt);
        /*
         Data Types Explicit Conversion

            int age = 12;
            short newAge = (short) age;
            It is done manually by the programmer . If we do not perform casting then the complier reports a compiler-time error.

        */
            int age = 12;
            short newAge = (short) age;

            int balls = 4;
            byte ballsByte = (byte) balls;
        System.out.println(newAge);
    }
}
