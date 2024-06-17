package String;

public class StringBasics {
    public static void main(String[] args) {
        // String
        // -- In Java, String is basically an object that represents a sequence of char values
        // An array of characters works as Java String

        // Creating a String
        //1. By String literal
        String name = "Yash" ;
        String newName = "Yash" ;

        //2. By new Keyword
        String name1 = new String("Yash") ;

        System.out.println(name);
        System.out.println(name1);



        // Comparing strings
        if(name == name1){
            System.out.println("Both are similar");
        }else{
            System.out.println("Both are different");
        }
        //this code returns false because == checks the if the instance of String in Heap Stroage are same and we know that by creating string using new String method creates another instance outside the String Constant pool
        if(name == newName){
            System.out.println("Both are similar");
        }else{
            System.out.println("Both are different");
        }// this code return true

        // equals method ()
        //Compares original content of the string
        if(name.equals(name1)){
            System.out.println("Both are similar");
        }else{
            System.out.println("Both are different");
        }

        //equalIgnoreCase() -- compares the string original content ignoring the original content

        if(name.equalsIgnoreCase("YASH")){
            System.out.println("Both are similar");
        }else{
            System.out.println("Both are different");
        }

    }
}
